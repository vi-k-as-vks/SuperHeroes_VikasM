@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.superheroes_vikasm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.superheroes_vikasm.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SuperheroesTheme {
                SuperHeroesApp()
            }
        }
    }
}

@Composable
fun SuperHeroesApp() {

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Superheroes",
                        style = MaterialTheme.typography.displayLarge
                    )
                }
            )
        }
    ) { innerPadding ->

        HeroesScreen(
            modifier = Modifier.padding(innerPadding)
        )
    }
}