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
 * @param id 架位号[hw]
 * @param uid RFID UID
 * @param name 架位名称
 * @param navId 导航 ID
 * @param description 架位描述
 */
@Serializable

data class ShelfInfoDto (

    /* 架位号[hw] */
    @SerialName(value = "id")
    val id: kotlin.String,

    /* RFID UID */
    @SerialName(value = "uid")
    val uid: kotlin.String? = null,

    /* 架位名称 */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* 导航 ID */
    @SerialName(value = "navId")
    val navId: kotlin.String? = null,

    /* 架位描述 */
    @SerialName(value = "description")
    val description: kotlin.String? = null

)
