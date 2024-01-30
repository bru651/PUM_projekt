package com.example.lista4.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lista4.ui.theme.screens.E1
import com.example.lista4.ui.theme.screens.E2
import com.example.lista4.ui.theme.screens.E3
import com.example.lista4.ui.theme.screens.E4

@Composable
fun BottomNavigation(navController: NavHostController)
{
    NavHost(navController = navController, startDestination = BottomElement.E1.route )
    {
        composable(route= BottomElement.E1.route)
        {
            E1(navController)
        }
        composable(route= BottomElement.E2.route)
        {
            E2()
        }
        composable("E3/{index}") { backStackEntry ->
            val index = backStackEntry.arguments?.getString("index")
            if (index != null) {
                E3(index,navController)
            }
        }
        composable("E4/{index}/{indexm}") { backStackEntry ->
            val index = backStackEntry.arguments?.getString("index")
            val indexm = backStackEntry.arguments?.getString("indexm")
            if (index != null && indexm != null) {
                E4(index,indexm)
            }
        }
    }
}