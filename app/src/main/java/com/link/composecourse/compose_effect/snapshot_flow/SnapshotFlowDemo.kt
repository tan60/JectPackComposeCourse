package com.link.composecourse.compose_effect.snapshot_flow

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.mapNotNull

@Composable
fun SnapshotFlowDemo() {
    val snackbarState = SnackbarHostState()
    LaunchedEffect(key1 = snackbarState) {
        snapshotFlow { snackbarState }
            .mapNotNull { it.currentSnackbarData?.visuals?.message }
            .distinctUntilChanged()
            .collect { message ->
                println("A snackbar with message $message was shown")
            }
    }
}