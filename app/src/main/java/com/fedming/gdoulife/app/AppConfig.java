package com.fedming.gdoulife.app;

/**
 * Created by Bruce on 2016/10/11.
 */

public class AppConfig {

    //新闻URL：
    public static String NEWS_BASE_URL = "http://news.gdou.edu.cn";
    /**
     * 综合要闻
     */
    public static String NEWS_ZONGHE = String.format("%s%s", NEWS_BASE_URL, "/list.php?catid=18");
    /**
     * 科教动态
     */
    public static String NEWS_KEJIAO = String.format("%s%s", NEWS_BASE_URL, "/list.php?catid=19");
    /**
     * 校园快讯
     */
    public static String NEWS_XIAOYUAN = String.format("%s%s", NEWS_BASE_URL, "/list.php?catid=53");
    /**
     * 公示公告
     */
    public static String NEWS_GONGGAO = String.format("%s%s", NEWS_BASE_URL, "/list.php?catid=63");

    /**
     * 移动版图书馆首页
     */
    public static String LIBRARY_HOME = "http://210.38.138.7:8080/sms/opac/search/showSearch.action?xc=6";

    /**
     * 图书馆搜索URL part1
     */
    public static String SEARCH_URL_PART1 = "http://210.38.138.7:8080/search?kw=";

    /**
     * 图书馆搜索URL part2
     */
    public static String SEARCH_URL_PART2 = "&searchtype=&marcformat=&page=";

    /**
     * 图书馆搜索URL part3
     */
    public static String SEARCH_URL_PART3 = "&xc=6";

    /**
     * 图书馆登录URL(Web版)
     */
    public static String LOGIN_LIBRARY_URL = "http://210.38.138.8:8080/opac/reader/doLogin";
    public static String LIBRARY_RENEW_URL = "http://210.38.138.8:8080/opac/loan/doRenew";
    public static String LIBRARY_FURL = "/opac/loan/renewList";
    public static String LIBRARY_USER_CENTER_URL = "http://210.38.138.8:8080/opac/reader/space";
    public static String USER_ARGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";

    /**
     * 正方系统URL
     */
    public static String HOST = "210.38.137.126:8016";
    public static String REFERER = "http://210.38.137.126:8016/";
    public static String URL_CODE = "http://210.38.137.126:8016/CheckCode.aspx";
    public static String URL_LOGIN = "http://210.38.137.126:8016/default2.aspx";
    public static String VIEWSTATELONG = "dDwtMTAwODg3NDc5ODt0PHA8bDxTb3J0RXhwcmVzO3NmZGNiaztkZzM7ZHlieXNjajtTb3J0RGlyZTt4aDtzdHJfdGFiX2JqZztjamN4X2xzYjt6eGNqY3h4czs+O2w8a2NtYztcZTtiamc7MTthc2M7MjAxMzExNjcxMTAzO3pmX2N4Y2p0al8yMDEzMTE2NzExMDM7OzA7Pj47bDxpPDE+Oz47bDx0PDtsPGk8ND47aTwxMD47aTwxOT47aTwyND47aTwzMj47aTwzND47aTwzNj47aTwzOD47aTw0MD47aTw0Mj47aTw0ND47aTw0Nj47aTw0OD47aTw1Mj47aTw1ND47aTw1Nj47PjtsPHQ8dDxwPHA8bDxEYXRhVGV4dEZpZWxkO0RhdGFWYWx1ZUZpZWxkOz47bDxYTjtYTjs+Pjs+O3Q8aTw0PjtAPFxlOzIwMTUtMjAxNjsyMDE0LTIwMTU7MjAxMy0yMDE0Oz47QDxcZTsyMDE1LTIwMTY7MjAxNC0yMDE1OzIwMTMtMjAxNDs+Pjs+Ozs+O3Q8dDxwPHA8bDxEYXRhVGV4dEZpZWxkO0RhdGFWYWx1ZUZpZWxkOz47bDxrY3h6bWM7a2N4emRtOz4+Oz47dDxpPDU+O0A85b+F5L+uO+mZkOmAiTvku7vpgIk75LiT5Lia5Lu76YCJO1xlOz47QDwwMTswMjswMzswNDtcZTs+Pjs+Ozs+O3Q8cDxwPGw8VmlzaWJsZTs+O2w8bzxmPjs+Pjs+Ozs+O3Q8cDxwPGw8VmlzaWJsZTs+O2w8bzxmPjs+Pjs+Ozs+O3Q8cDxwPGw8VmlzaWJsZTs+O2w8bzxmPjs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w8XGU7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7VmlzaWJsZTs+O2w85a2m5Y+377yaMjAxMzExNjcxMTAzO288dD47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7VmlzaWJsZTs+O2w85aeT5ZCN77ya5Yav5b635piOO288dD47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7VmlzaWJsZTs+O2w85a2m6Zmi77ya5pWw5a2m5LiO6K6h566X5py65a2m6ZmiO288dD47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7VmlzaWJsZTs+O2w85LiT5Lia77yaO288dD47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7VmlzaWJsZTs+O2w85L+h5oGv566h55CG5LiO5L+h5oGv57O757ufO288dD47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPOS4k+S4muaWueWQkTrkv6Hmga/ns7vnu5/lvIDlj5E7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7VmlzaWJsZTs+O2w86KGM5pS/54+t77ya5L+h566hMTEzMTtvPHQ+Oz4+Oz47Oz47dDxAMDxwPHA8bDxWaXNpYmxlOz47bDxvPGY+Oz4+Oz47Ozs7Ozs7Ozs7Pjs7Pjt0PDtsPGk8MT47aTwzPjtpPDU+O2k8Nz47aTw5PjtpPDEzPjtpPDE1PjtpPDE3PjtpPDIxPjtpPDIzPjtpPDI0PjtpPDI1PjtpPDI3PjtpPDI5PjtpPDMxPjtpPDMzPjtpPDM1PjtpPDQzPjtpPDQ5PjtpPDUxPjtpPDUyPjs+O2w8dDxwPHA8bDxWaXNpYmxlOz47bDxvPGY+Oz4+Oz47Oz47dDxAMDxwPHA8bDxWaXNpYmxlOz47bDxvPGY+Oz4+O3A8bDxzdHlsZTs+O2w8RElTUExBWTpub25lOz4+Pjs7Ozs7Ozs7Ozs+Ozs+O3Q8O2w8aTwxMz47PjtsPHQ8QDA8Ozs7Ozs7Ozs7Oz47Oz47Pj47dDxwPHA8bDxUZXh0O1Zpc2libGU7PjtsPOiHs+S7iuacqumAmui/h+ivvueoi+aIkOe7qe+8mjtvPHQ+Oz4+Oz47Oz47dDxAMDxwPHA8bDxQYWdlQ291bnQ7XyFJdGVtQ291bnQ7XyFEYXRhU291cmNlSXRlbUNvdW50O0RhdGFLZXlzOz47bDxpPDE+O2k8MD47aTwwPjtsPD47Pj47cDxsPHN0eWxlOz47bDxESVNQTEFZOmJsb2NrOz4+Pjs7Ozs7Ozs7Ozs+Ozs+O3Q8QDA8cDxwPGw8VmlzaWJsZTs+O2w8bzxmPjs+PjtwPGw8c3R5bGU7PjtsPERJU1BMQVk6bm9uZTs+Pj47Ozs7Ozs7Ozs7Pjs7Pjt0PEAwPDs7Ozs7Ozs7Ozs+Ozs+O3Q8QDA8cDxwPGw8VmlzaWJsZTs+O2w8bzxmPjs+PjtwPGw8c3R5bGU7PjtsPERJU1BMQVk6bm9uZTs+Pj47Ozs7Ozs7Ozs7Pjs7Pjt0PEAwPDs7Ozs7Ozs7Ozs+Ozs+O3Q8QDA8cDxwPGw8VmlzaWJsZTs+O2w8bzxmPjs+PjtwPGw8c3R5bGU7PjtsPERJU1BMQVk6bm9uZTs+Pj47Ozs7Ozs7Ozs7Pjs7Pjt0PEAwPHA8cDxsPFZpc2libGU7PjtsPG88Zj47Pj47cDxsPHN0eWxlOz47bDxESVNQTEFZOm5vbmU7Pj4+Ozs7Ozs7Ozs7Oz47Oz47dDxAMDxwPHA8bDxWaXNpYmxlOz47bDxvPGY+Oz4+Oz47Ozs7Ozs7Ozs7Pjs7Pjt0PEAwPHA8cDxsPFZpc2libGU7PjtsPG88Zj47Pj47cDxsPHN0eWxlOz47bDxESVNQTEFZOm5vbmU7Pj4+Ozs7Ozs7Ozs7Oz47Oz47dDxAMDxwPHA8bDxWaXNpYmxlOz47bDxvPGY+Oz4+O3A8bDxzdHlsZTs+O2w8RElTUExBWTpub25lOz4+Pjs7Ozs7Ozs7Ozs+Ozs+O3Q8QDA8O0AwPDs7QDA8cDxsPEhlYWRlclRleHQ7PjtsPOWIm+aWsOWGheWuuTs+Pjs7Ozs+O0AwPHA8bDxIZWFkZXJUZXh0Oz47bDzliJvmlrDlrabliIY7Pj47Ozs7PjtAMDxwPGw8SGVhZGVyVGV4dDs+O2w85Yib5paw5qyh5pWwOz4+Ozs7Oz47Ozs+Ozs7Ozs7Ozs7Pjs7Pjt0PHA8cDxsPFRleHQ7VmlzaWJsZTs+O2w85pys5LiT5Lia5YWxMTA05Lq6O288Zj47Pj47Pjs7Pjt0PHA8cDxsPFZpc2libGU7PjtsPG88Zj47Pj47Pjs7Pjt0PHA8cDxsPFZpc2libGU7PjtsPG88Zj47Pj47Pjs7Pjt0PHA8cDxsPFZpc2libGU7PjtsPG88Zj47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7PjtsPEhIWFk7Pj47Pjs7Pjt0PHA8cDxsPEltYWdlVXJsOz47bDwuL2V4Y2VsLzIwMTMxMTY3MTEwMy5qcGc7Pj47Pjs7Pjs+Pjt0PDtsPGk8Mz47PjtsPHQ8QDA8Ozs7Ozs7Ozs7Oz47Oz47Pj47Pj47Pj47PgRcZ1J4UkW3Hrri8F7Nay1fEprR";

}
