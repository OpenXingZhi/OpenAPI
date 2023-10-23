package com.xingzhi.robot.api

import com.xingzhi.robot.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

import com.xingzhi.robot.model.FullCtrlInfoDto
import com.xingzhi.robot.model.SearchInfoDto
import com.xingzhi.robot.model.ShelfInfoDtoResponse

interface OPACApi {
    /**
     * 根据控制号查询书⽬控制信息(包含对应的资产信息)
     * 
     * Responses:
     *  - 200: Success
     *
     * @param ctrlNo 控制号
     * @param apiVersion  (optional)
     * @return [FullCtrlInfoDto]
     */
    @GET("api/OPAC/ctrl_full/{ctrlNo}")
    suspend fun apiOPACCtrlFullCtrlNoGet(@Path("ctrlNo") ctrlNo: kotlin.String, @Header("api-version") apiVersion: kotlin.String? = null): Response<FullCtrlInfoDto>

    /**
     * 查询图书信息
     * 
     * Responses:
     *  - 200: Success
     *
     * @param q 搜索内容 (optional)
     * @param offset 当前页起始序号 (optional)
     * @param limit 每页数量 (optional)
     * @param apiVersion  (optional)
     * @return [SearchInfoDto]
     */
    @POST("api/OPAC/Search")
    suspend fun apiOPACSearchPost(@Query("q") q: kotlin.String? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Header("api-version") apiVersion: kotlin.String? = null): Response<SearchInfoDto>

    /**
     * 根据 Id 获得书架信息
     * 
     * Responses:
     *  - 200: Success
     *
     * @param id 架位号
     * @param apiVersion  (optional)
     * @return [ShelfInfoDtoResponse]
     */
    @GET("api/OPAC/shelf/{id}")
    suspend fun apiOPACShelfIdGet(@Path("id") id: kotlin.Int, @Header("api-version") apiVersion: kotlin.String? = null): Response<ShelfInfoDtoResponse>

}
