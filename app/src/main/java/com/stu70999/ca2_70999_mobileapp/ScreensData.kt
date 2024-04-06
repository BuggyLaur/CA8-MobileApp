package com.stu70999.ca2_70999_mobileapp


import android.icu.text.DateFormat.HourCycle
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import kotlin.random.Random

data class ScreensData(
    val name: String,
    val image: String,
    val certification: String,
    val description: String,
    val starring: Array<String>,
    val runningTimeMins: Int,
    val seatsRemaining: MutableState<Int>,
    val seatsSelected: MutableState<Int>,
)

val movies = listOf(

    ScreensData(
        "DESPICABLE ME (2010)",
        "https://www.myvue.com/-/jssmedia/vuecinemas/film-and-events/mar-2024/despicable-me.jpg?mw=450&rev=953f3025a0cb49f8a4375acfb350df4d",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/g.png?mw=25&mh=25&rev=08ad474995ec4bdab5ef1591ee325baf",
        "When a criminal mastermind uses a trio of orphan girls as pawns for a grand scheme, he finds their love is profoundly changing him for the better.",
        arrayOf("Steve Carell", "Kristen Wiig", "Will Arnett", "Pierre Coffin"),
        95,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0),
    ),

    ScreensData(
        "DUNE PART II",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/7a7a20aa-1064-46fd-96cc-4b271268f2c5_dune-part-ii_posters_one-sheet_712px.jpg?mw=450&rev=c61dcb539042435c973daaeeb97100b6",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/12a.png?mw=25&mh=25&rev=d1b78b8f625a43b098703bf1bf397269",
        "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against the conspirators who destroyed his family.",
        arrayOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
        120,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0),
    ),
    ScreensData("LATE NIGHT WITH THE DEVIL",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/fbba555e-0b86-42ef-bf03-b6622edd07cb_late-night-with-the-devil_posters_lnwtd_6sht_p4p_712px.jpg?mw=450&rev=54cc9cb298c749f290f17921f84d3efb",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/16.png?mw=25&mh=25&rev=a22f1322c3ee478cb4b50f8de5ee741d",
        "October 31, 1977. Johnny Carson rival Jack Delroy hosts a syndicated late night talk show ‘Night Owls’ that has long been a trusted companion to insomniacs around the country. A year after the tragic death of Jack’s wife, ratings have plummeted. Desperate to turn his fortunes around, Jack plans a Halloween special like no other, unaware that he is about to unleash evil into the living rooms of America.",
        arrayOf("David Dastmalchian", "Fayssal Bazzi", "Laura Gordon", "Ian Bliss"),
        93,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0)
    ),
    ScreensData(
        "IMAGINARY",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/f607e5c8-c8db-4dbb-92d0-dad9ab8c68c3_imaginary_posters_imaginary_1sheet_686x1016_712px.jpg?mw=450&rev=795a2eed0ad641b297101bd70e72eca7",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/15a.png?mw=25&mh=25&rev=fd3786da538c4502b4e4c02ea3c7b44e",
        "When Jessica (DeWanda Wise) moves back into her childhood home with her family, her youngest stepdaughter Alice develops an eerie attachment to a stuffed bear. (Horror)",
        arrayOf("Betty Buckley", "DeWanda Wise", "Tom Payne"),
        104,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0),
    ),
    ScreensData(
        "KUNG FU PANDA 4",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/a223aaeb-6a2d-4561-92f0-e3efa105a21e_kung-fu-panda-4_posters_kf4_intl_dgtl_payoff_1sheet_uk_712px.jpg?mw=450&rev=7239547d058742c7b4ee0899fe51c29e",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/pg.png?mw=25&mh=25&rev=be4a86333c51431593fef1189e30e84e",
        "After Po is tapped to become the Spiritual Leader of the Valley of Peace, he needs to find and train a new Dragon Warrior, while a wicked sorceress plans to re-summon all the master villains whom Po has vanquished to the spirit realm.",
        arrayOf("Jack Black", "Awkwafina", "Viola David", "Dustin Hoffman", "Bryan Cranston", "Mr. Beast"),
        130,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0),
    ),
    ScreensData(
        "GHOSTBUSTERS",
        "https://www.myvue.com/-/jssmedia/vuecinemas/film-and-events/feb-2024/ghostbusters-poster.jpg?mw=450&rev=890c7016efc4412293629c8d63844732",
        "https://www.myvue.com/-/jssmedia/vuecinemas/certificates/uk/12a.png?mw=25&mh=25&rev=b91ed3a02335433fb5f5becf370850dc",
        "In Ghostbusters: Frozen Empire, the Spengler family returns to where it all started – the iconic New York City firehouse – to team up with the original Ghostbusters.",
        arrayOf("Paul Rudd", "Bill Murray", "Finn Wolfhard", "Dan Aykroud", "Annie Potts", "Mckenna Grace", "Ernie Hudson"),
        120,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0),
    ),

        ScreensData("MOTHERS’ INSTINCT",
            "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/c177f35c-a26b-4ffc-bedf-71a2758fc90f_mothers-instinct_posters_mothers--instinct-artworks---online-uk.jpg?mw=450&rev=ce7f869488c94122b2072c28cc23ce81",
            "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/15a.png?mw=25&mh=25&rev=fd3786da538c4502b4e4c02ea3c7b44e",
            "Starring Academy Award winners Jessica Chastain and Anne Hathaway, Mothers’ Instinct is an unnerving psychological thriller about two best friends and neighbors, Alice and Céline, whose perfect lives in ‘60s suburbia are shattered by a tragic accident involving one of their children. Marking the directorial debut of acclaimed cinematographer Benoit Delhomme, we follow Alice and Céline as their familial bonds are gradually undermined by guilt and paranoia and a gripping battle of wills develops, revealing the darker side of maternal love.",
            arrayOf("Jessica Chastain", "Anne Hathaway"),
            94,
            mutableIntStateOf(Random.nextInt(0, 16)),
            mutableIntStateOf(0)
    ),
    ScreensData(
        "GODZILLA X KONG",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/7bf51248-5164-49ec-ab6f-090e904a263f_godzilla-x-kong-the-new-empire_posters_teaser---one-sheet_712px.jpg?mw=450&rev=013f431ef34d4bd98344d19d229a4345",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/12a.png?mw=25&mh=25&rev=d1b78b8f625a43b098703bf1bf397269",
        "The new installment in the Monsterverse puts the mighty Kong and the fearsome Godzilla against a colossal deadly threat hidden within our world.",
        arrayOf("Rebecca Hall", "Dan Stevens", "Brian Tyree Henry", "Fala Chen", "Kaylee Hottle", "Alex Ferns"),
        115,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0),
    ),
    ScreensData(
        "MIGRATION",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/fddf86f4-a848-4ffd-9a05-b602edc77b70_migration_posters_mig_intl_dgtl_one_sheet_opt_1_landing_uk_712p.jpg?mw=450&rev=69acf0619d6946d596b112f278bf4bd5",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/pg.png?mw=25&mh=25&rev=be4a86333c51431593fef1189e30e84e",
        "A family of ducks decides to leave the safety of a New England pond for an adventurous trip to Jamaica. However, their well-laid plans quickly go awry when they get lost and wind up in New York City.",
        arrayOf("Elizabeth Banks", "Danny DeVito", "Keegan-Michael Key", "Kumail Nanjiani", "Awkwafina"),
        90,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0),
    ),
)