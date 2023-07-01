package com.alpstein.scrumdinger.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.sharp.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alpstein.scrumdinger.model.DailyScrum
import com.alpstein.scrumdinger.ui.theme.Theme

@Composable

fun MeetingInfoCardItem(scrum: DailyScrum) {
    Column {
        Text(
            text = "Meeting Info",
            color = Color.Gray,
            modifier = Modifier.padding(start = 8.dp, top = 8.dp)
        )
        Card(
            shape = MaterialTheme.shapes.medium,
            elevation = 1.dp,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, top = 2.dp, bottom = 2.dp, end = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription = "Timer",
                        tint = Theme.Sky.mainColor
                    )
                    Text(
                        text = "Start Meeting",
                        modifier = Modifier.padding(start = 16.dp),
                        color = Theme.Sky.mainColor
                    )
                    Spacer(modifier = Modifier.weight(1.0f))
                    Icon(
                        imageVector = Icons.Sharp.ArrowForward,
                        contentDescription = "Start Meeting arrow",
                        tint = Color.Gray
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, top = 2.dp, bottom = 2.dp, end = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription = "Timer",
                        tint = Theme.Sky.mainColor
                    )
                    Text(
                        text = "Start Meeting",
                        modifier = Modifier.padding(start = 16.dp),
                        color = Theme.Sky.mainColor
                    )
                    Spacer(modifier = Modifier.weight(1.0f))
                    Text(text = "${scrum.lengthInMinutes} minutes")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, top = 2.dp, bottom = 2.dp, end = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription = "Timer",
                        tint = Theme.Sky.mainColor
                    )
                    Text(
                        text = "Start Meeting",
                        modifier = Modifier.padding(start = 16.dp),
                        color = Theme.Sky.mainColor
                    )
                    Spacer(modifier = Modifier.weight(1.0f))
                    Text(
                        text = "${scrum.theme}",
                        style = TextStyle(background = scrum.theme.mainColor)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMeetingInfoCardItem() {
    MeetingInfoCardItem(
        scrum = DailyScrum(
            "Backend",
            attendees = listOf("Ali, Murat, Onur"),
            lengthInMinutes = 10,
            theme = Theme.Yellow
        )
    )
}