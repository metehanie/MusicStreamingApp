package com.metehanbolat.musicstreamingapp.di

import com.metehanbolat.musicstreamingapp.repository.TrackRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object Injection {

    @Provides
    fun provideRepository(): TrackRepository { return TrackRepository() }
}