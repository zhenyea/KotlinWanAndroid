package com.wl.wanandroid.retrofit

import com.wl.wanandroid.bean.*
import com.wl.wanandroid.utils.AppConstants
import com.wl.wanandroid.utils.AppConstants.HOT_SEARCH_URL
import com.wl.wanandroid.utils.AppConstants.PROJECT_TREE_URL
import com.wl.wanandroid.utils.AppConstants.SYSTEM_TREE_URL
import retrofit2.http.*
import rx.Observable


interface  RetrofitService{
    @GET(AppConstants.BANNER_URL)
    fun getBannerData():Observable<BannerBean>//获取banner

    @GET(AppConstants.PUBLIC_NUMBER_LIST_URL)
    fun getPublicNumberList():Observable<PublicNumberListBean>//获取首页公众号列表

    @GET("article/list/{page}/json")
    fun getHomeArticles(@Path("page")page: String):Observable<HomeArticleBean>//获取首页蚊帐列表

    @GET(PROJECT_TREE_URL)
    fun getSystemTrees():Observable<ProjectTreeBean> //获取项目类别

    @GET("project/list/{page}/json")
    fun getProjectArticles(@Path("page")page:String,@Query("cid")projectTreeId:String):Observable<ProjectArticleBean>

    @GET(SYSTEM_TREE_URL)
    fun getSystemTree():Observable<SystemTreeBean>//获得体系类别

    @GET(HOT_SEARCH_URL)
    fun getHotSearch():Observable<HotSearchBean>//获取热搜

    @POST("article/query/{page}/json")
    fun startSearch(@Path("page")page: String,@Query("k")key:String):Observable<SearchResultBean>//搜索


    @GET("wxarticle/list/{id}/{page}/json")
    fun getPublicNumber(@Path("id")id: String,@Path("page")page:String):Observable<PublicNumberArticleBean>//公众号文章列表


    @GET("article/list/{page}/json")
    fun getSystemChildArticles(@Path("page")page:String,@Query("cid")cid:String):Observable<SystemChildArticleBean>//获取体系下的文章

    @POST("user/login")
    fun startLogin(@Query("username")username:String,@Query("password")password:String):Observable<LoginBean>//登录

    @POST("user/register")
    fun startSign(@Query("username")username: String,@Query("password")password:String,@Query("repassword")repassword:String):Observable<SignBean>


}