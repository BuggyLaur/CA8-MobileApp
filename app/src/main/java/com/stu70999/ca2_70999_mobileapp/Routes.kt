package com.stu70999.ca2_70999_mobileapp
//
//sealed class Routes(val route: String) {
//    object FirstScreen : Routes("first_screen")
//    object SecondScreen : Routes("second_screen")
//    object ThirdScreen : Routes("third_screen")
//    object FourthScreen : Routes("fourth_screen")
//    object FifthScreen : Routes("fifth_screen")
//    object SixthScreen : Routes("sixth_screen")
//    object SeventhScreen : Routes("seventh_screen")
//}


object Routes {
    const val Home = "mainScreen"
    const val MovieScreen = "movieScreen/{movieName}"
}