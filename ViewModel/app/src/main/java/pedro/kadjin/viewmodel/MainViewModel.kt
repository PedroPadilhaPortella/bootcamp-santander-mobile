package pedro.kadjin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var modelContador =  MutableLiveData<String>().apply { value = contador.toString() }
    private var contador: Int = 0

    private fun setModelContador() {
        modelContador.value = contador.toString()
    }

    private fun validateContador() {
        contador++
        if(contador > 5) {
            contador = 0
        }

        setModelContador()
    }

    fun contador() = validateContador()
}