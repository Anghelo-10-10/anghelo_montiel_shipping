package com.shipping.shipping.dtos.requests

import com.shipping.shipping.models.entities.Type

data class CreatePackageRequests(
    val type: Type,
    val weight: Float,
    val description: String,
    val cityFrom: String,
    val cityTo: String
)