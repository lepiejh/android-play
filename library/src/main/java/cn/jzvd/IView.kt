package cn.jzvd

import android.content.Context
import android.view.View
import android.util.AttributeSet

open class IView : View {
    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
    }

    open fun setLeftValue(a : String?){
    }

    open fun setRightValue(a : String?){
    }

    open fun setCurrentProgress(a : Float){

    }

    open fun setText(a: String) {

    }
}