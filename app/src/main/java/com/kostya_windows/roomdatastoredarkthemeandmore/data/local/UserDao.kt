package com.kostya_windows.roomdatastoredarkthemeandmore.data.local

import androidx.room.*
import com.kostya_windows.roomdatastoredarkthemeandmore.data.model.User

@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("SELECT * FROM Users")
    fun allUsers():List<User>

    //get on country
    @Query("SELECT * FROM Users WHERE country = :country")
    fun allUsers(country:String):List<User>
}