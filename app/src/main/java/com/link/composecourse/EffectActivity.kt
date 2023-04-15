package com.link.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.link.composecourse.ui.theme.ComposeCourseTheme
import kotlinx.coroutines.delay

class EffectActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var text by remember {
                mutableStateOf("")
            }
            ComposeCourseTheme {
                LaunchedEffect(key1 = text) {
                    delay(1000L)
                    println("The text is $text")
                }
            }
        }
    }
}