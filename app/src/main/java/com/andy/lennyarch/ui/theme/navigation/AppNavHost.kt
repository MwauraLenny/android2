package com.andy.lennyarch.ui.theme.navigation

import android.widget.Gallery
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andy.lennyarch.ui.theme.screens.about.About
import com.andy.lennyarch.ui.theme.screens.gallery.Gallery
import com.andy.lennyarch.ui.theme.screens.home.Home
import com.andy.lennyarch.ui.theme.screens.login.Login
import com.andy.lennyarch.ui.theme.screens.products.AddProductsScreen
import com.andy.lennyarch.ui.theme.screens.products.UpdateProductsScreen
import com.andy.lennyarch.ui.theme.screens.products.ViewProductsScreen
import com.andy.lennyarch.ui.theme.screens.profile.Profile
import com.andy.lennyarch.ui.theme.screens.register.Register



@Composable
fun  AppNavHost(
    modifier: Modifier=Modifier, navController: NavHostController = rememberNavController(),
    startDestination:String= ROUTE_REGISTER
){
    NavHost(navController = navController,modifier =modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){ Home(navController) }
        composable(ROUTE_ABOUT){ About(navController) }
        composable(ROUTE_REGISTER){ Register(navController) }
        composable(ROUTE_LOGIN){ Login(navController) }
        composable(ROUTE_PROFILE){ Profile(navController)}
        composable(ROUTE_GALLERY){ Gallery(navController)}
        composable(ROUTE_ADD_PRODUCT){ AddProductsScreen(navController) }
        composable(ROUTE_VIEW_PRODUCT){ ViewProductsScreen(navController)}
        composable(ROUTE_UPDATE_PRODUCT+"/{id}"){
            passedData -> UpdateProductsScreen(
                navController,passedData.arguments?.getString("id")!!
            )
        }

    }
}
