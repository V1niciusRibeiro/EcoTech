package br.com.fiap.eco_tech.mvvm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TB_POST")
data class Post (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_post")
    var id: Long = 0,

//    @ColumnInfo(name = "id_user")
//    var idUser: Long = 0,

    @ColumnInfo(name = "nm_post")
    var title: String = "",

    @ColumnInfo(name = "ds_post")
    var description: String = "",

    @ColumnInfo(name = "ct_post")
    var category: String = ""

)