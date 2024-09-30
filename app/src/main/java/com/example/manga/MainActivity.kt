package com.example.manga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.manga.ui.theme.MangaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val buttonNavigate = findViewById<Button>(R.id.text_button)

        // Definir a ação de clique no botão
        buttonNavigate.setOnClickListener {
            // Criar um Intent para navegar para a SecondActivity
            val intent = Intent(this, SecActi::class.java)
            startActivity(intent)
    }}}
