package io.cursedfunction.runner3

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

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
