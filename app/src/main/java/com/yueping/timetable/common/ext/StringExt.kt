package com.yueping.timetable.common.ext

fun String?.null2Empty(): String {
    if (this == null) {
        return ""
    }
    if (this.isBlank()) {
        return ""
    }
    if (this == "null") {
        return ""
    }
    return this
}
