package dev.codepolix.salongeneric

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.codepolix.salongeneric.homeui.HomeScreen
import dev.codepolix.salongeneric.productui.Produto
import dev.codepolix.salongeneric.productui.ProdutosScreen
import dev.codepolix.salongeneric.profileui.ProfileScreen
import dev.codepolix.salongeneric.ui.theme.SalãoGenéricoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SalãoGenéricoTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Produtos"){
                    composable(route = "Home"){
                        HomeScreen(navController)
                    }
//                    composable(route = "Produtos"){
//                        ProdutosScreen()
////                            ListaProdutos = listOf(
////                            Produto(
////                                "https://res.cloudinary.com/beleza-na-web/image/upload/w_1500,f_auto,fl_progressive,q_auto:eco,w_800/v1/imagens/product/94462/2ccdad82-b25b-4cd2-80a7-be675b3ba1ab-kit-elseve-loreal-paris-hidra-hialuronico-completo-4-produtos.png",
////                                "Kit Elseve Hidra Hialurônico",
////                                "Cabelos mais hidratados, desembaraçados e brilhantes.",
////                                75.90
////                            ),
////                            Produto(
////                                "https://m.media-amazon.com/images/I/71x0Eg6fyWS._AC_UF1000,1000_QL80_.jpg",
////                                "Kit Elseve Hidra Hialurônico",
////                                "Cabelos mais hidratados, desembaraçados e brilhantes.",
////                                75.90
////                            )
////                        ), navController)
//                    }
                    composable(route = "Perfil"){
                        ProfileScreen(navController = navController)
                    }
                }
            }
        }
    }
}