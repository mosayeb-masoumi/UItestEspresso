package com.example.uitestespresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()

        // result form MainActivity
         txt_result.text = intent.getStringExtra("NAME")

        btn_login.setOnClickListener {

            if(edt_name.text.isNotEmpty() && edt_password.length()>6){

                txt_loginSuccess.visibility = View.VISIBLE
                txt_loginFailure.visibility  =View.GONE
            }else{
                txt_loginFailure.visibility = View.VISIBLE
                txt_loginSuccess.visibility = View.GONE
            }
        }


    }
}