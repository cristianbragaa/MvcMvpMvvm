package com.cristian.mvcmpvmvvm.view

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cristian.mvcmpvmvvm.R
import com.cristian.mvcmpvmvvm.controller.UsuarioController
import com.cristian.mvcmpvmvvm.databinding.ActivityFeedBinding
import com.cristian.mvcmpvmvvm.model.Usuario
import com.cristian.mvcmpvmvvm.presenter.UsuarioApi
import com.cristian.mvcmpvmvvm.presenter.UsuarioPresenterImpl

class FeedActivity : AppCompatActivity(), UsuarioApi {

    private val binding by lazy { ActivityFeedBinding.inflate(layoutInflater) }
    private lateinit var usuarioPresenterImpl: UsuarioPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        instances()
    }

    override fun onStart() {
        super.onStart()
        usuarioPresenterImpl.exibirUsuarios()
    }

    private fun instances() {
        usuarioPresenterImpl = UsuarioPresenterImpl(this@FeedActivity)
    }

    override fun exibirUsuarios(lista: List<Usuario>) {
        var textoUsuarios = ""
        for (itemLista in lista) {
            textoUsuarios += "${itemLista.nome} - ${itemLista.idade}"
        }
        Log.i("Usuarios", "exibirUsuarios: $textoUsuarios")
    }
}