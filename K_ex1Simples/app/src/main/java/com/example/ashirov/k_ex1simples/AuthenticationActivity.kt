package com.example.ashirov.k_ex1simples

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ashirov.k_ex1simples.students_page.StudentActivity
import com.example.ashirov.k_ex1simples.teachers_page.TeacherActivity
import kotlinx.android.synthetic.main.activity_authentication.*

class AuthenticationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
        val bundle:Bundle=intent.extras
        val status:String = bundle.getString("status")
        var intent2 :Intent
        bLogin.setOnClickListener {
            if (status.equals("teacher")){
                intent2= Intent(this,TeacherActivity::class.java)
                startActivity(intent2)
            }else{
                intent2= Intent(this,StudentActivity::class.java)
                startActivity(intent2)
            }
        }

    }
}
