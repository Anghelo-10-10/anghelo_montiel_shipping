package com.shipping.shipping.models.entities

enum class Type(val value: String) {
    DOCUMENT("D"),
    SMALL_BOX("SB"),
    FRAGILE("F")
}

enum class Status(val value: String) {
    PENDING("P"),
    IN_TRANSIT("IT"),
    DELIVERED("D"),
    ON_HOLD("OH"),
    CANCELLED("C")
}