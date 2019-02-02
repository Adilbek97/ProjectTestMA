package com.example.ashirov.k_ex1simples

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ashirov.k_ex1simples.teachers_page.TeacherActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent=Intent(this,AuthenticationActivity::class.java)
        bTeacher.setOnClickListener {
            Toast.makeText(this,"Button teacher was clicked",Toast.LENGTH_LONG).show()
            intent.putExtra("status","teacher")
            startActivity(intent)
        }
        bStudent.setOnClickListener {
            Toast.makeText(this,"Button student was clicked",Toast.LENGTH_LONG).show()
            intent.putExtra("status","student")
            startActivity(intent)
        }
    }
}
