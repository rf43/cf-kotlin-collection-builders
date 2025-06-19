package io.cursedfunction.runner4

import io.cursedfunction.data.conf_models.accConference
import io.cursedfunction.data.conf_models.accSchools
import io.cursedfunction.data.conf_models.secConference
import io.cursedfunction.data.conf_models.secSchools

fun main() {
    runCatching { errorSetup() }.onFailure { stackTrace ->
        surpriseSetup()
        println()
        println("Error Setup Exception:")
        stackTrace.printStackTrace()
    }
}

// Running this function will result in an UnsupportedOperationException being thrown
// because the List<T> returned is not directly a MutableList
private fun errorSetup() {
    val accResult = buildPrintList(
        conferenceModel = accConference,
        schoolModels = accSchools,
    )

    val secResult = buildPrintList(
        conferenceModel = secConference,
        schoolModels = secSchools,
    )

    // This will result in an UnsupportedOperationException
    if (secResult is MutableList) {
        secResult[0] = "FAKE CONFERENCE!!!"
    }

    // This will also result in an UnsupportedOperationException
    (secResult as MutableList<String>)[0] = "FAKE CONFERENCE!!!"

    accResult.forEach(::println)
    secResult.forEach(::println)
}


// However, if you add .toList() to the end of the buildPrintList call,
// you will get a new List that is mutable and can be modified
private fun surpriseSetup() {
    val accResult = buildPrintList(
        conferenceModel = accConference,
        schoolModels = accSchools,
    )

    // However, if you were to add .toList() the result
    // it will allow you to modify the list
    val secResult = buildPrintList(
        conferenceModel = secConference,
        schoolModels = secSchools,
    ).toList()

    // Now this will work!
    if (secResult is MutableList) {
        secResult[0] = "FAKE CONFERENCE!!!"
    }

    // This will also work!
    (secResult as MutableList<String>)[0] = "FAKE CONFERENCE!!!"

    accResult.forEach(::println)
    secResult.forEach(::println)
}
