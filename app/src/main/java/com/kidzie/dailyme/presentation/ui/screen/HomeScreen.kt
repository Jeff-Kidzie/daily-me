package com.kidzie.dailyme.presentation.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kidzie.dailyme.presentation.ui.theme.DailyMeTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    DailyMeTheme {
        Scaffold(
            modifier = modifier.fillMaxSize(),
            topBar = { TopBar(modifier) },
            bottomBar = { BottomNavBar(modifier) }
        ) { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
//                TopBar(modifier)
                ContentHome(modifier)
//                BottomNavBar(modifier)
            }
        }

    }
}



@Composable
fun TopBar(modifier: Modifier) {
    Row(modifier = modifier
        .padding(10.dp)
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Column() {
            Text("My day", fontWeight = FontWeight.Bold)
            Text("11 Jan 2026")
        }
        Box(contentAlignment = Alignment.Center) {
            CircularProgressIndicator(progress = {
                0.5f
            } )
            Text(text = "10%", fontSize = 10.sp)
        }

    }
}

@Composable
fun ContentHome(modifier: Modifier) {
    LazyColumn() {

    }
}

@Composable
fun BottomNavBar(modifier: Modifier) {
    NavigationBar(modifier = modifier.fillMaxWidth()) {

    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen(
        modifier = Modifier.background(Color.White)
    )
}