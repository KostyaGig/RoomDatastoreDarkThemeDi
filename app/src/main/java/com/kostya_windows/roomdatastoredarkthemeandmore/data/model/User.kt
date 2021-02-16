package com.kostya_windows.roomdatastoredarkthemeandmore.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Users")
data class User(
    @ColumnInfo(name= "userId") @PrimaryKey(autoGenerate = true) val userId:Int,
    @ColumnInfo(name= "name") val name:String,
    @ColumnInfo(name= "country") val country:String,
    @ColumnInfo(name= "age") val age:String)