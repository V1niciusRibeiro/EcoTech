package br.com.fiap.eco_tech.database.repository

import android.content.ContentValues
import android.content.Context
import android.util.Log
import br.com.fiap.eco_tech.database.DB_Connection
import br.com.fiap.eco_tech.mvvm.model.User

class UserRepository(context: Context) {

    private val db = DB_Connection.getDatabase(context).UserDao()

    fun post(user: User): Long {
        return db.post(user)
    }

    fun put(user: User): Int {
        return db.put(user)
    }

    fun delete(user: User): Int {
        return db.delete(user)
    }

    fun getById(id: Int): User {
        return db.getById(id)
    }

    fun getAll(): List<User> {
        return db.getAll()
    }

}