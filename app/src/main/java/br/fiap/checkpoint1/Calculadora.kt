package br.fiap.checkpoint1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener {
            val txtValor1 = findViewById<TextView>(R.id.txtValor1)
            val valor1 = txtValor1.text.toString().toDouble()
            val txtValor2 = findViewById<TextView>(R.id.txtValor2)
            val valor2 = txtValor2.text.toString().toDouble()
            val cbSoma = findViewById<RadioButton>(R.id.cbSoma)
            val cbSubtracao = findViewById<RadioButton>(R.id.cbSubtracao)
            val cbMultiplicacao = findViewById<RadioButton>(R.id.cbMultiplicacao)
            val cbDivisao = findViewById<RadioButton>(R.id.cbDivisao)

            val resultado : Double

            if (cbSoma.isChecked){
                resultado = valor1 + valor2
            }else if(cbSubtracao.isChecked){
                resultado = valor1 - valor2
            }else if(cbMultiplicacao.isChecked){
                resultado = valor1 * valor2
            }else{
                resultado = valor1 / valor2
            }
            val mensagem = "Resultado: ${resultado}"
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()

        }




    }
}