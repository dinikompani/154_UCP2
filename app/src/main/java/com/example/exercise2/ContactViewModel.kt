package com.example.exercise2

import androidx.lifecycle.ViewModel
import com.example.exercise2.data.ContactUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactViewModel: ViewModel(){
    private val _stateUI = MutableStateFlow(ContactUiState())
    val stateUI: StateFlow<ContactUiState> = _stateUI.asStateFlow()

    fun setContact(list: MutableList<String>){
        _stateUI.update {
            stateSaatIni-> stateSaatIni.copy(
                nama_mahasiswa = list[0],
                nim = list[1],
                konsentrasi = list[2],
                judul_skripsi = list[3]
            )
        }
    }

}