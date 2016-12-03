package com.fedming.gdoulife.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.fedming.gdoulife.R;
import com.fedming.gdoulife.adapter.BaseRecycleViewHolderView;
import com.fedming.gdoulife.adapter.BooksRecyclerViewAdapter;
import com.fedming.gdoulife.app.AppConfig;
import com.fedming.gdoulife.biz.BooksItemBiz;
import com.fedming.gdoulife.utils.LogUtil;
import com.fedming.gdoulife.utils.StringUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import okhttp3.Call;

public class BookSearchResultActivity extends BaseActivity {

    private ProgressBar progressBar;
    private RecyclerView booksItemRecyclerView;
    private BooksRecyclerViewAdapter booksRecyclerViewAdapter;

    private String keyWord = "";
    private int currentPage = 1;
    private List<Map<String, String>> booksList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_search_result);

        context = this;
        keyWord = getIntent().getExtras().getString("keyWord");

        initView();
        initData(currentPage);
    }


    private void initView() {

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle(String.format("关键词：%s", keyWord));
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        booksItemRecyclerView = (RecyclerView) findViewById(R.id.book_item_recyclerView);
        booksItemRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        booksRecyclerViewAdapter = new BooksRecyclerViewAdapter();
        booksItemRecyclerView.setAdapter(booksRecyclerViewAdapter);
    }

    private void initData(int booksPage) {

        if (!StringUtils.isFine(keyWord)) {
            return;
        }

        String searchLink =
                String.format(Locale.CHINA, "%s%s%s%d%s"
                        , AppConfig.SEARCH_URL_PART1, StringUtils.URLEncode(keyWord), AppConfig.SEARCH_URL_PART2, booksPage, AppConfig.SEARCH_URL_PART3);

        LogUtil.i(searchLink);

        OkHttpUtils
                .get()
                .url(searchLink)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        progressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        progressBar.setVisibility(View.GONE);

                        refreshView(response);
                    }
                });
    }

    private void refreshView(String response) {

        booksList.addAll(BooksItemBiz.parseBooksItem(response));

        booksRecyclerViewAdapter.addDatas(booksList);
        booksRecyclerViewAdapter.setItemClickListener(new BaseRecycleViewHolderView.MyItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                String bookLink = booksList.get(position).get("bookLink");

                if (StringUtils.isFine(bookLink)) {
                    Intent intent = new Intent(context, BookDetailActivity.class);
                    intent.putExtra("bookLink", bookLink);
                    startActivity(intent);
                }
            }
        });
        booksItemRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {

                LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    int lastVisibleItem = manager.findLastCompletelyVisibleItemPosition();
                    int totalItem = manager.getItemCount();
                    if (lastVisibleItem >= (totalItem - 4)) {
                        currentPage++;
                        initData(currentPage);
                    }
                }
                super.onScrollStateChanged(recyclerView, newState);
            }
        });
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
