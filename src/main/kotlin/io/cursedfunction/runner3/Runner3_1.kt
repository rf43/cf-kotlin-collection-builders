package io.cursedfunction.runner3

import io.cursedfunction.data.conf_models.accConference
import io.cursedfunction.data.conf_models.accSchools
import io.cursedfunction.data.conf_models.secConference
import io.cursedfunction.data.conf_models.secSchools

fun main() {
    val accResult = buildPrintList(
        conferenceModel = accConference,
        schoolModels = accSchools,
    )

    val secResult = buildPrintList(
        conferenceModel = secConference,
        schoolModels = secSchools,
    )

    // This will mutate the list and add "FAKE CONFERENCE!!!" to the front of the secResult list
    if (secResult is MutableList<String>) {
        secResult[0] = "FAKE CONFERENCE!!!"
    }

    println()
    accResult.forEach(::println)
    secResult.forEach(::println)
}
