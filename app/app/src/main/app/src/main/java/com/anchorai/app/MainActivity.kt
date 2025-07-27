package com.anchorai.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MaterialTheme {
        Greeting("AnchorAI")
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(text = "Welcome to AnchorAI, $name!")
}
AppCenter.start(getApplication(), "{"389466b7-8853-490e-9faf-4f7d7f296852"}",
                  Analytics.class, Crashes.class);
