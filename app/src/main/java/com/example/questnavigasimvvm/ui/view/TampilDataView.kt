package com.example.questnavigasimvvm.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasimvvm.model.DataSiswa

@Composable
fun TampilDataView(
    modifier: Modifier = Modifier,
    uiState: DataSiswa,
    onBackButton: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Berikut Data Anda",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        TampilData(
            param = "NIM",
            argu = uiState.nim
        )
        TampilData(
            param = "Nama",
            argu = uiState.nama
        )
        TampilData(
            param = "Email",
            argu = uiState.email
        )
        TampilData(
            param = "Alamat",
            argu = uiState.alamat
        )
        TampilData(
            param = "No Telepon",
            argu = uiState.notelp
        )
        TampilData(
            param = "Gender",
            argu = uiState.gender
        )
        Button(onClick = onBackButton) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun TampilData(
    param:String, argu:String
){
    Column (
        modifier = Modifier
            .padding(16.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = param,
                modifier = Modifier
                    .weight(0.8f)
            )
            Text(
                text = ": ",
                modifier = Modifier
                    .weight(0.2f)
            )
            Text(text = argu,
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}