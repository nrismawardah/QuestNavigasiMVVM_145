package com.example.questnavigasimvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questnavigasimvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow

class SiswaViewModel : ViewModel()
{
    private val _statusUI = MutableStateFlow(DataSiswa()
    )
}