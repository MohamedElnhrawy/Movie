package com.example.core.remote.parser

import java.util.Date

// used to send time and date to BE, because BE developers didn't agree on one date format,
// so we have to compromise from our side
data class DateAndTime(
    val date: Date,
)
