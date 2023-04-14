package com.alpstein.scrumdinger.model

import com.alpstein.scrumdinger.ui.theme.Theme


data class DailyScrum(
  val title: String,
  val attendees: List<String>,
  val lengthInMinutes: Int,
  val theme: Theme
)