package com.example.domainfishing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold

import androidx.compose.ui.Modifier

import com.example.domainfishing.Screens.MainAppScreen
import com.example.domainfishing.ui.theme.DomainFishingTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DomainFishingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   androidx.compose.foundation.layout.Box(modifier = Modifier.padding(innerPadding)){
                       MainAppScreen()
                   }
                }
            }
        }
    }
}
