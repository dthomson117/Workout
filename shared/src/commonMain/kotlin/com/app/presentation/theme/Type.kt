package com.app.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import workout.shared.generated.resources.Inter_Black
import workout.shared.generated.resources.Inter_Bold
import workout.shared.generated.resources.Inter_ExtraBold
import workout.shared.generated.resources.Inter_ExtraLight
import workout.shared.generated.resources.Inter_Light
import workout.shared.generated.resources.Inter_Medium
import workout.shared.generated.resources.Inter_Regular
import workout.shared.generated.resources.Inter_SemiBold
import workout.shared.generated.resources.Inter_Thin
import workout.shared.generated.resources.Res

@Composable
fun getFontFamily() =
    FontFamily(
        Font(resource = Res.font.Inter_Black, weight = FontWeight.Black),
        Font(resource = Res.font.Inter_Thin, weight = FontWeight.Thin),
        Font(resource = Res.font.Inter_SemiBold, weight = FontWeight.SemiBold),
        Font(resource = Res.font.Inter_Regular, weight = FontWeight.Normal),
        Font(resource = Res.font.Inter_Medium, weight = FontWeight.Medium),
        Font(resource = Res.font.Inter_Light, weight = FontWeight.Light),
        Font(resource = Res.font.Inter_ExtraLight, weight = FontWeight.ExtraLight),
        Font(resource = Res.font.Inter_ExtraBold, weight = FontWeight.ExtraBold),
        Font(resource = Res.font.Inter_Bold, weight = FontWeight.Bold),
    )

// Default Material 3 typography values
val baseline = Typography()

@Composable
fun getAppTypography(): Typography {
    val fontFamily = getFontFamily()
    return Typography(
        displayLarge = baseline.displayLarge.copy(fontFamily = fontFamily),
        displayMedium = baseline.displayMedium.copy(fontFamily = fontFamily),
        displaySmall = baseline.displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = baseline.titleLarge.copy(fontFamily = fontFamily),
        titleMedium = baseline.titleMedium.copy(fontFamily = fontFamily),
        titleSmall = baseline.titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = fontFamily),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = baseline.bodySmall.copy(fontFamily = fontFamily),
        labelLarge = baseline.labelLarge.copy(fontFamily = fontFamily),
        labelMedium = baseline.labelMedium.copy(fontFamily = fontFamily),
        labelSmall = baseline.labelSmall.copy(fontFamily = fontFamily),
    )
}
