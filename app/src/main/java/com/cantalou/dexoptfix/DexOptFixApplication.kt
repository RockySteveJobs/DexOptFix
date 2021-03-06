package com.cantalou.dexoptfix

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

/**
 *
 * @author  LinZhiWei
 * @date    2019年08月30日 12:03
 *
 */
class DexOptFixApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        DexOptFix.fix(this)
        MultiDex.install(this)
    }
}