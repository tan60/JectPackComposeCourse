package com.link.composecourse.compose_effect.launch_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

@Composable
fun LaunchEffectFlowDemo(
    viewModel: LaunchEffectViewModel
) {
    LaunchedEffect(key1 = true) {
        viewModel.sharedFlow.collect { event ->
            when(event) {
                is LaunchEffectViewModel.ScreenEvents.ShowSnackbar -> {

                }
                is LaunchEffectViewModel.ScreenEvents.Navigation -> {

                }
            }
        }
    }
}