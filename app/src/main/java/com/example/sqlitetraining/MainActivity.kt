package com.example.sqlitetraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var editCodigo
    var editEmail
    var editNome
    var editTelefone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editCodigo = findViewById(R.id.editCodigo)
        editEmail = findViewById(R.id.editEmail)
    }
}
