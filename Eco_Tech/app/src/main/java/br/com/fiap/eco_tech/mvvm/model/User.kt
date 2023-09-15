package br.com.fiap.eco_tech.mvvm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TB_USER")
data class User (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_user")
    val id: Long = 0,

    @ColumnInfo(name = "nm_user")
    val name: String = "",

    @ColumnInfo(name = "lg_user")
    val login: String = "",

    @ColumnInfo(name = "pw_user")
    val password: String = ""

)
