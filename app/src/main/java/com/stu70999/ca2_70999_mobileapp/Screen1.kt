package com.stu70999.ca2_70999_mobileapp

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter

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
        })

    { innerPadding ->
        Column(
            modifier = Modifier
                .background(color = Color.Black)
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            LazyVerticalGrid(
                columns = GridCells.Fixed(2)
            ) {
                itemsIndexed(movies) { _, movies ->
                    Card(
                        modifier = Modifier.padding(5.dp).fillMaxWidth(),
                        onClick = { navController.navigate("NextScreen/${movies.name}") }
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,

                            ) {
                            Image(
                                painter = rememberAsyncImagePainter(model = movies.image),
                                contentDescription = movies.description,
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize().size(300.dp)
                            )
                        }
                    }
                }
            }
        }
    }
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





