package br.fiap.checkpoint1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class ResultadoContaTelefonica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val txtResultadoContaTelefonica = findViewById<TextView>(R.id.txtResultadoContaTelefonica)
//        val PrecoAssinatura = intent.getDoubleExtra("PrecoAssinatura", 0.0)
//        val precoChamadaLocal = intent.getDoubleExtra("precoChamadaLocal", 0.0)
//        val precoChamadaCelular = intent.getDoubleExtra("precoChamadaCelular", 0.0)
//        val soma = intent.getDoubleExtra("soma", 0.0)
//        txtResultadoContaTelefonica.text = "Assinatura               : R$$PrecoAssinatura\n\n"+
//                                           "Chamada Local        : R$$precoChamadaLocal\n\n"+
//                                           "Chamada Celular     : R$$precoChamadaCelular\n\n"+
//                                           "\n\n"+
//                                           "Valor Total              : R$$soma"


        txtResultadoContaTelefonica.text= "Resultado"
    }
}