package io.cursedfunction.runner3

import io.cursedfunction.data.ncaaDiv1FootballMap

fun main() {
    val result = buildPrintList(
        conferenceWithSchools = ncaaDiv1FootballMap
    )

    (result as MutableList<String>)[0] = "FAKE CONFERENCE!!!"

    println()
    result.forEach(::println)
}
