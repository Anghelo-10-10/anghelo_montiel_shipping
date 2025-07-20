package com.shipping.shipping.mappers

import com.shipping.shipping.dtos.requests.UpdatePackageStatusRequest
import com.shipping.shipping.dtos.responses.PackageEventResponse
import com.shipping.shipping.models.entities.PackageEvent
import com.shipping.shipping.models.entities.Package
import org.springframework.stereotype.Component

@Component
class PackageEventMapper {

    fun toEntity(request: UpdatePackageStatusRequest, packageEntity: Package): PackageEvent {
        return PackageEvent(
            status = request.status,
            comment = request.comment,
            packageEntity = packageEntity
        )
    }

    fun toResponse(entity: PackageEvent): PackageEventResponse {
        return PackageEventResponse(
            id = entity.id,
            status = entity.status,
            comment = entity.comment,
            createdAt = entity.createdAt
        )
    }
}