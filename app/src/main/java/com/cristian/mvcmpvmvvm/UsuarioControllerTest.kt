package com.cristian.mvcmpvmvvm

import com.cristian.mvcmpvmvvm.controller.UsuarioController
import com.cristian.mvcmpvmvvm.model.Usuario
import com.cristian.mvcmpvmvvm.presenter.UsuarioApi
import com.cristian.mvcmpvmvvm.presenter.UsuarioPresenterImpl
import com.cristian.mvcmpvmvvm.view.MainActivity

class UsuarioControllerTest {

    inner class SimularActivity: UsuarioApi {
        override fun exibirUsuarios(lista: List<Usuario>) {
            println(lista)
        }
    }

    fun testarRecuperarUsuarios() {
        // Entrada

        // Processamento
        val simularActivity = SimularActivity()
        val usuarioPresenterImpl = UsuarioPresenterImpl(simularActivity)
        usuarioPresenterImpl.exibirUsuarios()

        // Saída
    }

}