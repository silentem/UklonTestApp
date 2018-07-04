package com.whaletail.uklon.test.dagger.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.whaletail.uklon.test.dagger.annotations.ViewModelKey
import com.whaletail.uklon.test.mvp.postDetails.PostDetailsViewModel
import com.whaletail.uklon.test.util.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {


    @Binds
    @IntoMap
    @ViewModelKey(PostDetailsViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: PostDetailsViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}