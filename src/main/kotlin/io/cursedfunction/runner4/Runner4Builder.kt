package io.cursedfunction.runner4

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

internal fun buildPrintList(
    conferenceModel: ConferenceModel,
    schoolModels: List<SchoolModel>,
): List<String> = buildList {
    add(conferenceModel.name)
    add(conferenceModel.abbr)

    add("---------------------------")

    schoolModels.mapIndexedTo(this@buildList) { idx, school ->
        "${idx + 1}. ${school.longName} - ${school.tricode} - ${school.nickname}"
    }

    add("---------------------------")

    if (conferenceModel.url != null) {
        add("URL: ${conferenceModel.url}")
        add("")
    }
}
