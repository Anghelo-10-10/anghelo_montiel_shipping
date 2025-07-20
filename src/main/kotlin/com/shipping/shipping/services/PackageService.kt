package com.shipping.shipping.services

import com.shipping.shipping.dtos.requests.CreatePackageRequests
import com.shipping.shipping.dtos.requests.UpdatePackageStatusRequest
import com.shipping.shipping.dtos.responses.CreatePackageResponse
import com.shipping.shipping.dtos.responses.PackageDetailResponse
import com.shipping.shipping.dtos.responses.PackageResponse
import com.shipping.shipping.dtos.responses.UpdateStatusResponse


interface PackageService {

    fun createPackage(request: CreatePackageRequests): CreatePackageResponse

    fun getAllPackages(): List<PackageResponse>

    fun getPackageByTrackingId(trackingId: String): PackageResponse

    fun getPackageWithHistory(trackingId: String): PackageDetailResponse

    fun updatePackageStatus(trackingId: String, request: UpdatePackageStatusRequest): UpdateStatusResponse
}