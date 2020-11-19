package com.africinnovate.footballleagues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selectionscren : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectionscren)

        val championsleaguebtn = findViewById<Button>(R.id.championsleaguebtn)
        championsleaguebtn.setOnClickListener {
            val intent = Intent(this, Championsleague::class.java)
            startActivity(intent)
        }

        val laligaleaguebtn = findViewById<Button>(R.id.laligaleaguebtn)
        laligaleaguebtn.setOnClickListener {
            val intent = Intent(this, Laligaleague::class.java)
            startActivity(intent)
        }

        val europaLeaguecupbtn = findViewById<Button>(R.id.europaleaguecupbtn)
        europaLeaguecupbtn.setOnClickListener {
            val intent = Intent (this,europaLeaguecupbtn::class.java)
            startActivity(intent)
        }

        val worldcuptrophybtn = findViewById<Button>(R.id.worldcuptrophybtn)
        worldcuptrophybtn.setOnClickListener {
            val intent = Intent (this,worldcuptrophybtn::class.java)
            startActivity(intent)
        }

        val carabaotrophybtn = findViewById<Button>(R.id.carabaotrophybtn)
        carabaotrophybtn.setOnClickListener {
            val intent = Intent (this,carabaotrophybtn::class.java)
            startActivity(intent)
        }

        val Eplcuptrophybtn = findViewById<Button>(R.id.eplcuptrophybtn)
        Eplcuptrophybtn.setOnClickListener {
            val intent = Intent (this, Eplcuptrophybtn::class.java)
            startActivity(intent)
        }

        val Frenchligue1btn = findViewById<Button>(R.id.Frenchligue1btn)
        Frenchligue1btn.setOnClickListener {
            val intent = Intent (this, Frenchligue1btn::class.java)
            startActivity(intent)
        }



    }

}