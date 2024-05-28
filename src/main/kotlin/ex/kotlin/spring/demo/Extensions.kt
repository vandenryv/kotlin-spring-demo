package ex.kotlin.spring.demo

import java.time.LocalDateTime
import java.time.format.DateTimeFormatterBuilder
import java.util.*


fun LocalDateTime.format(): String = this.format(englishDateFormatter)

private val englishDateFormatter = DateTimeFormatterBuilder()
    .appendPattern("yyyy-MM-dd")
    .appendLiteral(" ")
    .toFormatter(Locale.FRENCH)