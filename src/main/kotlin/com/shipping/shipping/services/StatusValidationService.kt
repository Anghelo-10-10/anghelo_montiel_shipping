package com.shipping.shipping.services

import com.shipping.shipping.models.entities.Status

interface StatusValidationService {

    fun isValidTransition(currentStatus: Status, newStatus: Status): Boolean

}