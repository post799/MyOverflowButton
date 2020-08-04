package com.andriyaleksyeyev.myoverflowbutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inlater: MenuInflater
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent2 = Intent(this,MainActivity2::class.java)
        val intent3 = Intent(this,MainActivity3::class.java)
        val intent4 = Intent(this,MainActivity4::class.java)



        when(item.itemId){
               R.id.item2 -> startActivity(intent2)
            R.id.item3 -> startActivity(intent3)
            R.id.toolbarItem -> startActivity(intent4)

            R.id.item4 -> Toast.makeText(this,"Your toast message",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)

    }
}