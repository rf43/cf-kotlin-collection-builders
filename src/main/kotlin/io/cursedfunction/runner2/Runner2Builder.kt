package io.cursedfunction.runner2

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

// Build a list of strings to print conference and school information
// using list concatenation. This is a straightforward approach but may be less
// efficient due to the creation of multiple intermediate lists.
// This method of creating a list is, in my opinion, not easily readable.
// This makes it harder to see the overall structure of the output at a glance.

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
