package br.fiap.checkpoint1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCalculadora = findViewById<Button>(R.id.btnCalculadora)
        val btnContaTelefonica = findViewById<Button>(R.id.btnContaTelefonica)
        val btnIntegrantes = findViewById<Button>(R.id.btnIntegrantes)

        btnIntegrantes.setOnClickListener{
            val msg = "Gabriel Assunção\n\n" +
                      "Amanda Da Silva Fernandes"
            alert("Desenvolvido por:",msg)
            }

        btnContaTelefonica.setOnClickListener{
            val TelaContaTelefonica = Intent(this, TelaContaTelefonica::class.java)
            startActivity(TelaContaTelefonica)
        }

        btnCalculadora.setOnClickListener{
            val Calculadora = Intent(this, Calculadora::class.java)
            startActivity(Calculadora)
        }



    }
    fun alert(titulo: String, mensagem: String) {
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("OK", null)
        builder.create().show()
    }
}