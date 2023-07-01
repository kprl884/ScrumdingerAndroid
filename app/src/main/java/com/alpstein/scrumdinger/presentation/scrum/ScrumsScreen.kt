package com.alpstein.scrumdinger.presentation.scrum

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.alpstein.scrumdinger.components.CustomCardView
import com.alpstein.scrumdinger.model.MockData

@Composable
fun ScrumsScreen(onNavigate: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.Add,
                            contentDescription = "New Scrum",
                            tint = Color.Blue
                        )
                    }
                },
                backgroundColor = Color.White,
                contentColor = Color.White,
            )
        }
    ) { contentPadding ->
        Column() {
            Text(text = "Daily Scrums",
                fontFamily = FontFamily.SansSerif,
                style = MaterialTheme.typography.h4)
            LazyColumn(
                Modifier.padding(contentPadding)) {
                val items = MockData.dailyScrumData()
                items(items) { dailyScrum ->
                    CustomCardView(
                        scrum = dailyScrum,
                        scrumClick = onNavigate
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewScrumsScreen() {
    ScrumsScreen(
        onNavigate = {}
    )
}