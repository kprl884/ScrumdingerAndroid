package com.alpstein.scrumdinger.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alpstein.scrumdinger.components.CustomCardView
import com.alpstein.scrumdinger.model.MockData

@Composable
fun ScrumsScreen() {
  LazyColumn {
    val items = MockData.dailyScrumData()
    items(items) { dailyScrum ->
      CustomCardView(scrum = dailyScrum)
    }
  }
}

@Preview
@Composable
fun PreviewScrumsScreen() {
  ScrumsScreen()
}