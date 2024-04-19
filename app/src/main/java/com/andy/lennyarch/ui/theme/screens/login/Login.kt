package com.andy.lennyarch.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.andy.lennyarch.ui.theme.navigation.ROUTE_REGISTER

@Composable
fun Login(navController: NavController){
//    var email by remember { mutableStateOf(TextFieldValue("")) }
//    var pass by remember { mutableStateOf(TextFieldValue("")) }
//    var context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
       Text(text = "Please Login Here",
           color = Color.Black,
           fontSize = 30.sp,
           fontFamily = FontFamily.SansSerif,
           fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

    OutlinedTextField(value ="", onValueChange ={},
     label = { Text(text = "Enter Your Email",
         color = Color.Black)},
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    )
    Spacer(modifier = Modifier.height(20.dp))

    OutlinedTextField(value ="", onValueChange ={},
    label = { Text(text = "Enter your password" )},
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp))
 Spacer(modifier = Modifier.height(20.dp))

    Button(onClick = { },
        modifier = Modifier.fillMaxWidth()) {
        Text(text = "Log In",
            color = Color.Black)
    }
    Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate(ROUTE_REGISTER) },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Don't have an account? Click here to register ")
        }
    }
}
@Preview(showBackground = true , showSystemUi = true)
@Composable
fun LoginPreview(){
    Login(rememberNavController())
}