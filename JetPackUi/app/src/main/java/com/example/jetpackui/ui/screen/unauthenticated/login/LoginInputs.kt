package com.example.jetpackui.ui.screen.unauthenticated.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import com.example.jetpackui.R
import com.example.jetpackui.ui.common.customComposableView.EmailTextField
import com.example.jetpackui.ui.common.customComposableView.NormalButton
import com.example.jetpackui.ui.common.customComposableView.PasswordTextField
import com.example.jetpackui.ui.screen.unauthenticated.login.state.LoginState
import com.example.jetpackui.ui.theme.normalDimensions

@Composable
fun LoginInputs(
    loginState: LoginState,
    onEmailOrMobileChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onSubmit: () -> Unit,
    onForgotPasswordClick: () -> Unit
) {

    // Login input section
    Column(modifier = Modifier.fillMaxWidth()) {
        EmailTextField(
            value = loginState.emailOrMobile,
            onValueChange = onEmailOrMobileChange,
            label = stringResource(
                id = R.string.login_email_id_or_phone_label
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = normalDimensions.paddingLarge),
            isError = loginState.errorState.emailOrMobileErrorState.hasError,
            errorText = stringResource(id = loginState.errorState.emailOrMobileErrorState.errorMessageStringResource)
        )

// Password
        PasswordTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = normalDimensions.paddingLarge),
            value = loginState.password,
            onValueChange = onPasswordChange,
            label = stringResource(id = R.string.login_password_label),
            isError = loginState.errorState.passwordErrorState.hasError,
            errorText = stringResource(id = loginState.errorState.passwordErrorState.errorMessageStringResource),
            imeAction = ImeAction.Done
        )

        // Forgot Password
        Text(
            modifier = Modifier
                .padding(top = normalDimensions.paddingSmall)
                .align(alignment = Alignment.End)
                .clickable {
                    onForgotPasswordClick.invoke()
                },
            text = stringResource(id = R.string.forgot_password),
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.bodyMedium
        )

        // Login Submit Button
        NormalButton(
            modifier = Modifier.padding(top = normalDimensions.paddingLarge),
            text = stringResource(id = R.string.login_button_text),
            onClick = onSubmit
        )
    }

}