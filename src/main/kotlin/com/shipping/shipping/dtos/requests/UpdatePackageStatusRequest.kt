package com.shipping.shipping.dtos.requests

import com.shipping.shipping.models.entities.Status

data class UpdatePackageStatusRequest(
    val status: Status,
    val comment: String? = null
)