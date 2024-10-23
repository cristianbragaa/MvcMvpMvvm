package com.cristian.mvcmpvmvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.cristian.mvcmpvmvvm.R
import com.cristian.mvcmpvmvvm.databinding.ActivityUsuarioMvvmBinding
import com.cristian.mvcmpvmvvm.viewmodel.UsuarioViewModel

class UsuarioMvvmActivity : AppCompatActivity() {

    private val binding by lazy { ActivityUsuarioMvvmBinding.inflate(layoutInflater) }
    private lateinit var usuarioViewModel: UsuarioViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        usuarioViewModel = ViewModelProvider(this)[UsuarioViewModel::class.java]

        usuarioViewModel.usuariosLiveData.observe(this) { listaUsuarios ->
            var textoResultado: String = ""
            for (usuario in listaUsuarios) {
                textoResultado += "${usuario.nome} - ${usuario.idade} \n"
            }
            binding.textLista.text = textoResultado
        }

        binding.btnCarregar.setOnClickListener {
            usuarioViewModel.recuperarUsuarios()
        }
    }
}