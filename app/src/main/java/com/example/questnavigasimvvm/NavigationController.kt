package com.example.questnavigasimvvm

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasimvvm.viewmodel.SiswaViewModel

enum class Halaman{
    FORMULIR,
    TAMPILDATA
}

@Composable
fun NavigationController(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
){

}