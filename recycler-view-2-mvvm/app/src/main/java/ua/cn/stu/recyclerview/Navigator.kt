package ua.cn.stu.recyclerview

import androidx.annotation.StringRes
import ua.cn.stu.recyclerview.model.User

interface Navigator {

    fun showDetails(user: User)

    fun goBack()

    fun toast(@StringRes messageRes: Int)

}