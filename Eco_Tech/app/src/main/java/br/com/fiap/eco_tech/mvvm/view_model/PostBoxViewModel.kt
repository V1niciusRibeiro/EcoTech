package br.com.fiap.eco_tech.mvvm.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class PostBoxViewModel {

    private val _dropDownOpen = MutableLiveData<Boolean>()
    val dropDownOpen: LiveData<Boolean> = _dropDownOpen

    fun onMenuOpenChanged(dropDownOpen: Boolean) {
        _dropDownOpen.value = dropDownOpen
    }

}