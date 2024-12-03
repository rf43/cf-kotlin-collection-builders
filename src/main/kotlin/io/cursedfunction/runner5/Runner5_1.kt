package io.cursedfunction.runner5

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

    // This will throw a ClassCastException runtime error
    (secResult as MutableList<String>)[0] = "FAKE CONFERENCE!!!"

    // This will trick you into thinking it will do something
    // but it will disappoint you and do nothing!
    (secResult as? MutableList<String>)?.set(0, "FAKE CONFERENCE!!!")

    println()
    accResult.forEach(::println)
    secResult.forEach(::println)
}
