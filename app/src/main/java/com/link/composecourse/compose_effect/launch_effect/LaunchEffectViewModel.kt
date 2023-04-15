package com.link.composecourse.compose_effect.launch_effect

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class LaunchEffectViewModel: ViewModel() {
    private val _sharedFlow = MutableSharedFlow<ScreenEvents>()
    val sharedFlow = _sharedFlow.asSharedFlow()

    init {
        viewModelScope.launch {
            _sharedFlow.emit(ScreenEvents.ShowSnackbar("Hello World!"))
        }
    }


    sealed class ScreenEvents {
        data class ShowSnackbar(val message: String): ScreenEvents()
        data class Navigation(val route: String): ScreenEvents()
    }
}