package io.cursedfunction.data.conf_models

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

val accConference = ConferenceModel(
    name = "Atlantic Coast Conference",
    abbr = "ACC",
    url = "https://theacc.com/sports/football",
)

val accSchools = listOf(
    SchoolModel(
        longName = "Boston College",
        nickname = "Boston College Eagles",
        tricode = "BC",
    ),
    SchoolModel(
        longName = "University of California-Berkeley",
        nickname = "Cal Golden Bears",
        tricode = "CAL",
    ),
    SchoolModel(
        longName = "Clemson University",
        nickname = "Clemson Tigers",
        tricode = "CLEM",
    ),
    SchoolModel(
        longName = "Duke University",
        nickname = "Duke Blue Devils",
        tricode = "DUKE",
    ),
    SchoolModel(
        longName = "Florida State University",
        nickname = "Florida State Seminoles",
        tricode = "FSU",
    ),
    SchoolModel(
        longName = "Georgia Institute of Technology ",
        nickname = "Georgia Tech Yellow Jackets",
        tricode = "GT",
    ),
    SchoolModel(
        longName = "University of Louisville",
        nickname = "Louisville Cardinals",
        tricode = "LOU",
    ),
    SchoolModel(
        longName = "University of Miami",
        nickname = "Miami Hurricanes",
        tricode = "UM",
    ),
    SchoolModel(
        longName = "University of North Carolina",
        nickname = "North Carolina Tar Heels",
        tricode = "UNC",
    ),
    SchoolModel(
        longName = "North Carolina State University",
        nickname = "North Carolina State Wolfpack",
        tricode = "NCST",
    ),
    SchoolModel(
        longName = "University of Pittsburgh",
        nickname = "Pittsburgh Panthers",
        tricode = "PITT",
    ),
    SchoolModel(
        longName = "Southern Methodist University",
        nickname = "SMU Mustangs",
        tricode = "SMU",
    ),
    SchoolModel(
        longName = "Stanford University",
        nickname = "Stanford Cardinals",
        tricode = "STAN",
    ),
    SchoolModel(
        longName = "University of Virginia",
        nickname = "Virginia Cavaliers",
        tricode = "UVA",
    ),
    SchoolModel(
        longName = "Virginia Polytechnic Institute and State University",
        nickname = "VT",
        tricode = "Virginia Tech Hokies",
    ),
    SchoolModel(
        longName = "Wake Forest University",
        nickname = "WF",
        tricode = "Wake Forest Demon Deacons",
    )
)
