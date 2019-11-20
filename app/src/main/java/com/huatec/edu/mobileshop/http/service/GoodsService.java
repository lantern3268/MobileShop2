package com.huatec.edu.mobileshop.http.service;

import com.huatec.edu.mobileshop.http.entity.GoodsEntity;
import com.huatec.edu.mobileshop.http.entity.HttpResult;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface GoodsService {
    @FormUrlEncoded
    @POST("goods/find")
    rx.Observable<HttpResult<List<GoodsEntity>>> listByKeyword(
            @Field("input") String keywords
    );

    Observable<HttpResult<List<GoodsEntity>>> list(int catId);
}
