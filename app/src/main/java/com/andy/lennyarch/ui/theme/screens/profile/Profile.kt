package com.andy.lennyarch.ui.theme.screens.profile

import android.provider.ContactsContract.Profile
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Profile(navController: NavController){

}

@Preview
@Composable
fun ProfilePreview(){
    Profile(rememberNavController())
}