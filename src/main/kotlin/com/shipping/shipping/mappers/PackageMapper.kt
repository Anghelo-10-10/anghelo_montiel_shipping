package com.shipping.shipping.mappers

import com.shipping.shipping.dtos.requests.CreatePackageRequests
import com.shipping.shipping.models.entities.Package
import com.shipping.shipping.models.entities.Status
import com.shipping.shipping.dtos.responses.CreatePackageResponse
import com.shipping.shipping.dtos.responses.PackageDetailResponse
import com.shipping.shipping.dtos.responses.PackageResponse
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class PackageMapper {

    fun toEntity(request: CreatePackageRequests, trackingId: String): Package {
        return Package(
            trackingId = trackingId,
            type = request.type,
            weight = request.weight,
            description = request.description,
            cityFrom = request.cityFrom,
            cityTo = request.cityTo,
            estimatedDeliveryDate = LocalDateTime.now().plusDays(5)
        )
    }

    fun toResponse(entity: Package): PackageResponse {
        return PackageResponse(
            id = entity.id,
            trackingId = entity.trackingId,
            type = entity.type,
            description = entity.description,
            weight = entity.weight,
            currentStatus = entity.currentStatus,
            cityFrom = entity.cityFrom,
            cityTo = entity.cityTo,
            createdAt = entity.createdAt,
            estimatedDeliveryDate = entity.estimatedDeliveryDate
        )
    }

    fun toCreateResponse(entity: Package): CreatePackageResponse {
        return CreatePackageResponse(
            message = "Package created successfully",
            trackingId = entity.trackingId,
            packageInfo = toResponse(entity)
        )
    }

    fun toDetailResponse(entity: Package, eventMapper: PackageEventMapper): PackageDetailResponse {
        return PackageDetailResponse(
            packageInfo = toResponse(entity),
            statusHistory = entity.events.map { eventMapper.toResponse(it) }
        )
    }
}