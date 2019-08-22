package com.example.lab4ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var subject: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showDatePickerDialog(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")}


            fun showDetail(view: View) {
                var radioGroup: RadioGroup = findViewById(R.id.radioGroup)
                var selectedId: Int = radioGroup.checkedRadioButtonId;
                var radioButton: RadioButton = findViewById(selectedId);
                text_show.text =
                    "Username: ${edit_username.text}\nPassword: ${edit_password.text}\nGender: ${radioButton.text}\nEmail: ${edit_email.text}\nTime: ${text_date.text}"
            }

            fun reset(v: View) {
                edit_username.text.clear()
                edit_password.text.clear()
                edit_email.text.clear()
                radioGroup.clearCheck()
                text_date.text = "mm / dd / yy"
                text_show.text = "Show Information"

            }
        }
