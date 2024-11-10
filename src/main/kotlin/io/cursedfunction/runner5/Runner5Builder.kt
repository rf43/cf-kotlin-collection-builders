package io.cursedfunction.runner5

//import io.cursedfunction.data.ConferenceModel
//import io.cursedfunction.data.SchoolModel
//import kotlinx.collections.immutable.ImmutableList
//import kotlinx.collections.immutable.toImmutableList
//
//internal fun buildPrintList(
//    conferenceWithSchools: Map<ConferenceModel, List<SchoolModel>>
//): ImmutableList<String> = buildList {
//    conferenceWithSchools.forEach { (conference, schools) ->
//        add(conference.name)
//        add(conference.abbr)
//        add("---------------------------")
//        schools.mapIndexedTo(this@buildList) { idx, school ->
//            "${idx + 1}. ${school.longName} - ${school.tricode} - ${school.nickname}"
//        }
//        add("---------------------------")
//        if (conference.url != null) {
//            add("URL: ${conference.url}")
//            add("")
//        }
//    }
//}.toImmutableList()
