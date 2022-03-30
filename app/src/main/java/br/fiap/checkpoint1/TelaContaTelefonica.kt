package br.fiap.checkpoint1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class TelaContaTelefonica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_conta_telefonica)


        val btnCalcularTotal = findViewById<Button>(R.id.btnCalcularTotal)
        btnCalcularTotal.setOnClickListener{
            val txtAssinatura = findViewById<EditText>(R.id.txtAssinatura)
            val PrecoAssinatura = txtAssinatura.text.toString().toDouble()
            val txtChamadaLocal = findViewById<EditText>(R.id.txtChamadaLocal)
            val precoChamadaLocal = txtChamadaLocal.text.toString().toDouble()
            val txtChamadaCelular = findViewById<EditText>(R.id.txtChamadaCelular)
            val precoChamadaCelular = txtChamadaCelular.text.toString().toDouble()

            val precoChamadaLocalFinal : Double =  precoChamadaLocal * 0.04
            val precoChamadaCelularFinal : Double = precoChamadaCelular * 0.20

            val soma = soma(PrecoAssinatura, precoChamadaLocalFinal, precoChamadaCelularFinal)
            val intentResultado = Intent(this, ResultadoTeste::class.java)
            intentResultado.putExtra("PrecoAssinatura", PrecoAssinatura)
            intentResultado.putExtra("precoChamadaLocalFinal", precoChamadaLocalFinal)
            intentResultado.putExtra("precoChamadaCelularFinal", precoChamadaCelularFinal)
            intentResultado.putExtra("soma", soma)
            startActivity(intentResultado)
        }
    }
    fun soma(PrecoAssinatura : Double, precoChamadaLocal : Double,precoChamadaCelular : Double) : Double {
        return PrecoAssinatura + precoChamadaLocal  + precoChamadaCelular
    }
}