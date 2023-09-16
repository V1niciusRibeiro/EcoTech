package br.com.fiap.eco_tech.mvvm.view_model

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.fiap.eco_tech.database.repository.UserRepository
import br.com.fiap.eco_tech.mvvm.model.User

class LoginScreenViewModel {

    private val _login = MutableLiveData<String>()
    val login: LiveData<String> = _login

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    fun onLoginChanged(login: String) {
        _login.value = login
    }

    fun onPasswordChanged(password: String) {
        _password.value = password
    }

}