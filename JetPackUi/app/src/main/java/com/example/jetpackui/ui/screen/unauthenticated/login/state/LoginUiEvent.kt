package com.example.jetpackui.ui.screen.unauthenticated.login.state

/**
 * Login Screen Event
 */
sealed class LoginUiEvent {
    data class EmailOrMobileChanged(val inputValue: String): LoginUiEvent()
    data class PasswordChanged(val inputValue: String): LoginUiEvent()
    object Submit: LoginUiEvent()
}