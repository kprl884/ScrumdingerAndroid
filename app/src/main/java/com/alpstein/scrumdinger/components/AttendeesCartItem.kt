package com.alpstein.scrumdinger.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alpstein.scrumdinger.ui.theme.Theme

@Composable
fun AttendeesCartItem(attendees: List<String>) {
    LazyColumn() {
        items(attendees.size) {
            AttendeeListItem(attendee = attendees[it])
        }
    }
}

@Composable
fun AttendeeListItem(attendee: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(start = 4.dp, top = 4.dp, bottom = 4.dp)) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Attendee",
            tint = Theme.Sky.mainColor
        )
        Column {
            Text(
                text = attendee,
                modifier = Modifier.padding(start = 8.dp),
                style = MaterialTheme.typography.body1
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color = Color.Gray)
                    .padding(start = 16.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAttendeesCartItem() {
    AttendeesCartItem(
        listOf("Ahmet", "Ali", "Ayşe", "Sezen")
    )
}