package com.alpstein.scrumdinger.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alpstein.scrumdinger.R
import com.alpstein.scrumdinger.model.DailyScrum
import com.alpstein.scrumdinger.ui.theme.Theme

@Composable
fun CustomCardView(scrum: DailyScrum) {
  Card {
    Column(
      modifier = Modifier
        .background(color = scrum.theme.mainColor)
        .fillMaxWidth()
        .padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 8.dp)
    ) {
      Text(text = scrum.title, fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold)
      Row {
        Row(modifier = Modifier.semantics(mergeDescendants = true) {}) {
          Icon(
            painter = painterResource(id = R.drawable.people),
            contentDescription = "${scrum.attendees} attendees",
            modifier = Modifier
              .size(24.dp, 24.dp)
              .padding(4.dp)
          )
          Text(
            text = scrum.attendees.size.toString(),
            modifier = Modifier.align(Alignment.CenterVertically)
          )
        }
        Spacer(
          modifier = Modifier.weight(1f)
        )
        Row(modifier = Modifier.semantics(mergeDescendants = true) {}) {
          Icon(
            painter = painterResource(id = R.drawable.timer),
            contentDescription = "${scrum.lengthInMinutes} minute meeting",
            modifier = Modifier
              .size(24.dp, 24.dp)
              .padding(4.dp)
          )
          Text(
            text = scrum.lengthInMinutes.toString(),
            fontFamily = FontFamily.Default,
            modifier = Modifier
              .align(Alignment.CenterVertically)
          )
        }
      }
    }
  }
}

@Preview
@Composable
fun PreviewCustomCardView() {
  CustomCardView(
    scrum = DailyScrum(
      title = "Backend Dev",
      attendees = listOf("Soner", "Nesrin"),
      lengthInMinutes = 10,
      Theme.Magenta)
  )
}