package com.stu70999.ca2_70999_mobileapp

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen1(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.DarkGray,
                    titleContentColor = Color.White,

                    ),
                title = {
                    Text("WELCOME MATE")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.DarkGray,
                contentColor = Color.White,
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "CHOOSE YOUR MOVIE",
                )
            }

            ToScreen3Button(onClick = {
                navController.navigate(Routes.SecondScreen.route)})
        })

    {  innerPadding ->
        Column(
            modifier = Modifier
                .background(color = Color.Black)
                .padding(innerPadding)
                .fillMaxSize(),
        ) {
            val imageResources = listOf(
            R.drawable.panda1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6,
        )

            LazyVerticalGrid(
                columns = GridCells.Fixed(2)
            ) {
                items(imageResources.size) { index ->
                    val imageName = "Panda${index + 1}"
                    val isFirstImageClickable = index == 1
                    ClickableImage(
                        clickable = isFirstImageClickable,
                        onClick = {

                            navController.navigate(Routes.SecondScreen.route)
                        },
                        imageResource = imageResources[index],
                        contentDescription = "Menu of movies $imageName"
                    )
                }
            }
        }
    }
}

@Composable
fun ClickableImage(
    clickable: Boolean,
    onClick: () -> Unit,
    imageResource: Int,
    contentDescription: String
) {
    val modifier = if (clickable) {
        Modifier.clickable(onClick = onClick)
    } else {
        Modifier
    }
    Image(
        modifier = Modifier
            .fillMaxSize()
            .size(270.dp)
            .clickable(onClick = onClick),
        contentScale = ContentScale.FillBounds,
        contentDescription = contentDescription,
        painter = painterResource(imageResource),
    )
}










/*
@Composable
fun ImagePart(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
 //           .padding(bottom = 297.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.p6),
            contentDescription = "Image For the Screen1",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
               .height(300.dp) //I had an issue for the image. based on the original size of the image, The android mobile screen couldn't fit
//                .background(color = Color.Yellow)
        )
    }
}

@Composable
fun Seat() {
    Column(
        modifier = Modifier
            .background(color = Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        // Mutable state to hold the number of selected seats
        val selectedSeats = remember { mutableStateOf(0) }

        Button(onClick = { if (selectedSeats.value > 0) selectedSeats.value-- }) {
            Text("-")
        }

        Spacer(modifier = androidx.compose.ui.Modifier.width(8.dp))

        Text("Seats: ${selectedSeats.value}")

        Spacer(modifier = androidx.compose.ui.Modifier.width(8.dp))

        Button(onClick = { if (selectedSeats.value < 5) selectedSeats.value++ }) {
            Text("+")
        }

        Spacer(modifier = androidx.compose.ui.Modifier.width(16.dp))

        Text("Space between them: 5")

        Spacer(modifier = androidx.compose.ui.Modifier.width(16.dp))

        Text("Seats remaining: ${5 - selectedSeats.value}")
    }

} */





