package com.alpstein.scrumdinger.model

import com.alpstein.scrumdinger.ui.theme.Theme

object MockData {
  fun DailyScrumData() = listOf(
      DailyScrum(title = "App Dev", attendees =  listOf("Alparslan", "Burak", "Burhan","Hande", "Ramazan"), lengthInMinutes = 10, Theme.MAGENTA),
      DailyScrum(title = "Backend Dev", attendees =  listOf("Soner", "Nesrin"), lengthInMinutes = 10, Theme.YELLOW),
      DailyScrum(title = "Analist Dev", attendees =  listOf("Sevcan", "Zeynep"), lengthInMinutes = 10, Theme.YELLOW),
      DailyScrum(title = "Test", attendees =  listOf("Yunus"), lengthInMinutes = 5, Theme.YELLOW))
}