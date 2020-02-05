package com.wl.wanandroid.retrofit

import com.wl.wanandroid.bean.BannerBean
import com.wl.wanandroid.utils.AppConstants
import org.json.JSONObject
import retrofit2.http.*
import rx.Observable


interface  RetrofitService{
    @GET(AppConstants.BANNER_URL)
    fun getBannerData():Observable<BannerBean>


}