package br.com.fiap.eco_tech.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.eco_tech.database.dao.PostDao
import br.com.fiap.eco_tech.database.dao.UserDao
import br.com.fiap.eco_tech.mvvm.model.Post
import br.com.fiap.eco_tech.mvvm.model.User

@Database(entities = [Post::class, User::class], version = 1)
abstract class DB_Connection : RoomDatabase() {

    abstract fun PostDao(): PostDao
    abstract fun UserDao(): UserDao

    companion object {

        private lateinit var instance: DB_Connection

        fun getDatabase(context: Context): DB_Connection {

            if (!::instance.isInitialized) {
                instance = Room.databaseBuilder(
                    context,
                    DB_Connection::class.java,
                    "EcoTech_DB"
                )
                    .allowMainThreadQueries().fallbackToDestructiveMigration().build()
            }

            return instance
        }
    }

}