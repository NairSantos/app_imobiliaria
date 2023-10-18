package com.example.appmobiliaria.views


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.components.BackButton
import com.example.appmobiliaria.components.NavContent
import com.example.appmobiliaria.components.WhiteButton
import com.example.appmobiliaria.ui.theme.Nana

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NovoScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Nana
                ),
                navigationIcon = {
                    BackButton(){
                        navController.navigate("home")
                    }
                }
            )
        }
    ){
        NovoComprarScreen(navController)
    }
}

@Composable
fun NovoComprarScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Nana)
        .padding(top = 80.dp),
        //.align(CenterHorizontally),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //CASA
        WhiteButton(text = "Casa", icon = Icons.Default.KeyboardArrowRight){
            navController.navigate("home")
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        //APARTAMENTO
        WhiteButton(text = "Apartamentos", icon = Icons.Default.KeyboardArrowRight){
            navController.navigate("home")
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        //CHACARA
        WhiteButton(text = "Chácaras", icon = Icons.Default.KeyboardArrowRight){
            navController.navigate("home")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun NovoPreview(){
    val navController = rememberNavController()
    NovoScreen(navController)
}