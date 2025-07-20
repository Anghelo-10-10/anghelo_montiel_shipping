package com.shipping.shipping.dtos.responses

data class PackageDetailResponse(
    val packageInfo: PackageResponse,
    val statusHistory: List<PackageEventResponse>
)