package com.link.composecourse

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class BasicSizingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Row(modifier = Modifier
                //.fillMaxSize(0.5f)
                .width(200.dp)
                .height(400.dp)
                .background(Color.Green),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround) {
                Text(text = "hello")
                Text(text = "hello")
                Text(text = "hello")
                //Alignment, Arrengment가 다르구나
                //Modifier가 일종의 Container 느낌, 배치되는 영역 및 배경 색 등을 정할 수 있음
                //fillMaxSize > fill_parent와 같은 옵션, 기본은 warp_parent, width, height 등을 설정할 수 있음
            }
        }
    }
}