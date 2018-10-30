/*
 * Copyright 2016-2018 Julien Guerinet
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

package com.guerinet.suitcase.log

import org.koin.log.Logger
import timber.log.Timber

/**
 * Default logger to use for Koin
 * @author Julien Guerinet
 * @since 4.3.2
 */
class KoinLogger : Logger {

    override fun debug(msg: String) = Timber.tag("Koin").v(msg)

    override fun err(msg: String) = Timber.tag("Koin").e(msg)

    override fun info(msg: String) = Timber.tag("Koin").d(msg)

}