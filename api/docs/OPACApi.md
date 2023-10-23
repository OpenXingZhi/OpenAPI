# OPACApi

All URIs are relative to *http://10.147.19.177*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiOPACCtrlFullCtrlNoGet**](OPACApi.md#apiOPACCtrlFullCtrlNoGet) | **GET** api/OPAC/ctrl_full/{ctrlNo} | 根据控制号查询书⽬控制信息(包含对应的资产信息)
[**apiOPACSearchPost**](OPACApi.md#apiOPACSearchPost) | **POST** api/OPAC/Search | 查询图书信息
[**apiOPACShelfIdGet**](OPACApi.md#apiOPACShelfIdGet) | **GET** api/OPAC/shelf/{id} | 根据 Id 获得书架信息



根据控制号查询书⽬控制信息(包含对应的资产信息)

### Example
```kotlin
// Import classes:
//import com.xingzhi.robot.*
//import com.xingzhi.robot.infrastructure.*
//import com.xingzhi.robot.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OPACApi::class.java)
val ctrlNo : kotlin.String = ctrlNo_example // kotlin.String | 控制号
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : FullCtrlInfoDto = webService.apiOPACCtrlFullCtrlNoGet(ctrlNo, apiVersion)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctrlNo** | **kotlin.String**| 控制号 |
 **apiVersion** | **kotlin.String**|  | [optional]

### Return type

[**FullCtrlInfoDto**](FullCtrlInfoDto.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


查询图书信息

### Example
```kotlin
// Import classes:
//import com.xingzhi.robot.*
//import com.xingzhi.robot.infrastructure.*
//import com.xingzhi.robot.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OPACApi::class.java)
val q : kotlin.String = q_example // kotlin.String | 搜索内容
val offset : kotlin.Int = 56 // kotlin.Int | 当前页起始序号
val limit : kotlin.Int = 56 // kotlin.Int | 每页数量
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : SearchInfoDto = webService.apiOPACSearchPost(q, offset, limit, apiVersion)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| 搜索内容 | [optional]
 **offset** | **kotlin.Int**| 当前页起始序号 | [optional]
 **limit** | **kotlin.Int**| 每页数量 | [optional]
 **apiVersion** | **kotlin.String**|  | [optional]

### Return type

[**SearchInfoDto**](SearchInfoDto.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


根据 Id 获得书架信息

### Example
```kotlin
// Import classes:
//import com.xingzhi.robot.*
//import com.xingzhi.robot.infrastructure.*
//import com.xingzhi.robot.model.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OPACApi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | 架位号
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : ShelfInfoDtoResponse = webService.apiOPACShelfIdGet(id, apiVersion)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| 架位号 |
 **apiVersion** | **kotlin.String**|  | [optional]

### Return type

[**ShelfInfoDtoResponse**](ShelfInfoDtoResponse.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

