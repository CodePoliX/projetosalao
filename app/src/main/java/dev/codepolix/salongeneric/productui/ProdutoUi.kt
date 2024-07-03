package dev.codepolix.salongeneric.productui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import java.text.DecimalFormat

@Composable
fun ProdutoUi(produtos: List<Produto>) {
    val decimalFormat = DecimalFormat("#.00")
    Column {
        produtos.forEach { produto ->
            Spacer(modifier = Modifier.height(2.dp))
            Card(Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = Color.White)) {
                Row() {
                    AsyncImage(
                        model = produto.imagem,
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(130.dp)
                            .width(130.dp)
                    )
                    Column(
                        Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 4.dp)) {
                        Text(
                            text = produto.nome.uppercase(),
                            style = TextStyle(fontWeight = FontWeight.Bold)
                        )
                        Text(text = produto.descricao)
                        Text(
                            "R$${decimalFormat.format(produto.preco)}",
                            style = TextStyle(color = Color.Magenta, fontSize = 16.sp)
                        )
                    }
                }
            }
        }
    }

}


@Composable
@Preview
fun ProdutoUiPreview() {
    ProdutoUi(
        listOf(
            Produto(
                "https://m.media-amazon.com/images/I/71x0Eg6fyWS._AC_UF1000,1000_QL80_.jpg",
                "Kit Elseve Hidra Hialurônico",
                "Cabelos mais hidratados, desembaraçados e brilhantes.",
                75.90
            ),

        )
    )
}