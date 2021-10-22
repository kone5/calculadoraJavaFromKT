package com.example.calculadorajavafromkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Button

import android.widget.EditText

import android.widget.TextView

import android.util.Log


class MainActivity : AppCompatActivity() {
    private var Resultado: TextView? = null
    private var numero1: EditText? = null
    private var numero2: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Resultado = findViewById(R.id.Resultado)
        numero1 = findViewById(R.id.numero1)
        numero2 = findViewById(R.id.numero2)
    }
    fun Sumar(view: View?) {
        val resultadoNumero = numero1!!.text.toString().toInt() + numero2!!.text.toString().toInt()
        Resultado!!.text = resultadoNumero.toString() + ""
        Log.d("operacionSuma", "Boton suma apretado")
    }

    fun Restar(view: View?) {
        val resultadoNumero = numero1!!.text.toString().toInt() - numero2!!.text.toString().toInt()
        Resultado!!.text = resultadoNumero.toString() + ""
        Log.d("operacionResta", "Boton resta apretado")
    }

    fun Multiplicar(view: View?) {
        val resultadoNumero = numero1!!.text.toString().toInt() * numero2!!.text.toString().toInt()
        Resultado!!.text = resultadoNumero.toString() + ""
        Log.d("operacionMulti", "Boton multiplicar apretado")
    }

    fun Dividir(view: View?) {
        val resultadoNumero = numero1!!.text.toString().toInt() / numero2!!.text.toString().toInt()
        Resultado!!.text = resultadoNumero.toString() + ""
        Log.d("operacionDividir", "Boton dividir apretado")
    }
}