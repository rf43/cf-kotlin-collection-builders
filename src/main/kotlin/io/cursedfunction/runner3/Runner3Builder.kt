package io.cursedfunction.runner3

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

internal fun buildPrintList(
    conferenceWithSchools: Map<ConferenceModel, List<SchoolModel>>
): List<String> {
    val result = mutableListOf<String>()

    conferenceWithSchools.forEach { (conference, schools) ->
        result.add(conference.name)
        result.add(conference.abbr)
        result.add("---------------------------")
        schools.mapIndexedTo(result) { idx, school ->
            "${idx + 1}. ${school.longName} - ${school.tricode} - ${school.nickname}"
        }
        result.add("---------------------------")
        if (conference.url != null) {
            result.add("URL: ${conference.url}")
            result.add("")
        }
    }

    return result
}
