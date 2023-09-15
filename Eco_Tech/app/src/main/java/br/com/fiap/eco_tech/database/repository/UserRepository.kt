package br.com.fiap.eco_tech.database.repository

import android.content.Context
import br.com.fiap.eco_tech.database.DB_Connection
import br.com.fiap.eco_tech.mvvm.model.User

class UserRepository(context: Context) {

    private val db = DB_Connection.getDatabase(context).UserDao()

    fun post(user: User): Long {
        return db.post(user)
    }

    fun atualizar(user: User): Int {
        return db.put(user)
    }

    fun excluir(user: User): Int {
        return db.delete(user)
    }

    fun listarContatos(): List<User> {
        return db.getAll()
    }

    fun buscarContatoPeloId(id: Int): User {
        return db.getById(id)
    }

}