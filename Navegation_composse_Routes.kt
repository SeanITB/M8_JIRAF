package com.example.navigation_compose

sealed class Routes(val route: String) {
    object Pantalla1:Routes("pantalla1")
    object Pantalla2:Routes("pantalla2/{nom}/{edat}"){
        fun createRoute(nom: String, edat: Int) = "pantalla2/$nom/$edat"
    }
}
