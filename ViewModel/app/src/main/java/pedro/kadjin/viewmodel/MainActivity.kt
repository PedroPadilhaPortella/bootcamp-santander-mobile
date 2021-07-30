package pedro.kadjin.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlin.math.log10

class MainActivity : AppCompatActivity() {

    lateinit var txtContador: EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initDados()
        initClick()
        logLifeCycle(valor = "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        logLifeCycle(valor = "onStart")
    }

    override fun onResume() {
        super.onResume()
        logLifeCycle(valor = "onResume")
    }

    override fun onPause() {
        super.onPause()
        logLifeCycle(valor = "onPause")
    }

    override fun onStop() {
        super.onStop()
        logLifeCycle(valor = "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logLifeCycle(valor = "onDestroy")
    }

    private fun logLifeCycle(tag: String = "Ciclo de Vida", valor: String) {
        Log.d(tag, valor)
    }


    private fun initDados() {
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        txtContador = findViewById(R.id.txtContador)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar)

        mainViewModel.modelContador.observe(this, { valor ->
            txtContador.setText(valor)
        })

    }

    private fun initClick() {
        btnDados.setOnClickListener {
            mainViewModel.contador()
        }
        btnMostrar.setOnClickListener {
            Toast.makeText(applicationContext, "Valor ${mainViewModel.modelContador.value}", Toast.LENGTH_SHORT).show()
        }
    }

}