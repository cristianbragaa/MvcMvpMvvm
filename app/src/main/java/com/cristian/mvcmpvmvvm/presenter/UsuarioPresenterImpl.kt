package com.cristian.mvcmpvmvvm.presenter

import com.cristian.mvcmpvmvvm.model.api.UsuarioApiImpl
/**
 * Para facilitar a testabilidade do meu código
 * o ideal é sempre injetar a minha classe de instancia
 * ou utilizar uma ferramenta de injeção de dependencia,
 * podendo injetar desta forma também como injeção de campo.
 * */
class UsuarioPresenterImpl(
    private val usuarioApi: UsuarioApi
) {
    private val usuarioApiImpl = UsuarioApiImpl()

    fun exibirUsuarios() {
        //Lista que poderia vir de um (banco de dados) ou de uma (api).
        val lista = usuarioApiImpl.exibirUsuarios()
        //Passa os dados para o método da interface, que está sendo implementada na minha view (MainActivity).
        usuarioApi.exibirUsuarios(lista)
    }
}