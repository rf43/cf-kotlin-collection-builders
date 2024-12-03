package io.cursedfunction.runner2

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

internal fun buildPrintList(
    conferenceModel: ConferenceModel,
    schoolModels: List<SchoolModel>
): List<String> =
    listOf(
        "${conferenceModel.name} -  ${conferenceModel.abbr.uppercase()}",
        "Schools",
        "---------------------------",
    ) +

    schoolModels.mapIndexed { idx, school ->
        "${idx + 1}. ${school.longName} - ${school.tricode} - ${school.nickname}"
    } +

    "---------------------------" +

    if (conferenceModel.url != null) {
        listOf("URL: ${conferenceModel.url}", "")
    } else {
        emptyList()
    }
