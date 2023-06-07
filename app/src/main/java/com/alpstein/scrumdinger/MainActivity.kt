package com.alpstein.scrumdinger

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alpstein.scrumdinger.presentation.ScrumsScreen
import com.alpstein.scrumdinger.ui.theme.ScrumdingerTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ScrumdingerTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          ScrumsScreen()
        }
      }
    }
  }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ScrumdingerTheme {
  }
}