package pedro.kadjin.imcapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var heightInput: EditText
    private lateinit var weightInput: EditText
    private lateinit var button: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heightInput = findViewById(R.id.altura_edit_text)
        weightInput = findViewById(R.id.peso_edit_text)
        button = findViewById(R.id.buttonCalculate)
        result = findViewById(R.id.resultado)

        button.setOnClickListener { calculateIMC() }
    }

    private fun calculateIMC() {
        var height = heightInput.text.toString()
        var weight = weightInput.text.toString()

        var altura = 0.0f
        var peso = 0.0f

        if(!height.isNullOrEmpty()) {
            altura = height.toFloat()
        }

        if(!weight.isNullOrEmpty()) {
            peso = weight.toFloat()
        }

        var imc = (peso / (altura * altura))
        if (imc.isNaN()) {
            imc = 0.0f
        }

        var status: String;
        if(imc < 18.5) {
            status = "Desnutrição"
        } else if(imc in 18.5..24.9) {
            status = "Saudável"
        } else if(imc in 25.0..29.9) {
            status = "Sobrepeso"
        } else if(imc in 30.0..39.9) {
            status = "Obesidade"
        } else {
            status = "Obesidade Grave"
        }

        if(imc.isNaN() || imc == 0.0f) {
            result.text = "Insira valores válidos \nnos campos de altura e peso"
        } else {
            result.text = "Seu IMC: $imc \n$status"
        }

    }
}