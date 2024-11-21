package com.example.questnavigasimvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questnavigasimvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel()
{
    private val _statusUI = MutableStateFlow(DataSiswa())

    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2],
                alamat = ls[3],
                notelp = ls[4],
                gender = ls[5]
            )
        }
    }
}