package com.fedming.gdoulife.biz;

import android.support.annotation.Nullable;

import com.fedming.gdoulife.utils.StringUtils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 解析新闻内容的业务类
 * Created by Bruce on 2016/10/11.
 */

public class NewsItemBiz {

    @Nullable
    public static List<Map<String, String>> parseNewsItems(String htmlStr) {

        //如果htmlStr为空，直接返回
        if (!StringUtils.isFine(htmlStr)) {
            return null;
        }
        List<Map<String, String>> newsList = new ArrayList<>();

        try {
            Document doc = Jsoup.parse(htmlStr);
            Elements div_main = doc.select("div.mar_10");
            Elements elements = div_main.select("li");
            for (int i = 0; i < elements.size(); i++) {

                final Map<String, String> map = new HashMap<>();

                Element element = elements.get(i);
                // 获取新闻发布时间
                String date = element.getElementsByTag("span").text();

                //获取新闻当前阅读数
                String readNo = element.getElementsByTag("font").text();
                String regEx = "[^0-9]";
                Pattern p = Pattern.compile(regEx);
                Matcher m = p.matcher(readNo);
                String number = m.replaceAll("").trim();

                // 获取新闻标题及文章链接
                Element newsStr = element.select("a[href]").get(0);
                String title = newsStr.text();
                final String href = newsStr.attr("abs:href");

                map.put("date", date);
                map.put("number", number);
                map.put("title", title);
                map.put("href", href);

//                OkHttpUtils
//                        .get()
//                        .url(href)
//                        .build()
//                        .execute(new StringCallback() {
//                            @Override
//                            public void onError(Call call, Exception e, int id) {
//                            }
//
//                            @Override
//                            public void onResponse(String response, int id) {
//
//                                // 获取新闻图片链接
//                                Document doc = Jsoup.parse(response);
//                                Elements img = doc.select("div#endtext img[src]");
//                                String imgLink = img.attr("abs:src");
//                                map.put("imgLink", imgLink);
//                                LogUtil.i("imgLink："+imgLink);
//                            }
//                        });

                newsList.add(map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return newsList;
    }
}
