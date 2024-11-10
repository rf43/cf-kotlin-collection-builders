package io.cursedfunction.runner2

import io.cursedfunction.data.ncaaDiv1FootballMap

fun main() {
    println()
    buildPrintList(
        conferenceWithSchools = ncaaDiv1FootballMap,
    ).forEach(::println)
}


