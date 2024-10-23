package com.cristian.mvcmpvmvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cristian.mvcmpvmvvm.controller.UsuarioController
import com.cristian.mvcmpvmvvm.databinding.ActivityMainBinding
import com.cristian.mvcmpvmvvm.model.Usuario
import com.cristian.mvcmpvmvvm.presenter.UsuarioApi
import com.cristian.mvcmpvmvvm.presenter.UsuarioPresenterImpl

class MainActivity : AppCompatActivity(), UsuarioApi {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var usuarioPresenterImpl: UsuarioPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        instances()
        listeners()
    }

    private fun instances() {
        usuarioPresenterImpl = UsuarioPresenterImpl(this@MainActivity)
    }
    private fun listeners() {
        binding.btnRecuperarLista.setOnClickListener {
            usuarioPresenterImpl.exibirUsuarios()
        }
    }

    //Passiva (somente recebe a lista)
    override fun exibirUsuarios(lista: List<Usuario>) {
        var textoUsuarios = ""
        for (itemLista in lista) {
            textoUsuarios += "${itemLista.nome} - ${itemLista.idade} \n"
        }
        binding.textResultado.text = textoUsuarios
    }

}