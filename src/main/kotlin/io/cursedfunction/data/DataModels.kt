package io.cursedfunction.data

data class ConferenceModel(
    val name: String,
    val abbr: String,
    val url: String? = null,
)

data class SchoolModel(
    val longName: String,
    val nickname: String,
    val tricode: String,
)




