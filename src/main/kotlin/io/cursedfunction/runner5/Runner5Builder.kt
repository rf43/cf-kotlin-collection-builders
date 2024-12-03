package io.cursedfunction.runner5

//import io.cursedfunction.data.ConferenceModel
//import io.cursedfunction.data.SchoolModel
//import kotlinx.collections.immutable.ImmutableList
//import kotlinx.collections.immutable.toImmutableList
//
//internal fun buildPrintList(
//    conferenceModel: ConferenceModel,
//    schoolModels: List<SchoolModel>,
//): ImmutableList<String> = buildList {
//    add(conferenceModel.name)
//    add(conferenceModel.abbr)
//
//    add("---------------------------")
//
//    schoolModels.mapIndexedTo(this) { idx, school ->
//        "${idx + 1}. ${school.longName} - ${school.tricode} - ${school.nickname}"
//    }
//
//    add("---------------------------")
//
//    if (conferenceModel.url != null) {
//        add("URL: ${conferenceModel.url}")
//        add("")
//    }
//}.toImmutableList()
