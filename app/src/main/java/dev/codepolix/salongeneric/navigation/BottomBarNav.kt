package dev.codepolix.salongeneric.navigation

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

//val items = listOf(
//    NavBarItem("Home", "home", Icons.Default.Home),
//    NavBarItem("Produtos", "produtos", Icons.Default.Home),
//    NavBarItem("Profile", "profile", Icons.Default.Home),
//)
//
//@Composable
//fun BottomBarNav(navController: NavController){
//    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
//    items.forEach { item ->
//        BottomNavigationItem(
//            icon = { Icon(Icons.Filled.Favorite, contentDescription = item) },
//            label = { Text(item) },
//            selected = selectedItem == index,
//            onClick = { selectedItem = index }
//        )
//    }
//}