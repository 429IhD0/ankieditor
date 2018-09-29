/*
 * Copyright (C) 2018 Jhon Kenneth Cariño
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jkcarino.ankieditor.ui.editor

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textfield.TextInputEditText

class NoteTypeFieldEditText : TextInputEditText {

    var fieldText: String
        get() = text.toString().replace(NEW_LINE, "<br>")
        set(text) = setText(text.replace("<br(\\s*\\/*)>".toRegex(), NEW_LINE))

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    companion object {
        private val NEW_LINE = System.getProperty("line.separator")
    }
}
