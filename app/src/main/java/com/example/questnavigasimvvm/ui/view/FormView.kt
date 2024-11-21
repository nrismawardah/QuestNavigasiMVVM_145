package com.example.questnavigasimvvm.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormView(
    modifier: Modifier = Modifier,
    listJK: List<String>,
    onSubmitClicked: (MutableList<String>) -> Unit
){
    var nim by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var notelp by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
}