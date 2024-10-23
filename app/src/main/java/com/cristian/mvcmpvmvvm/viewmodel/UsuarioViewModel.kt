package com.cristian.mvcmpvmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cristian.mvcmpvmvvm.model.Usuario
import com.cristian.mvcmpvmvvm.model.api.UsuarioApiImpl

class UsuarioViewModel(

): ViewModel() {

    private val usuarioApiImpl = UsuarioApiImpl()

    val usuariosLiveData = MutableLiveData<List<Usuario>>()

    fun recuperarUsuarios() {
        val lista = usuarioApiImpl.exibirUsuarios()
        usuariosLiveData.value = lista
    }

}