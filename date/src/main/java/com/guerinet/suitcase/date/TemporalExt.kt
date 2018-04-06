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

@file:JvmName("DateUtils")

package com.guerinet.suitcase.date

import org.threeten.bp.temporal.Temporal

/**
 * [Temporal] extensions
 * @author Julien Guerinet
 * @since 1.0.0
 */

/**
 * Returns localized short date String (ex: 01/01/00) of the [Temporal],
 *  null if the [Temporal] was null
 */
fun Temporal?.getShortDateString(): String? {
    return if (this == null) null else Format.shortDateFormatter.format(this)
}

/**
 * Returns localized medium date String (ex: Jan 1, 2000) of the [Temporal],
 *  null if the [Temporal] was null
 */
fun Temporal?.getMediumDateString(): String? {
    return if (this == null) null else Format.mediumDateFormatter.format(this)
}

/**
 * Returns localized long date String (ex: January 1, 2000) of the [Temporal],
 *  null if the [Temporal] was null
 */
fun Temporal?.getLongDateString(): String? {
    return if (this == null) null else Format.longDateFormatter.format(this)
}

/**
 * Returns localized full date String (ex: Monday, January 1, 2000) of the [Temporal],
 *  null if the [Temporal] was null
 */
fun Temporal?.getFullDateString(): String? {
    return if (this == null) null else Format.fullDateFormatter.format(this)
}

/**
 * Returns localized short time String (ex: 3:30PM) of the [Temporal],
 *  null if the [Temporal] was null
 */
fun Temporal?.getShortTimeString(): String? {
    return if (this == null) null else Format.shortTimeFormatter.format(this)
}