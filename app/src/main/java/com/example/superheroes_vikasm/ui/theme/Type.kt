package com.example.superheroes_vikasm.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroes_vikasm.R

// Title Font
val AbrilFatface = FontFamily(
    Font(R.font.abril_fatface_regular)
)

// Hero Name Font
val MontserratBold = FontFamily(
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

// Description Font
val MontserratRegular = FontFamily(
    Font(R.font.montserrat_regular, FontWeight.Normal)
)

val Typography = Typography(

    displayLarge = TextStyle(
        fontFamily = AbrilFatface,
        fontSize = 36.sp
    ),

    displayMedium = TextStyle(
        fontFamily = MontserratBold,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = MontserratRegular,
        fontSize = 16.sp
    )
)