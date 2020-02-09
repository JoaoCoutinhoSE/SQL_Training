package com.example.sqlitetraining

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Banco_dados(context: Context,
                  name: String?,
                  factory: SQLiteDatabase.CursorFactory?,
                  version: Int
) : SQLiteOpenHelper(context, name, factory, version) {

    private const val SQL_CREATE_ENTRIES = "Create.db"

    override fun onCreate(db: SQLiteDatabase?) {


    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    companion object {

        const val version = 1
        const val name = "Banco_dados"


    }

}
