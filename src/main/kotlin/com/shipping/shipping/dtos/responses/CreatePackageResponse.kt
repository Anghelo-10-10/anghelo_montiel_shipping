package com.shipping.shipping.dtos.responses

data class CreatePackageResponse(
    val message: String,
    val trackingId: String,
    val packageInfo: PackageResponse
)