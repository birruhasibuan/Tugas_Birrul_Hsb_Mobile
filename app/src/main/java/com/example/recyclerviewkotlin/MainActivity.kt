package com.example.recyclerviewkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.ronaldo,
                "Cristiano-Ronaldo",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.messi,
                "Lionel-messi",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.mbappe,
                "Kyland-Mbappe",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.son,
                "Son-Heyungmin",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.halland,
                "Erling-Halland",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.lewandoski,
                "Lewan-Dowski",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superheroList){

        }
    }
}