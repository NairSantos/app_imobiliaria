package com.example.appmobiliaria.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appmobiliaria.R

@Composable
fun ImgCard(text: String, preco: String, colorPreco: Color, imgPath: Painter){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .width(170.dp)
    ) {
        Column (
            modifier = Modifier.background(Color(	168,168,168))
        ) {
            Image(
                painter = imgPath,
                contentDescription = "IMG Casa",
                modifier = Modifier.width(180.dp).height(112.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = text,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = Color.Black,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = preco,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = colorPreco,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun ImgCardCorretor(text: String, imgPath: Painter){
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .width(170.dp),
    ) {
        Column (
            modifier = Modifier.background(Color(	168,168,168))
        ){
            Image(
                painter = imgPath,
                contentDescription = "IMG Casa",
                modifier = Modifier.width(180.dp).height(112.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = text,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                color = Color.Black
            )


            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview(){
    Row (
        modifier = Modifier.height(300.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        ImgCard(
            "Casa 1",
            "R$ 80.000,00",
            Color.Black,
            painterResource(R.drawable.download),

            )

        ImgCard(
            "Casa 2",
            "R$ 50.000,00",
            Color.Green,
            painterResource(R.drawable.download1)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreviewCorretor(){
    Row (
        modifier = Modifier.height(300.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        ImgCardCorretor(
            "Corretora Patricia",
            painterResource(R.drawable.images)
        )

        ImgCardCorretor(
            "Corretora Luciana",
            painterResource(R.drawable.images1)
        )
    }
}

