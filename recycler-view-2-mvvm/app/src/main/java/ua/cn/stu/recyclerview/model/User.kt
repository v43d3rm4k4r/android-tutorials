package ua.cn.stu.recyclerview.model

import ua.cn.stu.recyclerview.screens.UsersListFragment
import ua.cn.stu.recyclerview.screens.UserDetailsFragment

/**
 * Represents data for [UsersListFragment].
 */
data class User(
    val id: Long,
    val photo: String,
    val name: String,
    val company: String
)

/**
 * Represents data for [UserDetailsFragment].
 */
data class UserDetails(
    val user: User,
    val details: String
)