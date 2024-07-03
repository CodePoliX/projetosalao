package dev.codepolix.salongeneric.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

//@Composable
//fun MainScreen(navHostController: NavHostController){
//    val navController = rememberNavController()
//    Scaffold(
//        bottomBar = { BottomBarNav(navController = navController) }
//    ) { innerPadding ->
//        NavigationHost(navController = navController, Modifier.padding(innerPadding))
//    }
//}