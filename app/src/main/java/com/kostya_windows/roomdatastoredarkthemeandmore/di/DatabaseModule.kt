package com.kostya_windows.roomdatastoredarkthemeandmore.di

import android.content.Context
import androidx.room.Room
import com.kostya_windows.roomdatastoredarkthemeandmore.data.local.UserDao
import com.kostya_windows.roomdatastoredarkthemeandmore.data.local.UserDatabase
import com.kostya_windows.roomdatastoredarkthemeandmore.other.Constans
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
class DatabaseModule{

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context:Context):UserDatabase {
        return Room.databaseBuilder(context,UserDatabase::class.java,Constans.NAME_DATABASE).build()
    }

    @Singleton
    @Provides
    fun provideUserDao(database: UserDatabase): UserDao{
        return database.userDao()
    }

}