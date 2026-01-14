package com.kidzie.dailyme.core

sealed class NavBarRouter(routeName : String) {
    object Home : NavBarRouter("home_route")
    object Profile : NavBarRouter("profile_route")
}