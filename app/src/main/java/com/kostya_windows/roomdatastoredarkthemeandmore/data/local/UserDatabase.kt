package com.kostya_windows.roomdatastoredarkthemeandmore.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kostya_windows.roomdatastoredarkthemeandmore.data.model.User

@Database(entities = [User::class],version = 1,exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
}