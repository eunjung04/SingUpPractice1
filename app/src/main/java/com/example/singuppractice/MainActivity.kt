package com.example.singuppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BasicActivity() {


    override fun setupEvents() {

        idEdt.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
              val inputVal=s.toString()
                if(inputVal.length == 0){
                    idStatusTxt.text="최소 여섯글자 이상으로 해주세요."
                }
                else if(inputVal.length<6){
                    idStatusTxt.text="아이디가 너무 짧습니다."
                }

                else{
                    idStatusTxt.text="사용해도 좋은 아이디입니다."
                }

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {


            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }


        })

    }

    override fun setValues() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
}


