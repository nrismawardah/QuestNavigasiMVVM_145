package com.example.questnavigasimvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questnavigasimvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SiswaViewModel : ViewModel()
{
    private val _statusUI = MutableStateFlow(DataSiswa())

    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()
}