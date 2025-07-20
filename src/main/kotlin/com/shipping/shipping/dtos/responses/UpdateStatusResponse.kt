package com.shipping.shipping.dtos.responses

import java.time.LocalDateTime

data class UpdateStatusResponse(
    val message: String,
    val trackingId: String,
    val newStatus: String,
    val updatedAt: LocalDateTime
)