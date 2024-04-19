package com.andy.lennyarch.ui.theme.screens.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.andy.lennyarch.ui.theme.navigation.ROUTE_ABOUT

@Composable
fun About(navController: NavController){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally ){
        Text(text = "This is the About us Screen")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            navController.navigate(ROUTE_ABOUT)
        }) {
            Text(text = "Gp to Home Screen")
        }
    }
}

@Preview
@Composable
fun HomePreview(){
    About(rememberNavController())
}