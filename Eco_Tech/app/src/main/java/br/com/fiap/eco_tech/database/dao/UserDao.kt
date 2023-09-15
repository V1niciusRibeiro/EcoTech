package br.com.fiap.eco_tech.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.eco_tech.mvvm.model.User

@Dao
interface UserDao {

    @Insert
    fun post(user: User): Long

    @Update
    fun put(user: User): Int

    @Delete
    fun delete(user: User): Int

    @Query("SELECT * FROM TB_USER WHERE id_user = :id")
    fun getById(id: Int): User

    @Query(value = "SELECT * FROM TB_USER ORDER BY nm_user ASC")
    fun getAll(): List<User>

}