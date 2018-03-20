package com.whaletail.uklon.test

import com.whaletail.uklon.test.dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * @author whaletail on 20.03.18.
 */

class TestApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component = DaggerAppComponent.builder()
                .application(this)
                .build()
        component.inject(this)
        return component
    }
}