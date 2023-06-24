package com.alpstein.scrumdinger

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alpstein.scrumdinger.presentation.scrum.ScrumsScreen
import com.alpstein.scrumdinger.presentation.meeting.MeetingScreen

@ExperimentalTextApi
@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxSize(),
        navController = navController,
        startDestination = "scrums"
    ) {
        composable("meeting") {
            MeetingScreen(modifier = Modifier,
                onNavigate = { navController.navigate("scrums") },)
        }
        composable("scrums") {
            ScrumsScreen(onNavigate = { navController.navigate("meeting") })
        }
    }
}