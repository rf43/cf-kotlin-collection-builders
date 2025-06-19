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
    // because the list that is returned is not a MutableList
    // it is an ImmutableList (actually PersistentList) from the
    // kotlinx.collections.immutable package, which is not a subtype
    // of MutableList. It is more a sibling of MutableList in the type hierarchy.
    (secResult as MutableList<String>).set(0, "FAKE CONFERENCE!!!")


    // However, this will trick you into thinking it works
    // because the ClassCastException will be swallowed by
    // the nullable cast failure, but it will actually do nothing
    // and leave you disappointed.
    (secResult as? MutableList<String>)?.set(0, "FAKE CONFERENCE!!!")

    accResult.forEach(::println)
    secResult.forEach(::println)
    println()
}
