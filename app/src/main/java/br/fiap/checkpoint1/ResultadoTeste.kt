package br.fiap.checkpoint1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.DecimalFormat

class ResultadoTeste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_teste)

        val txtResultadoContaTelefonica = findViewById<TextView>(R.id.txtResultadoTeste)
        val PrecoAssinatura = intent.getDoubleExtra("PrecoAssinatura", 0.0)
        val precoChamadaLocalFinal = intent.getDoubleExtra("precoChamadaLocalFinal", 0.0)
        val precoChamadaCelularFinal = intent.getDoubleExtra("precoChamadaCelularFinal", 0.0)
        val soma = intent.getDoubleExtra("soma", 0.0)
        val dec = DecimalFormat("#.0")
        txtResultadoContaTelefonica.text = "Assinatura            : R$$PrecoAssinatura\n\n"+
                                           "Chamada Local    : R$$precoChamadaLocalFinal\n\n"+
                                           "Chamada Celular : R$$precoChamadaCelularFinal\n\n"+
                                           "\n\n"+
                                           "Valor Total           : R$${dec.format(soma)}"

    }
}