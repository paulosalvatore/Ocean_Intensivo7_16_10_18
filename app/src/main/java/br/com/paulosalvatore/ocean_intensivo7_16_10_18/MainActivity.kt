package br.com.paulosalvatore.ocean_intensivo7_16_10_18

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	fun entrar(view: View) {
		val nome: String = etNome.text.toString()
		val sobrenome: String = etSobrenome.text.toString()

		if (nome != "") {
//			tvResultado.text = nome
			val intent = Intent(this, HomeActivity::class.java)
			intent.putExtra("NOME", nome)
			intent.putExtra("SOBRENOME", sobrenome)
			startActivity(intent)
		} else {
			etNome.error = "Digite um nome válido."
		}
	}
}
