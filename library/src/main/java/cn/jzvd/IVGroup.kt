package cn.jzvd

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout

open class IVGroup : ConstraintLayout {
    constructor(context: Context) : super(context) {
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
    }

    open fun loadData(a:String?,b:String?,c:String?,d:String?,e:String?,f:String?,g:String?){

    }

    open fun loadData(a:String?,b:String?){

    }

    open fun loadData(a:String?){

    }
}