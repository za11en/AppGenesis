package com.appgenesis
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import com.appgenesis.ui.AppGenesisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppGenesisTheme {
                Surface { Text("AppGenesis: Active Monitoring") }
            }
        }
    }
}
