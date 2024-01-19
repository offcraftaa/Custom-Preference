package io.pcholkin.preference

import android.content.Context
import android.util.AttributeSet
import androidx.preference.Preference

class TextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : Preference(context, attrs) {

    init {
        layoutResource = R.layout.layout_textview
    }

}
