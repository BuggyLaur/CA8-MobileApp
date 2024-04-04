package com.stu70999.ca2_70999_mobileapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import kotlin.random.Random

data class MovieList(
    val name: String,
    val image: String,
    val description: String,
)

val movies = listOf(
    MovieList(
        "DUNE PART TWO",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/7a7a20aa-1064-46fd-96cc-4b271268f2c5_dune-part-ii_posters_one-sheet_712px.jpg?mw=450&rev=c61dcb539042435c973daaeeb97100b6",
        "DUNE PART TWO",
    ),
    MovieList(
        "KUNG FU PANDA 4",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/a223aaeb-6a2d-4561-92f0-e3efa105a21e_kung-fu-panda-4_posters_kf4_intl_dgtl_payoff_1sheet_uk_712px.jpg?mw=450&rev=7239547d058742c7b4ee0899fe51c29e",
        "DUNE PART TWO",),
    MovieList(
        "LATE NIGHT DEVIL",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/fbba555e-0b86-42ef-bf03-b6622edd07cb_late-night-with-the-devil_posters_lnwtd_6sht_p4p_712px.jpg?mw=450&rev=54cc9cb298c749f290f17921f84d3efb",
        "DUNE PART TWO",
    ),
    MovieList(
        "DESPLICABLE ME 2",
        "https://www.myvue.com/-/jssmedia/vuecinemas/film-and-events/mar-2024/despicable-me-2.jpg?mw=450&rev=3d672b43fb7f421e8ab05f5f8fe4b207",
        "DUNE PART TWO",)
)