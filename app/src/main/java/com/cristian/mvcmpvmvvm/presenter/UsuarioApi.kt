package com.cristian.mvcmpvmvvm.presenter

import com.cristian.mvcmpvmvvm.model.Usuario

interface UsuarioApi {
    fun exibirUsuarios(lista: List<Usuario>)
}