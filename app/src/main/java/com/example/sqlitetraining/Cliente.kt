package com.example.sqlitetraining

class Cliente{
        var Nome: String
        val Codigo: Int
        val Telefone: Int
        var email: String

    //constructor insert
    constructor(Nome: String, Codigo: Int, Telefone: Int, email: String){
        this.Nome = Nome
        this.Codigo = Codigo
        this.Telefone = Telefone
        this.email = email
    }
    //constructor update

    constructor(Nome: String, Telefone: Int, email: String{
        this.Nome = Nome
        this.Telefone = Telefone
        this.email = email


    }
}