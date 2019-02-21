/*
 * Copyright 2016-2019 Julien Guerinet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.guerinet.suitcase.analytics

import android.app.Activity
import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics

/**
 * [Analytics] implementation for Firebase
 * @author Julien Guerinet
 * @since 5.0.0
 */
class FAnalytics(context: Context) : Analytics {

    private val fa = FirebaseAnalytics.getInstance(context)

    override fun event(name: String, vararg params: Pair<String, Any?>) = fa.event(name, *params)

    override fun screen(activity: Activity, name: String) = fa.screen(activity, name)

    override fun setUserProperties(vararg properties: Pair<String, String?>) = fa.setUserProperties(*properties)
}