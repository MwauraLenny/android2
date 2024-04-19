package com.andy.lennyarch.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andy.lennyarch.ui.theme.screens.about.About
import com.andy.lennyarch.ui.theme.screens.home.Home
import com.andy.lennyarch.ui.theme.screens.login.Login
import com.andy.lennyarch.ui.theme.screens.register.Register

@Composable
fun  AppNavHost(
    modifier: Modifier=Modifier, navController: NavHostController = rememberNavController(),
    startDestination:String= ROUTE_HOME
){
    NavHost(navController = navController,modifier =modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){ Home(navController) }
        composable(ROUTE_ABOUT){ About(navController) }
        composable(ROUTE_REGISTER){ Register(navController) }
        composable(ROUTE_LOGIN){ Login(navController) }

    }
}
