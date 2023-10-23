/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.xingzhi.robot.model


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param ctrlNo 控制号[id]
 * @param title 题名[sm]
 * @param subTitle 次要题名
 * @param author 责任人[bianzh]
 * @param subAuthor 次要责任人[yizh]
 * @param price 价格[dj]
 * @param stdNum 标准号(ISBN/ISSN)
 * @param publisher 出版社
 * @param pubDate 出版日期[cbny]
 * @param pubLocale 出版地
 * @param clc 中图分类号[cip]
 * @param section 分册
 * @param language 语种
 * @param edition 版次[bc]
 * @param subjects 主题词（分类[fl_txt]）
 * @param series 丛书名
 * @param copyLent 借出册数
 * @param copyTotal 总册数
 * @param cover 封面
 * @param stockCount 库存册数[kccs]
 */
@Serializable

data class BaseCtrlInfoDto (

    /* 控制号[id] */
    @SerialName(value = "ctrlNo")
    val ctrlNo: kotlin.String,

    /* 题名[sm] */
    @SerialName(value = "title")
    val title: kotlin.String? = null,

    /* 次要题名 */
    @SerialName(value = "subTitle")
    val subTitle: kotlin.String? = null,

    /* 责任人[bianzh] */
    @SerialName(value = "author")
    val author: kotlin.String? = null,

    /* 次要责任人[yizh] */
    @SerialName(value = "subAuthor")
    val subAuthor: kotlin.String? = null,

    /* 价格[dj] */
    @SerialName(value = "price")
    val price: kotlin.String? = null,

    /* 标准号(ISBN/ISSN) */
    @SerialName(value = "stdNum")
    val stdNum: kotlin.String? = null,

    /* 出版社 */
    @SerialName(value = "publisher")
    val publisher: kotlin.String? = null,

    /* 出版日期[cbny] */
    @SerialName(value = "pubDate")
    val pubDate: kotlin.String? = null,

    /* 出版地 */
    @SerialName(value = "pubLocale")
    val pubLocale: kotlin.String? = null,

    /* 中图分类号[cip] */
    @SerialName(value = "clc")
    val clc: kotlin.String? = null,

    /* 分册 */
    @SerialName(value = "section")
    val section: kotlin.String? = null,

    /* 语种 */
    @SerialName(value = "language")
    val language: kotlin.String? = null,

    /* 版次[bc] */
    @SerialName(value = "edition")
    val edition: kotlin.String? = null,

    /* 主题词（分类[fl_txt]） */
    @SerialName(value = "subjects")
    val subjects: kotlin.String? = null,

    /* 丛书名 */
    @SerialName(value = "series")
    val series: kotlin.String? = null,

    /* 借出册数 */
    @SerialName(value = "copyLent")
    val copyLent: kotlin.Int? = null,

    /* 总册数 */
    @SerialName(value = "copyTotal")
    val copyTotal: kotlin.Int? = null,

    /* 封面 */
    @SerialName(value = "cover")
    val cover: kotlin.String? = null,

    /* 库存册数[kccs] */
    @SerialName(value = "stockCount")
    val stockCount: kotlin.Int? = null

)
