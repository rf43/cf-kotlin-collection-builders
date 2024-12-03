package io.cursedfunction.runner3

import io.cursedfunction.data.conf_models.accConference
import io.cursedfunction.data.conf_models.accSchools
import io.cursedfunction.data.conf_models.secConference
import io.cursedfunction.data.conf_models.secSchools

fun main() {
    println()

    buildPrintList(
        conferenceModel = accConference,
        schoolModels = accSchools,
    ).forEach(::println)

    buildPrintList(
        conferenceModel = secConference,
        schoolModels = secSchools,
    ).forEach(::println)
}
