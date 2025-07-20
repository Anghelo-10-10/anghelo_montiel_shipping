package com.shipping.shipping.dtos.responses

import com.shipping.shipping.models.entities.Status
import java.time.LocalDateTime

data class PackageEventResponse(
    val id: Long,
    val status: Status,
    val comment: String?,
    val createdAt: LocalDateTime
)