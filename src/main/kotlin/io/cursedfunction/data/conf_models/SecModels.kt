package io.cursedfunction.data.conf_models

import io.cursedfunction.data.ConferenceModel
import io.cursedfunction.data.SchoolModel

val secConference = ConferenceModel(
    name = "South Eastern Conference",
    abbr = "SEC",
)

val secSchools = listOf(
    SchoolModel(
        longName = "University of Alabama",
        nickname = "Alabama Crimson Tide",
        tricode = "BAMA",
    ),
    SchoolModel(
        longName = "University of Arkansas",
        nickname = "Arkansas Razorbacks",
        tricode = "ARK",
    ),
    SchoolModel(
        longName = "Auburn University",
        nickname = "Auburn Tigers",
        tricode = "AUB",
    ),
    SchoolModel(
        longName = "University of Florida",
        nickname = "Florida Gators",
        tricode = "UF",
    ),
    SchoolModel(
        longName = "University of Georgia",
        nickname = "Georgia Bulldogs",
        tricode = "UGA",
    ),
    SchoolModel(
        longName = "University of Kentucky",
        nickname = "Kentucky Wildcats",
        tricode = "UK",
    ),
    SchoolModel(
        longName = "Louisiana State University",
        nickname = "LSU Tigers",
        tricode = "LSU",
    ),
    SchoolModel(
        longName = "University of Mississippi",
        nickname = "Ol Miss Rebels",
        tricode = "MISS",
    ),
    SchoolModel(
        longName = "Mississippi State University",
        nickname = "Mississippi State Bulldogs",
        tricode = "MSST",
    ),
    SchoolModel(
        longName = "University of Missouri",
        nickname = "Missouri Tigers",
        tricode = "MIZZ",
    ),
    SchoolModel(
        longName = "University of Oklahoma",
        nickname = "Oklahoma Sooners",
        tricode = "OU",
    ),
    SchoolModel(
        longName = "University of South Carolina",
        nickname = "South Carolina Gamecocks",
        tricode = "SCAR",
    ),
    SchoolModel(
        longName = "University of Tennessee",
        nickname = "Tennessee Vols",
        tricode = "TENN",
    ),
    SchoolModel(
        longName = "University of Texas",
        nickname = "Texas Longhorns",
        tricode = "TEX",
    ),
    SchoolModel(
        longName = "Texas A&M University",
        nickname = "Texas A&M Aggies",
        tricode = "TAMU",
    ),
    SchoolModel(
        longName = "Vanderbilt University",
        nickname = "Vanderbilt Commodores",
        tricode = "VAN",
    )
)
