package pedro.kadjin.imcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToLong

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
        var height = heightInput.text.toString().toFloat()
        var weight = weightInput.text.toString().toFloat()
        if(height.isNaN()) height = 0.0f
        if(weight.isNaN()) weight = 0.0f

        val imc = (weight / (height * height))

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

        result.text = "Seu IMC: $imc \n$status"
    }
}