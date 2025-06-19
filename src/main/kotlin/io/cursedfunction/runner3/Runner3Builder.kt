package io.cursedfunction.runner3

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

// While we are using List<T> here, the list is not actually immutable.
// To see how it is possible to mutate the list that is returned,
// see the code and comments in Runner3_1.kt

internal fun buildPrintList(
    conferenceModel: ConferenceModel,
    schoolModels: List<SchoolModel>,
): List<String> {
    val result = mutableListOf<String>()

    result.add(conferenceModel.name)
    result.add(conferenceModel.abbr)

    result.add("---------------------------")

    schoolModels.mapIndexedTo(result) { idx, school ->
        "${idx + 1}. ${school.longName} - ${school.tricode} - ${school.nickname}"
    }

    result.add("---------------------------")

    if (conferenceModel.url != null) {
        result.add("URL: ${conferenceModel.url}")
        result.add("")
    }

    return result
}
