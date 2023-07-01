package com.alpstein.scrumdinger.presentation.scrumdetail

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alpstein.scrumdinger.components.AttendeesCartItem
import com.alpstein.scrumdinger.components.MeetingInfoCardItem
import com.alpstein.scrumdinger.model.DailyScrum
import com.alpstein.scrumdinger.ui.theme.Theme

@Composable
fun ScrumDetail(scrum: DailyScrum) {
    Column {
        MeetingInfoCardItem(scrum = scrum)


        AttendeesCartItem(attendees = scrum.attendees)
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewScrumDetail() {
    ScrumDetail(
        scrum = DailyScrum(
        title = "Backend Dev",
        attendees = listOf("Soner", "Nesrin", "Burak", "Sevcan"),
        lengthInMinutes = 10,
        Theme.Yellow))
}