package com.example.gasolinera.di

import com.example.gasolinera.data.ProvinceRepository
import com.example.gasolinera.domain.interfaces.IGasolineRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
interface ProvinceRepositoryModule {
    @Binds
    fun bind(repository: ProvinceRepository) : IGasolineRepository

}




