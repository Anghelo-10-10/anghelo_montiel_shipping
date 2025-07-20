package com.shipping.shipping.routes

object Routes {
    const val BASE_URL = "/shipping/api"
    const val PACKAGES = "/packages"
    const val TRACKING_ID = "/{trackingId}"
    const val PACKAGE_HISTORY = "/{trackingId}/history"
    const val PACKAGE_STATUS = "/{trackingId}/status"

}