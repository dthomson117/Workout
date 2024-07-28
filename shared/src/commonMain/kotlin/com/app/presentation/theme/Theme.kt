package com.app.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.workout.android.presentation.theme.backgroundDark
import com.workout.android.presentation.theme.backgroundDarkHighContrast
import com.workout.android.presentation.theme.backgroundDarkMediumContrast
import com.workout.android.presentation.theme.backgroundLight
import com.workout.android.presentation.theme.backgroundLightHighContrast
import com.workout.android.presentation.theme.backgroundLightMediumContrast
import com.workout.android.presentation.theme.customColor1ContainerDark
import com.workout.android.presentation.theme.customColor1ContainerDarkHighContrast
import com.workout.android.presentation.theme.customColor1ContainerDarkMediumContrast
import com.workout.android.presentation.theme.customColor1ContainerLight
import com.workout.android.presentation.theme.customColor1ContainerLightHighContrast
import com.workout.android.presentation.theme.customColor1ContainerLightMediumContrast
import com.workout.android.presentation.theme.customColor1Dark
import com.workout.android.presentation.theme.customColor1DarkHighContrast
import com.workout.android.presentation.theme.customColor1DarkMediumContrast
import com.workout.android.presentation.theme.customColor1Light
import com.workout.android.presentation.theme.customColor1LightHighContrast
import com.workout.android.presentation.theme.customColor1LightMediumContrast
import com.workout.android.presentation.theme.customColor2ContainerDark
import com.workout.android.presentation.theme.customColor2ContainerDarkHighContrast
import com.workout.android.presentation.theme.customColor2ContainerDarkMediumContrast
import com.workout.android.presentation.theme.customColor2ContainerLight
import com.workout.android.presentation.theme.customColor2ContainerLightHighContrast
import com.workout.android.presentation.theme.customColor2ContainerLightMediumContrast
import com.workout.android.presentation.theme.customColor2Dark
import com.workout.android.presentation.theme.customColor2DarkHighContrast
import com.workout.android.presentation.theme.customColor2DarkMediumContrast
import com.workout.android.presentation.theme.customColor2Light
import com.workout.android.presentation.theme.customColor2LightHighContrast
import com.workout.android.presentation.theme.customColor2LightMediumContrast
import com.workout.android.presentation.theme.customColor3ContainerDark
import com.workout.android.presentation.theme.customColor3ContainerDarkHighContrast
import com.workout.android.presentation.theme.customColor3ContainerDarkMediumContrast
import com.workout.android.presentation.theme.customColor3ContainerLight
import com.workout.android.presentation.theme.customColor3ContainerLightHighContrast
import com.workout.android.presentation.theme.customColor3ContainerLightMediumContrast
import com.workout.android.presentation.theme.customColor3Dark
import com.workout.android.presentation.theme.customColor3DarkHighContrast
import com.workout.android.presentation.theme.customColor3DarkMediumContrast
import com.workout.android.presentation.theme.customColor3Light
import com.workout.android.presentation.theme.customColor3LightHighContrast
import com.workout.android.presentation.theme.customColor3LightMediumContrast
import com.workout.android.presentation.theme.errorContainerDark
import com.workout.android.presentation.theme.errorContainerDarkHighContrast
import com.workout.android.presentation.theme.errorContainerDarkMediumContrast
import com.workout.android.presentation.theme.errorContainerLight
import com.workout.android.presentation.theme.errorContainerLightHighContrast
import com.workout.android.presentation.theme.errorContainerLightMediumContrast
import com.workout.android.presentation.theme.errorDark
import com.workout.android.presentation.theme.errorDarkHighContrast
import com.workout.android.presentation.theme.errorDarkMediumContrast
import com.workout.android.presentation.theme.errorLight
import com.workout.android.presentation.theme.errorLightHighContrast
import com.workout.android.presentation.theme.errorLightMediumContrast
import com.workout.android.presentation.theme.inverseOnSurfaceDark
import com.workout.android.presentation.theme.inverseOnSurfaceDarkHighContrast
import com.workout.android.presentation.theme.inverseOnSurfaceDarkMediumContrast
import com.workout.android.presentation.theme.inverseOnSurfaceLight
import com.workout.android.presentation.theme.inverseOnSurfaceLightHighContrast
import com.workout.android.presentation.theme.inverseOnSurfaceLightMediumContrast
import com.workout.android.presentation.theme.inversePrimaryDark
import com.workout.android.presentation.theme.inversePrimaryDarkHighContrast
import com.workout.android.presentation.theme.inversePrimaryDarkMediumContrast
import com.workout.android.presentation.theme.inversePrimaryLight
import com.workout.android.presentation.theme.inversePrimaryLightHighContrast
import com.workout.android.presentation.theme.inversePrimaryLightMediumContrast
import com.workout.android.presentation.theme.inverseSurfaceDark
import com.workout.android.presentation.theme.inverseSurfaceDarkHighContrast
import com.workout.android.presentation.theme.inverseSurfaceDarkMediumContrast
import com.workout.android.presentation.theme.inverseSurfaceLight
import com.workout.android.presentation.theme.inverseSurfaceLightHighContrast
import com.workout.android.presentation.theme.inverseSurfaceLightMediumContrast
import com.workout.android.presentation.theme.onBackgroundDark
import com.workout.android.presentation.theme.onBackgroundDarkHighContrast
import com.workout.android.presentation.theme.onBackgroundDarkMediumContrast
import com.workout.android.presentation.theme.onBackgroundLight
import com.workout.android.presentation.theme.onBackgroundLightHighContrast
import com.workout.android.presentation.theme.onBackgroundLightMediumContrast
import com.workout.android.presentation.theme.onCustomColor1ContainerDark
import com.workout.android.presentation.theme.onCustomColor1ContainerDarkHighContrast
import com.workout.android.presentation.theme.onCustomColor1ContainerDarkMediumContrast
import com.workout.android.presentation.theme.onCustomColor1ContainerLight
import com.workout.android.presentation.theme.onCustomColor1ContainerLightHighContrast
import com.workout.android.presentation.theme.onCustomColor1ContainerLightMediumContrast
import com.workout.android.presentation.theme.onCustomColor1Dark
import com.workout.android.presentation.theme.onCustomColor1DarkHighContrast
import com.workout.android.presentation.theme.onCustomColor1DarkMediumContrast
import com.workout.android.presentation.theme.onCustomColor1Light
import com.workout.android.presentation.theme.onCustomColor1LightHighContrast
import com.workout.android.presentation.theme.onCustomColor1LightMediumContrast
import com.workout.android.presentation.theme.onCustomColor2ContainerDark
import com.workout.android.presentation.theme.onCustomColor2ContainerDarkHighContrast
import com.workout.android.presentation.theme.onCustomColor2ContainerDarkMediumContrast
import com.workout.android.presentation.theme.onCustomColor2ContainerLight
import com.workout.android.presentation.theme.onCustomColor2ContainerLightHighContrast
import com.workout.android.presentation.theme.onCustomColor2ContainerLightMediumContrast
import com.workout.android.presentation.theme.onCustomColor2Dark
import com.workout.android.presentation.theme.onCustomColor2DarkHighContrast
import com.workout.android.presentation.theme.onCustomColor2DarkMediumContrast
import com.workout.android.presentation.theme.onCustomColor2Light
import com.workout.android.presentation.theme.onCustomColor2LightHighContrast
import com.workout.android.presentation.theme.onCustomColor2LightMediumContrast
import com.workout.android.presentation.theme.onCustomColor3ContainerDark
import com.workout.android.presentation.theme.onCustomColor3ContainerDarkHighContrast
import com.workout.android.presentation.theme.onCustomColor3ContainerDarkMediumContrast
import com.workout.android.presentation.theme.onCustomColor3ContainerLight
import com.workout.android.presentation.theme.onCustomColor3ContainerLightHighContrast
import com.workout.android.presentation.theme.onCustomColor3ContainerLightMediumContrast
import com.workout.android.presentation.theme.onCustomColor3Dark
import com.workout.android.presentation.theme.onCustomColor3DarkHighContrast
import com.workout.android.presentation.theme.onCustomColor3DarkMediumContrast
import com.workout.android.presentation.theme.onCustomColor3Light
import com.workout.android.presentation.theme.onCustomColor3LightHighContrast
import com.workout.android.presentation.theme.onCustomColor3LightMediumContrast
import com.workout.android.presentation.theme.onErrorContainerDark
import com.workout.android.presentation.theme.onErrorContainerDarkHighContrast
import com.workout.android.presentation.theme.onErrorContainerDarkMediumContrast
import com.workout.android.presentation.theme.onErrorContainerLight
import com.workout.android.presentation.theme.onErrorContainerLightHighContrast
import com.workout.android.presentation.theme.onErrorContainerLightMediumContrast
import com.workout.android.presentation.theme.onErrorDark
import com.workout.android.presentation.theme.onErrorDarkHighContrast
import com.workout.android.presentation.theme.onErrorDarkMediumContrast
import com.workout.android.presentation.theme.onErrorLight
import com.workout.android.presentation.theme.onErrorLightHighContrast
import com.workout.android.presentation.theme.onErrorLightMediumContrast
import com.workout.android.presentation.theme.onPrimaryContainerDark
import com.workout.android.presentation.theme.onPrimaryContainerDarkHighContrast
import com.workout.android.presentation.theme.onPrimaryContainerDarkMediumContrast
import com.workout.android.presentation.theme.onPrimaryContainerLight
import com.workout.android.presentation.theme.onPrimaryContainerLightHighContrast
import com.workout.android.presentation.theme.onPrimaryContainerLightMediumContrast
import com.workout.android.presentation.theme.onPrimaryDark
import com.workout.android.presentation.theme.onPrimaryDarkHighContrast
import com.workout.android.presentation.theme.onPrimaryDarkMediumContrast
import com.workout.android.presentation.theme.onPrimaryLight
import com.workout.android.presentation.theme.onPrimaryLightHighContrast
import com.workout.android.presentation.theme.onPrimaryLightMediumContrast
import com.workout.android.presentation.theme.onSecondaryContainerDark
import com.workout.android.presentation.theme.onSecondaryContainerDarkHighContrast
import com.workout.android.presentation.theme.onSecondaryContainerDarkMediumContrast
import com.workout.android.presentation.theme.onSecondaryContainerLight
import com.workout.android.presentation.theme.onSecondaryContainerLightHighContrast
import com.workout.android.presentation.theme.onSecondaryContainerLightMediumContrast
import com.workout.android.presentation.theme.onSecondaryDark
import com.workout.android.presentation.theme.onSecondaryDarkHighContrast
import com.workout.android.presentation.theme.onSecondaryDarkMediumContrast
import com.workout.android.presentation.theme.onSecondaryLight
import com.workout.android.presentation.theme.onSecondaryLightHighContrast
import com.workout.android.presentation.theme.onSecondaryLightMediumContrast
import com.workout.android.presentation.theme.onSurfaceDark
import com.workout.android.presentation.theme.onSurfaceDarkHighContrast
import com.workout.android.presentation.theme.onSurfaceDarkMediumContrast
import com.workout.android.presentation.theme.onSurfaceLight
import com.workout.android.presentation.theme.onSurfaceLightHighContrast
import com.workout.android.presentation.theme.onSurfaceLightMediumContrast
import com.workout.android.presentation.theme.onSurfaceVariantDark
import com.workout.android.presentation.theme.onSurfaceVariantDarkHighContrast
import com.workout.android.presentation.theme.onSurfaceVariantDarkMediumContrast
import com.workout.android.presentation.theme.onSurfaceVariantLight
import com.workout.android.presentation.theme.onSurfaceVariantLightHighContrast
import com.workout.android.presentation.theme.onSurfaceVariantLightMediumContrast
import com.workout.android.presentation.theme.onTertiaryContainerDark
import com.workout.android.presentation.theme.onTertiaryContainerDarkHighContrast
import com.workout.android.presentation.theme.onTertiaryContainerDarkMediumContrast
import com.workout.android.presentation.theme.onTertiaryContainerLight
import com.workout.android.presentation.theme.onTertiaryContainerLightHighContrast
import com.workout.android.presentation.theme.onTertiaryContainerLightMediumContrast
import com.workout.android.presentation.theme.onTertiaryDark
import com.workout.android.presentation.theme.onTertiaryDarkHighContrast
import com.workout.android.presentation.theme.onTertiaryDarkMediumContrast
import com.workout.android.presentation.theme.onTertiaryLight
import com.workout.android.presentation.theme.onTertiaryLightHighContrast
import com.workout.android.presentation.theme.onTertiaryLightMediumContrast
import com.workout.android.presentation.theme.outlineDark
import com.workout.android.presentation.theme.outlineDarkHighContrast
import com.workout.android.presentation.theme.outlineDarkMediumContrast
import com.workout.android.presentation.theme.outlineLight
import com.workout.android.presentation.theme.outlineLightHighContrast
import com.workout.android.presentation.theme.outlineLightMediumContrast
import com.workout.android.presentation.theme.outlineVariantDark
import com.workout.android.presentation.theme.outlineVariantDarkHighContrast
import com.workout.android.presentation.theme.outlineVariantDarkMediumContrast
import com.workout.android.presentation.theme.outlineVariantLight
import com.workout.android.presentation.theme.outlineVariantLightHighContrast
import com.workout.android.presentation.theme.outlineVariantLightMediumContrast
import com.workout.android.presentation.theme.primaryContainerDark
import com.workout.android.presentation.theme.primaryContainerDarkHighContrast
import com.workout.android.presentation.theme.primaryContainerDarkMediumContrast
import com.workout.android.presentation.theme.primaryContainerLight
import com.workout.android.presentation.theme.primaryContainerLightHighContrast
import com.workout.android.presentation.theme.primaryContainerLightMediumContrast
import com.workout.android.presentation.theme.primaryDark
import com.workout.android.presentation.theme.primaryDarkHighContrast
import com.workout.android.presentation.theme.primaryDarkMediumContrast
import com.workout.android.presentation.theme.primaryLight
import com.workout.android.presentation.theme.primaryLightHighContrast
import com.workout.android.presentation.theme.primaryLightMediumContrast
import com.workout.android.presentation.theme.scrimDark
import com.workout.android.presentation.theme.scrimDarkHighContrast
import com.workout.android.presentation.theme.scrimDarkMediumContrast
import com.workout.android.presentation.theme.scrimLight
import com.workout.android.presentation.theme.scrimLightHighContrast
import com.workout.android.presentation.theme.scrimLightMediumContrast
import com.workout.android.presentation.theme.secondaryContainerDark
import com.workout.android.presentation.theme.secondaryContainerDarkHighContrast
import com.workout.android.presentation.theme.secondaryContainerDarkMediumContrast
import com.workout.android.presentation.theme.secondaryContainerLight
import com.workout.android.presentation.theme.secondaryContainerLightHighContrast
import com.workout.android.presentation.theme.secondaryContainerLightMediumContrast
import com.workout.android.presentation.theme.secondaryDark
import com.workout.android.presentation.theme.secondaryDarkHighContrast
import com.workout.android.presentation.theme.secondaryDarkMediumContrast
import com.workout.android.presentation.theme.secondaryLight
import com.workout.android.presentation.theme.secondaryLightHighContrast
import com.workout.android.presentation.theme.secondaryLightMediumContrast
import com.workout.android.presentation.theme.surfaceBrightDark
import com.workout.android.presentation.theme.surfaceBrightDarkHighContrast
import com.workout.android.presentation.theme.surfaceBrightDarkMediumContrast
import com.workout.android.presentation.theme.surfaceBrightLight
import com.workout.android.presentation.theme.surfaceBrightLightHighContrast
import com.workout.android.presentation.theme.surfaceBrightLightMediumContrast
import com.workout.android.presentation.theme.surfaceContainerDark
import com.workout.android.presentation.theme.surfaceContainerDarkHighContrast
import com.workout.android.presentation.theme.surfaceContainerDarkMediumContrast
import com.workout.android.presentation.theme.surfaceContainerHighDark
import com.workout.android.presentation.theme.surfaceContainerHighDarkHighContrast
import com.workout.android.presentation.theme.surfaceContainerHighDarkMediumContrast
import com.workout.android.presentation.theme.surfaceContainerHighLight
import com.workout.android.presentation.theme.surfaceContainerHighLightHighContrast
import com.workout.android.presentation.theme.surfaceContainerHighLightMediumContrast
import com.workout.android.presentation.theme.surfaceContainerHighestDark
import com.workout.android.presentation.theme.surfaceContainerHighestDarkHighContrast
import com.workout.android.presentation.theme.surfaceContainerHighestDarkMediumContrast
import com.workout.android.presentation.theme.surfaceContainerHighestLight
import com.workout.android.presentation.theme.surfaceContainerHighestLightHighContrast
import com.workout.android.presentation.theme.surfaceContainerHighestLightMediumContrast
import com.workout.android.presentation.theme.surfaceContainerLight
import com.workout.android.presentation.theme.surfaceContainerLightHighContrast
import com.workout.android.presentation.theme.surfaceContainerLightMediumContrast
import com.workout.android.presentation.theme.surfaceContainerLowDark
import com.workout.android.presentation.theme.surfaceContainerLowDarkHighContrast
import com.workout.android.presentation.theme.surfaceContainerLowDarkMediumContrast
import com.workout.android.presentation.theme.surfaceContainerLowLight
import com.workout.android.presentation.theme.surfaceContainerLowLightHighContrast
import com.workout.android.presentation.theme.surfaceContainerLowLightMediumContrast
import com.workout.android.presentation.theme.surfaceContainerLowestDark
import com.workout.android.presentation.theme.surfaceContainerLowestDarkHighContrast
import com.workout.android.presentation.theme.surfaceContainerLowestDarkMediumContrast
import com.workout.android.presentation.theme.surfaceContainerLowestLight
import com.workout.android.presentation.theme.surfaceContainerLowestLightHighContrast
import com.workout.android.presentation.theme.surfaceContainerLowestLightMediumContrast
import com.workout.android.presentation.theme.surfaceDark
import com.workout.android.presentation.theme.surfaceDarkHighContrast
import com.workout.android.presentation.theme.surfaceDarkMediumContrast
import com.workout.android.presentation.theme.surfaceDimDark
import com.workout.android.presentation.theme.surfaceDimDarkHighContrast
import com.workout.android.presentation.theme.surfaceDimDarkMediumContrast
import com.workout.android.presentation.theme.surfaceDimLight
import com.workout.android.presentation.theme.surfaceDimLightHighContrast
import com.workout.android.presentation.theme.surfaceDimLightMediumContrast
import com.workout.android.presentation.theme.surfaceLight
import com.workout.android.presentation.theme.surfaceLightHighContrast
import com.workout.android.presentation.theme.surfaceLightMediumContrast
import com.workout.android.presentation.theme.surfaceVariantDark
import com.workout.android.presentation.theme.surfaceVariantDarkHighContrast
import com.workout.android.presentation.theme.surfaceVariantDarkMediumContrast
import com.workout.android.presentation.theme.surfaceVariantLight
import com.workout.android.presentation.theme.surfaceVariantLightHighContrast
import com.workout.android.presentation.theme.surfaceVariantLightMediumContrast
import com.workout.android.presentation.theme.tertiaryContainerDark
import com.workout.android.presentation.theme.tertiaryContainerDarkHighContrast
import com.workout.android.presentation.theme.tertiaryContainerDarkMediumContrast
import com.workout.android.presentation.theme.tertiaryContainerLight
import com.workout.android.presentation.theme.tertiaryContainerLightHighContrast
import com.workout.android.presentation.theme.tertiaryContainerLightMediumContrast
import com.workout.android.presentation.theme.tertiaryDark
import com.workout.android.presentation.theme.tertiaryDarkHighContrast
import com.workout.android.presentation.theme.tertiaryDarkMediumContrast
import com.workout.android.presentation.theme.tertiaryLight
import com.workout.android.presentation.theme.tertiaryLightHighContrast
import com.workout.android.presentation.theme.tertiaryLightMediumContrast

@Immutable
data class ExtendedColorScheme(
    val customColor1: ColorFamily,
    val customColor2: ColorFamily,
    val customColor3: ColorFamily,
)

private val lightScheme =
    lightColorScheme(
        primary = primaryLight,
        onPrimary = onPrimaryLight,
        primaryContainer = primaryContainerLight,
        onPrimaryContainer = onPrimaryContainerLight,
        secondary = secondaryLight,
        onSecondary = onSecondaryLight,
        secondaryContainer = secondaryContainerLight,
        onSecondaryContainer = onSecondaryContainerLight,
        tertiary = tertiaryLight,
        onTertiary = onTertiaryLight,
        tertiaryContainer = tertiaryContainerLight,
        onTertiaryContainer = onTertiaryContainerLight,
        error = errorLight,
        onError = onErrorLight,
        errorContainer = errorContainerLight,
        onErrorContainer = onErrorContainerLight,
        background = backgroundLight,
        onBackground = onBackgroundLight,
        surface = surfaceLight,
        onSurface = onSurfaceLight,
        surfaceVariant = surfaceVariantLight,
        onSurfaceVariant = onSurfaceVariantLight,
        outline = outlineLight,
        outlineVariant = outlineVariantLight,
        scrim = scrimLight,
        inverseSurface = inverseSurfaceLight,
        inverseOnSurface = inverseOnSurfaceLight,
        inversePrimary = inversePrimaryLight,
        surfaceDim = surfaceDimLight,
        surfaceBright = surfaceBrightLight,
        surfaceContainerLowest = surfaceContainerLowestLight,
        surfaceContainerLow = surfaceContainerLowLight,
        surfaceContainer = surfaceContainerLight,
        surfaceContainerHigh = surfaceContainerHighLight,
        surfaceContainerHighest = surfaceContainerHighestLight,
    )

private val darkScheme =
    darkColorScheme(
        primary = primaryDark,
        onPrimary = onPrimaryDark,
        primaryContainer = primaryContainerDark,
        onPrimaryContainer = onPrimaryContainerDark,
        secondary = secondaryDark,
        onSecondary = onSecondaryDark,
        secondaryContainer = secondaryContainerDark,
        onSecondaryContainer = onSecondaryContainerDark,
        tertiary = tertiaryDark,
        onTertiary = onTertiaryDark,
        tertiaryContainer = tertiaryContainerDark,
        onTertiaryContainer = onTertiaryContainerDark,
        error = errorDark,
        onError = onErrorDark,
        errorContainer = errorContainerDark,
        onErrorContainer = onErrorContainerDark,
        background = backgroundDark,
        onBackground = onBackgroundDark,
        surface = surfaceDark,
        onSurface = onSurfaceDark,
        surfaceVariant = surfaceVariantDark,
        onSurfaceVariant = onSurfaceVariantDark,
        outline = outlineDark,
        outlineVariant = outlineVariantDark,
        scrim = scrimDark,
        inverseSurface = inverseSurfaceDark,
        inverseOnSurface = inverseOnSurfaceDark,
        inversePrimary = inversePrimaryDark,
        surfaceDim = surfaceDimDark,
        surfaceBright = surfaceBrightDark,
        surfaceContainerLowest = surfaceContainerLowestDark,
        surfaceContainerLow = surfaceContainerLowDark,
        surfaceContainer = surfaceContainerDark,
        surfaceContainerHigh = surfaceContainerHighDark,
        surfaceContainerHighest = surfaceContainerHighestDark,
    )

private val mediumContrastLightColorScheme =
    lightColorScheme(
        primary = primaryLightMediumContrast,
        onPrimary = onPrimaryLightMediumContrast,
        primaryContainer = primaryContainerLightMediumContrast,
        onPrimaryContainer = onPrimaryContainerLightMediumContrast,
        secondary = secondaryLightMediumContrast,
        onSecondary = onSecondaryLightMediumContrast,
        secondaryContainer = secondaryContainerLightMediumContrast,
        onSecondaryContainer = onSecondaryContainerLightMediumContrast,
        tertiary = tertiaryLightMediumContrast,
        onTertiary = onTertiaryLightMediumContrast,
        tertiaryContainer = tertiaryContainerLightMediumContrast,
        onTertiaryContainer = onTertiaryContainerLightMediumContrast,
        error = errorLightMediumContrast,
        onError = onErrorLightMediumContrast,
        errorContainer = errorContainerLightMediumContrast,
        onErrorContainer = onErrorContainerLightMediumContrast,
        background = backgroundLightMediumContrast,
        onBackground = onBackgroundLightMediumContrast,
        surface = surfaceLightMediumContrast,
        onSurface = onSurfaceLightMediumContrast,
        surfaceVariant = surfaceVariantLightMediumContrast,
        onSurfaceVariant = onSurfaceVariantLightMediumContrast,
        outline = outlineLightMediumContrast,
        outlineVariant = outlineVariantLightMediumContrast,
        scrim = scrimLightMediumContrast,
        inverseSurface = inverseSurfaceLightMediumContrast,
        inverseOnSurface = inverseOnSurfaceLightMediumContrast,
        inversePrimary = inversePrimaryLightMediumContrast,
        surfaceDim = surfaceDimLightMediumContrast,
        surfaceBright = surfaceBrightLightMediumContrast,
        surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
        surfaceContainerLow = surfaceContainerLowLightMediumContrast,
        surfaceContainer = surfaceContainerLightMediumContrast,
        surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
        surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
    )

private val highContrastLightColorScheme =
    lightColorScheme(
        primary = primaryLightHighContrast,
        onPrimary = onPrimaryLightHighContrast,
        primaryContainer = primaryContainerLightHighContrast,
        onPrimaryContainer = onPrimaryContainerLightHighContrast,
        secondary = secondaryLightHighContrast,
        onSecondary = onSecondaryLightHighContrast,
        secondaryContainer = secondaryContainerLightHighContrast,
        onSecondaryContainer = onSecondaryContainerLightHighContrast,
        tertiary = tertiaryLightHighContrast,
        onTertiary = onTertiaryLightHighContrast,
        tertiaryContainer = tertiaryContainerLightHighContrast,
        onTertiaryContainer = onTertiaryContainerLightHighContrast,
        error = errorLightHighContrast,
        onError = onErrorLightHighContrast,
        errorContainer = errorContainerLightHighContrast,
        onErrorContainer = onErrorContainerLightHighContrast,
        background = backgroundLightHighContrast,
        onBackground = onBackgroundLightHighContrast,
        surface = surfaceLightHighContrast,
        onSurface = onSurfaceLightHighContrast,
        surfaceVariant = surfaceVariantLightHighContrast,
        onSurfaceVariant = onSurfaceVariantLightHighContrast,
        outline = outlineLightHighContrast,
        outlineVariant = outlineVariantLightHighContrast,
        scrim = scrimLightHighContrast,
        inverseSurface = inverseSurfaceLightHighContrast,
        inverseOnSurface = inverseOnSurfaceLightHighContrast,
        inversePrimary = inversePrimaryLightHighContrast,
        surfaceDim = surfaceDimLightHighContrast,
        surfaceBright = surfaceBrightLightHighContrast,
        surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
        surfaceContainerLow = surfaceContainerLowLightHighContrast,
        surfaceContainer = surfaceContainerLightHighContrast,
        surfaceContainerHigh = surfaceContainerHighLightHighContrast,
        surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
    )

private val mediumContrastDarkColorScheme =
    darkColorScheme(
        primary = primaryDarkMediumContrast,
        onPrimary = onPrimaryDarkMediumContrast,
        primaryContainer = primaryContainerDarkMediumContrast,
        onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
        secondary = secondaryDarkMediumContrast,
        onSecondary = onSecondaryDarkMediumContrast,
        secondaryContainer = secondaryContainerDarkMediumContrast,
        onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
        tertiary = tertiaryDarkMediumContrast,
        onTertiary = onTertiaryDarkMediumContrast,
        tertiaryContainer = tertiaryContainerDarkMediumContrast,
        onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
        error = errorDarkMediumContrast,
        onError = onErrorDarkMediumContrast,
        errorContainer = errorContainerDarkMediumContrast,
        onErrorContainer = onErrorContainerDarkMediumContrast,
        background = backgroundDarkMediumContrast,
        onBackground = onBackgroundDarkMediumContrast,
        surface = surfaceDarkMediumContrast,
        onSurface = onSurfaceDarkMediumContrast,
        surfaceVariant = surfaceVariantDarkMediumContrast,
        onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
        outline = outlineDarkMediumContrast,
        outlineVariant = outlineVariantDarkMediumContrast,
        scrim = scrimDarkMediumContrast,
        inverseSurface = inverseSurfaceDarkMediumContrast,
        inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
        inversePrimary = inversePrimaryDarkMediumContrast,
        surfaceDim = surfaceDimDarkMediumContrast,
        surfaceBright = surfaceBrightDarkMediumContrast,
        surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
        surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
        surfaceContainer = surfaceContainerDarkMediumContrast,
        surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
        surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
    )

private val highContrastDarkColorScheme =
    darkColorScheme(
        primary = primaryDarkHighContrast,
        onPrimary = onPrimaryDarkHighContrast,
        primaryContainer = primaryContainerDarkHighContrast,
        onPrimaryContainer = onPrimaryContainerDarkHighContrast,
        secondary = secondaryDarkHighContrast,
        onSecondary = onSecondaryDarkHighContrast,
        secondaryContainer = secondaryContainerDarkHighContrast,
        onSecondaryContainer = onSecondaryContainerDarkHighContrast,
        tertiary = tertiaryDarkHighContrast,
        onTertiary = onTertiaryDarkHighContrast,
        tertiaryContainer = tertiaryContainerDarkHighContrast,
        onTertiaryContainer = onTertiaryContainerDarkHighContrast,
        error = errorDarkHighContrast,
        onError = onErrorDarkHighContrast,
        errorContainer = errorContainerDarkHighContrast,
        onErrorContainer = onErrorContainerDarkHighContrast,
        background = backgroundDarkHighContrast,
        onBackground = onBackgroundDarkHighContrast,
        surface = surfaceDarkHighContrast,
        onSurface = onSurfaceDarkHighContrast,
        surfaceVariant = surfaceVariantDarkHighContrast,
        onSurfaceVariant = onSurfaceVariantDarkHighContrast,
        outline = outlineDarkHighContrast,
        outlineVariant = outlineVariantDarkHighContrast,
        scrim = scrimDarkHighContrast,
        inverseSurface = inverseSurfaceDarkHighContrast,
        inverseOnSurface = inverseOnSurfaceDarkHighContrast,
        inversePrimary = inversePrimaryDarkHighContrast,
        surfaceDim = surfaceDimDarkHighContrast,
        surfaceBright = surfaceBrightDarkHighContrast,
        surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
        surfaceContainerLow = surfaceContainerLowDarkHighContrast,
        surfaceContainer = surfaceContainerDarkHighContrast,
        surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
        surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
    )

val extendedLight =
    ExtendedColorScheme(
        customColor1 =
            ColorFamily(
                customColor1Light,
                onCustomColor1Light,
                customColor1ContainerLight,
                onCustomColor1ContainerLight,
            ),
        customColor2 =
            ColorFamily(
                customColor2Light,
                onCustomColor2Light,
                customColor2ContainerLight,
                onCustomColor2ContainerLight,
            ),
        customColor3 =
            ColorFamily(
                customColor3Light,
                onCustomColor3Light,
                customColor3ContainerLight,
                onCustomColor3ContainerLight,
            ),
    )

val extendedDark =
    ExtendedColorScheme(
        customColor1 =
            ColorFamily(
                customColor1Dark,
                onCustomColor1Dark,
                customColor1ContainerDark,
                onCustomColor1ContainerDark,
            ),
        customColor2 =
            ColorFamily(
                customColor2Dark,
                onCustomColor2Dark,
                customColor2ContainerDark,
                onCustomColor2ContainerDark,
            ),
        customColor3 =
            ColorFamily(
                customColor3Dark,
                onCustomColor3Dark,
                customColor3ContainerDark,
                onCustomColor3ContainerDark,
            ),
    )

val extendedLightMediumContrast =
    ExtendedColorScheme(
        customColor1 =
            ColorFamily(
                customColor1LightMediumContrast,
                onCustomColor1LightMediumContrast,
                customColor1ContainerLightMediumContrast,
                onCustomColor1ContainerLightMediumContrast,
            ),
        customColor2 =
            ColorFamily(
                customColor2LightMediumContrast,
                onCustomColor2LightMediumContrast,
                customColor2ContainerLightMediumContrast,
                onCustomColor2ContainerLightMediumContrast,
            ),
        customColor3 =
            ColorFamily(
                customColor3LightMediumContrast,
                onCustomColor3LightMediumContrast,
                customColor3ContainerLightMediumContrast,
                onCustomColor3ContainerLightMediumContrast,
            ),
    )

val extendedLightHighContrast =
    ExtendedColorScheme(
        customColor1 =
            ColorFamily(
                customColor1LightHighContrast,
                onCustomColor1LightHighContrast,
                customColor1ContainerLightHighContrast,
                onCustomColor1ContainerLightHighContrast,
            ),
        customColor2 =
            ColorFamily(
                customColor2LightHighContrast,
                onCustomColor2LightHighContrast,
                customColor2ContainerLightHighContrast,
                onCustomColor2ContainerLightHighContrast,
            ),
        customColor3 =
            ColorFamily(
                customColor3LightHighContrast,
                onCustomColor3LightHighContrast,
                customColor3ContainerLightHighContrast,
                onCustomColor3ContainerLightHighContrast,
            ),
    )

val extendedDarkMediumContrast =
    ExtendedColorScheme(
        customColor1 =
            ColorFamily(
                customColor1DarkMediumContrast,
                onCustomColor1DarkMediumContrast,
                customColor1ContainerDarkMediumContrast,
                onCustomColor1ContainerDarkMediumContrast,
            ),
        customColor2 =
            ColorFamily(
                customColor2DarkMediumContrast,
                onCustomColor2DarkMediumContrast,
                customColor2ContainerDarkMediumContrast,
                onCustomColor2ContainerDarkMediumContrast,
            ),
        customColor3 =
            ColorFamily(
                customColor3DarkMediumContrast,
                onCustomColor3DarkMediumContrast,
                customColor3ContainerDarkMediumContrast,
                onCustomColor3ContainerDarkMediumContrast,
            ),
    )

val extendedDarkHighContrast =
    ExtendedColorScheme(
        customColor1 =
            ColorFamily(
                customColor1DarkHighContrast,
                onCustomColor1DarkHighContrast,
                customColor1ContainerDarkHighContrast,
                onCustomColor1ContainerDarkHighContrast,
            ),
        customColor2 =
            ColorFamily(
                customColor2DarkHighContrast,
                onCustomColor2DarkHighContrast,
                customColor2ContainerDarkHighContrast,
                onCustomColor2ContainerDarkHighContrast,
            ),
        customColor3 =
            ColorFamily(
                customColor3DarkHighContrast,
                onCustomColor3DarkHighContrast,
                customColor3ContainerDarkHighContrast,
                onCustomColor3ContainerDarkHighContrast,
            ),
    )

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color,
)

val unspecified_scheme =
    ColorFamily(
        Color.Unspecified,
        Color.Unspecified,
        Color.Unspecified,
        Color.Unspecified,
    )

@Suppress("ktlint:standard:function-naming")
@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content:
        @Composable()
        () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) darkScheme else lightScheme,
        typography = getAppTypography(),
        content = content,
    )
}
