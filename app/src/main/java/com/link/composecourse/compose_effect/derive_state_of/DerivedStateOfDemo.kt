package com.link.composecourse.compose_effect.derive_state_of

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun DerivedStateOfDemo() {
    var counter by remember {
        mutableStateOf(0)
    }

    //val counterText = "This counter is $counter"
    val counterText by derivedStateOf {
        "This counter is $counter"
    }

    Button(onClick = { counter++ }) {
        Text(text = counterText)
    }
}