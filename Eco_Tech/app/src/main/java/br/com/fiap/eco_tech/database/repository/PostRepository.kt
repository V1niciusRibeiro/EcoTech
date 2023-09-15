package br.com.fiap.eco_tech.database.repository

import android.content.Context
import br.com.fiap.eco_tech.database.DB_Connection
import br.com.fiap.eco_tech.mvvm.model.Post

class PostRepository(context: Context) {

    private val db = DB_Connection.getDatabase(context).PostDao()

    fun post(post: Post): Long {
        return db.post(post)
    }

    fun put(post: Post): Int {
        return db.put(post)
    }

    fun delete(post: Post): Int {
        return db.delete(post)
    }

    fun getAll(): List<Post> {
        return db.getAll()
    }

    fun getById(id: Int): Post {
        return db.getById(id)
    }

}