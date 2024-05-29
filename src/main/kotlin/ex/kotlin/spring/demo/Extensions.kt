package ex.kotlin.spring.demo

import java.time.LocalDateTime
import java.time.format.DateTimeFormatterBuilder
import java.util.*


fun LocalDateTime.format(): String = this.format(frenchDateFormatter)

private val frenchDateFormatter = DateTimeFormatterBuilder()
    .appendPattern("dd-MM-yyyy")
    .appendLiteral(" ")
    .toFormatter(Locale.FRENCH)