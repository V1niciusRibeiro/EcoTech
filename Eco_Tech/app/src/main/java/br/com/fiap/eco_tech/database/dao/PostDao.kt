package br.com.fiap.eco_tech.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.eco_tech.mvvm.model.Post

@Dao
interface PostDao {

    @Insert
    fun post(post: Post): Long

    @Update
    fun put(post: Post): Int

    @Delete
    fun delete(post: Post): Int

    @Query("SELECT * FROM TB_POST WHERE id_post = :id")
    fun getById(id: Int): Post

    @Query(value = "SELECT * FROM TB_POST ORDER BY nm_post ASC")
    fun getAll(): List<Post>

}