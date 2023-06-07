package com.alpstein.scrumdinger.presentation.meeting

import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MeetingScreen(modifier: Modifier) {
  Column(
    modifier
      .fillMaxWidth()
      .padding(16.dp)
  ) {
    LinearProgressIndicator(progress = 0.3f, modifier = Modifier.fillMaxWidth(), color = Color.Blue, backgroundColor = Color.LightGray)
    Row(modifier = Modifier.fillMaxWidth()) {
      Column(modifier = Modifier.weight(0.1f)) {
        Text(
          text = "Seconds Elapsed",
          style = MaterialTheme.typography.subtitle1
        )
        Row {
          Icon(
            Icons.Filled.Home,
            contentDescription = "Hour glass filled",
            Modifier.padding(top = 3.dp)
          )
          Text(
            text = "300", modifier
              .align(alignment = Alignment.CenterVertically)
              .padding(start = 5.dp),
            style = MaterialTheme.typography.h6
          )
        }
      }
      Column(modifier = Modifier.weight(0.1f)) {
        Text(
          text = "Seconds Remaining",
          style = MaterialTheme.typography.subtitle1
        )
        Row {
          Icon(
            Icons.Filled.Home,
            contentDescription = "Hour glass filled",
            Modifier.padding(top = 3.dp)
          )
          Text(
            text = "600", modifier
              .align(alignment = Alignment.CenterVertically)
              .padding(start = 5.dp),
            style = MaterialTheme.typography.h6
          )
        }
      }
    }
    Icon(
      Icons.Outlined.CheckCircle,
      contentDescription = "Hour glass filled",
      Modifier.fillMaxSize()
    )
  }
}
@Preview(
  showBackground = true,
  showSystemUi = true
)
@Composable
fun PreviewMeetingScreen() {
  MeetingScreen(modifier = Modifier)
}