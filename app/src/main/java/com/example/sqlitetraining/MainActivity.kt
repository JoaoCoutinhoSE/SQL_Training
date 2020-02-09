package com.example.sqlitetraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


//    var editCodigo
//    var editEmail
//    var editNome
//    var editTelefone
//
//    var btnSalvar
//    var btnAtualizar
//    var btnExcluir
//
//    var listViewClientes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_excluir = findViewById<Button>(R.id.btnExcluir)
        val button_salvar = findViewById<Button>(R.id.btnSalvar)
        val button_atualizar = findViewById<Button>(R.id.btnAtualizar)

        val editCodigo = findViewById<TextView>(R.id.editCodigo)
        val editEmail = findViewById<TextView>(R.id.editEmail)
        val editTelefone = findViewById<TextView>(R.id.editTelefone)
        val editNome = findViewById<TextView>(R.id.editNome)

        val listViewClientes = findViewById<ListView>(R.id.listViewClientes)

        //ENTRADA E DELETA BANCO DE DADOS




//        editCodigo = findViewById(R.id.editCodigo)
//        editEmail = findViewById(R.id.editEmail)
//        editNome = findViewById(R.id.editNome)
//        editTelefone = findViewById(R.id.editTelefone)
//
//        btnSalvar = findViewById(R.id.btnSalvar)
//        btnAtualizar = findViewById(R.id.btnAtualizar)
//        btnExcluir = findViewById(R.id.btnExcluir)
//
//        listViewClientes = findViewById(R.id.listViewClientes)
    }
}
