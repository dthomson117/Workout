package com.app.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.app.presentation.segments.DefaultScaffolding

@Suppress("ktlint:standard:function-naming")
@Composable
fun MainScreen(
    navController: NavController,
    uiState: MainViewModelState,
    handleUiEvent: (MainViewModel.MainUiEvents) -> Unit
) {
    DefaultScaffolding(
        navController = navController
    ) { padding ->
        Column(
            Modifier
                .padding(padding)
        ) {
            Row {
                var value by remember { mutableStateOf(TextFieldValue("0")) }

                OutlinedTextField(
                    value = value,
                    onValueChange = {
                        value = it
                        handleUiEvent.invoke(MainViewModel.MainUiEvents.ValidateProgress(it.text))
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                    label = { Text("Progress") },
                    isError = uiState.validProgress,
                    supportingText = { if (!uiState.validProgress) Text("Only enter a valid number") },
                    modifier = Modifier.padding(16.dp)
                )

                IconButton(
                    onClick = { handleUiEvent.invoke(MainViewModel.MainUiEvents.SubmitProgress(value.text)) },
                    modifier = Modifier.align(Alignment.CenterVertically)
                ) {
                    Icon(Icons.Filled.Add, "add progress")
                }
            }

            IconButton(
                onClick = { handleUiEvent.invoke(MainViewModel.MainUiEvents.RefreshDays) }
            ) {
                Icon(Icons.Filled.Refresh, "refresh days")
            }

            uiState.days.forEach {
                Text(it.toString())
            }
        }
    }
}
