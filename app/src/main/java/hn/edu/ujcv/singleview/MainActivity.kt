package hn.edu.ujcv.singleview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onCinco(view:View){
        miTexto.text = miTextoEntrada.text
    }

    fun onToListapaises( view : View){
        val intent = Intent(this, ListaPaises::class.java)

        startActivity(intent)
    }
}
