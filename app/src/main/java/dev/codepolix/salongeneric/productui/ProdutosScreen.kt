@file:OptIn(ExperimentalMaterial3Api::class)

package dev.codepolix.salongeneric.productui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController


@Composable
fun ProdutosScreen(
//    Destaques: List<Destaque>,//TODO: API com todas as funções de get e set necessárias.
    ListaProdutos: NavHostController,//TODO: outros composables com a lista de cada item.
//    Promocoes: List<Promocao>,
    NavController: List<Produto>
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta,
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White,
                ),
                title = {
                    Text("Produtos")
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Localized description"
                        )
                    }

                }
            )
        },
    ) { innerPadding ->
        Column (Modifier.padding(innerPadding)){
            ProdutoUi(ListaProdutos)
        }
    }
}
//
//@Composable
//@Preview
//fun ProdutoScreenPreview() {
//   ProdutosScreen(ListaProdutos = listOf(
//       Produto(
//           "https://res.cloudinary.com/beleza-na-web/image/upload/w_1500,f_auto,fl_progressive,q_auto:eco,w_800/v1/imagens/product/94462/2ccdad82-b25b-4cd2-80a7-be675b3ba1ab-kit-elseve-loreal-paris-hidra-hialuronico-completo-4-produtos.png",
//           "Kit Elseve Hidra Hialurônico",
//           "Cabelos mais hidratados, desembaraçados e brilhantes.",
//           75.90
//       ),
//       Produto(
//           "https://m.media-amazon.com/images/I/71x0Eg6fyWS._AC_UF1000,1000_QL80_.jpg",
//           "Kit Elseve Hidra Hialurônico",
//           "Cabelos mais hidratados, desembaraçados e brilhantes.",
//           75.90
//       )
//   ),)
//}