package com.example.dermage

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Ativa o modo edge-to-edge (usar toda a tela)
        enableEdgeToEdge()

        // Define o layout da tela
        setContentView(R.layout.dados_pele)

        // Pega o primeiro filho do conteúdo principal (a raiz do layout)
        val root = findViewById<ViewGroup>(android.R.id.content).getChildAt(0)

        // Ajusta padding para não sobrepor status bar e navigation bar
        ViewCompat.setOnApplyWindowInsetsListener(root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }
    }
}
