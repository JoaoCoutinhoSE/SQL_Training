package com.example.sqlitetraining


class Cliente{
        val Nome: String
        var Codigo: Int = 0
        var Telefone: String
        val email: String

    //constructor insert
    constructor(Nome: String, Codigo: Int, Telefone: String, email: String){
        this.Nome = Nome
        this.Codigo = Codigo
        this.Telefone = Telefone
        this.email = email
    }
    //constructor update

    constructor(Nome: String, Telefone: String, email: String){
        this.Nome = Nome
        this.Telefone = Telefone
        this.email = email


    }

}