package io.cursedfunction.runner2

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

internal fun buildPrintList(
    conferenceWithSchools: Map<ConferenceModel, List<SchoolModel>>
): List<String> {
    val result = mutableListOf<String>()

    conferenceWithSchools.forEach { (conference, schools) ->
        val tempList: List<String> = listOf(
            "${conference.name} -  ${conference.abbr.uppercase()}",
            "Schools",
            "---------------------------",
        ) +
                schools.mapIndexed { idx, school ->
                    "${idx + 1}. ${school.longName} - ${school.tricode} - ${school.nickname}"
                } +

                "---------------------------" +

                if (conference.url != null) {
                    listOf("URL: ${conference.url}", "")
                } else {
                    emptyList()
                }

        result.addAll(tempList)
    }

    return result
}
