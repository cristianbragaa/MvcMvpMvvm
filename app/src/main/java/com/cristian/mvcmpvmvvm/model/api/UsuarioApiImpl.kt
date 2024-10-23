package com.cristian.mvcmpvmvvm.model.api

import com.cristian.mvcmpvmvvm.model.Usuario
import com.cristian.mvcmpvmvvm.presenter.UsuarioApi

class UsuarioApiImpl {
    fun exibirUsuarios(): List<Usuario> {
        val listaUsuarios = listOf(
            Usuario("Jamilton", 25),
            Usuario("Pedro", 35),
            Usuario("Maria", 55),
            Usuario("Ana", 18),
        )
        return listaUsuarios
    }
}