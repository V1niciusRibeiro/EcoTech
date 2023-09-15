package br.com.fiap.eco_tech.mvvm.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class NavBarViewModel {

    private val _menuOpen = MutableLiveData<Boolean>()
    val menuOpen: LiveData<Boolean> = _menuOpen

    fun onMenuOpenChanged(openMenu: Boolean) {
        _menuOpen.value = openMenu
    }

}