package com.cristian.mvcmpvmvvm.model.api

import com.cristian.mvcmpvmvvm.model.Usuario

class UsuarioApiImpl {
    fun exibirUsuarios(): List<Usuario> {

        val listaUsuarios = listOf(
            Usuario("Jamilton", 25),
            Usuario("Pedro", 35),
            Usuario("Maria", 55),
            Usuario("Ana", 18),
            Usuario("Joao", 28),
            Usuario("Jeane", 55),
        )
        return listaUsuarios
    }
}