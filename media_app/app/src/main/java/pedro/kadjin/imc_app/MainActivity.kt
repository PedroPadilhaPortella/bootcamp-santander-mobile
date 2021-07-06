package pedro.kadjin.media_app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNota1: EditText
    private lateinit var editTextNota2: EditText
    private lateinit var botao: Button
    private lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNota1 = findViewById(R.id.nota1)
        editTextNota2 = findViewById(R.id.nota2)
        botao = findViewById(R.id.button)
        resultado = findViewById(R.id.media)

        botao.setOnClickListener { calculate() }
    }

    private fun calculate() {
        var nota1 = editTextNota1.text.toString().toFloat()
        var nota2 = editTextNota2.text.toString().toFloat()
        if(nota1.isNaN()) nota1 = 0.0f
        if(nota2.isNaN()) nota2 = 0.0f
        val media = (nota1 + nota2) / 2
        resultado.text = "Sua media foi $media"
    }
}