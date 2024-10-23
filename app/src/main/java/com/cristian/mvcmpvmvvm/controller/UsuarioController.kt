package com.cristian.mvcmpvmvvm.controller

import com.cristian.mvcmpvmvvm.model.api.UsuarioApiImpl
import com.cristian.mvcmpvmvvm.view.MainActivity

class UsuarioController(
    //Alta dependencia / Alto acoplamento
    private val mainActivity: MainActivity
) {
    private val usuarioAPI = UsuarioApiImpl()

    fun recuperarUsuarios() {
        //Regra de negócio, recupera a lista da api
        //val lista = usuarioAPI.recuperarUsuarios()

        //Exibir dados na interface (manda a lista para a view)
       // mainActivity.exibirUsuarios(lista)
    }
}