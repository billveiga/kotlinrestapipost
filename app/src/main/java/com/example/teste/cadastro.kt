package com.example.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val buttonConfirmar = findViewById<Button>(R.id.button_confirmar)

        buttonConfirmar.setOnClickListener {
            val abrirCadastro = Intent(this, cadastro::class.java)
            startActivity(abrirCadastro)

        }
    }
}