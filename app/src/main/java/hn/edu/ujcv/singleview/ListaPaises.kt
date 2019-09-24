package hn.edu.ujcv.singleview

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter

import kotlinx.android.synthetic.main.activity_lista_paises.*
import kotlinx.android.synthetic.main.content_lista_paises.*

class ListaPaises : AppCompatActivity() {


    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_paises)
        setSupportActionBar(toolbar)


        val paises = arrayOf("Honduras","Argentina","Guatemala","Alemania")

        viewManager = LinearLayoutManager(this)

        viewAdapter = MyAdapter(paises)


        miRV.apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        };


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
