package com.example.sqlitetraining

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val db = Banco_dados(this)

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

        db.add_cliente(Cliente("Joao", "996403529", "joao@joao.com"))

        Toast.makeText(this, "Salvo com sucesso", Toast.LENGTH_SHORT).show()

    }
}
