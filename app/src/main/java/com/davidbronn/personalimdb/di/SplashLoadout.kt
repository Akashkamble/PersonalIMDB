package com.davidbronn.personalimdb.di

import com.davidbronn.personalimdb.repository.splash.*
import com.davidbronn.personalimdb.ui.splash.SplashViewModel
import com.davidbronn.personalimdb.utils.apiInstance
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val splash = module {

    // Splash API Initializations
    single { apiInstance<SplashApi>(get()) }

    // DataSources Initializations
    factory { RemoteImpl(get()) as Remote }
    factory { PreferenceImpl(get()) as Preference }
    factory { SplashRepositoryImpl(get(), get()) as SplashRepository }

    // ViewModel Initializations
    viewModel { SplashViewModel(get()) }
}