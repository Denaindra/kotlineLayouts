package com.shift4.layouts

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*


class MainActivity : AppCompatActivity() {

    private lateinit var userNameText: TextView
    private lateinit var userNameTextEditor: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dump_main)

        val clickBtn: Button = findViewById(R.id.button)
        userNameText = findViewById(R.id.textView3)
        userNameTextEditor = findViewById(R.id.editTextTextPersonName)

        clickBtn.setOnClickListener {
            AppendUserName(it)
        }
    }

    private fun AppendUserName(view: View) {
        if (!userNameTextEditor.text.toString().isNullOrBlank()) {
            userNameText.visibility = View.VISIBLE;
            userNameText.text = userNameTextEditor.text.toString();
            val inputMethodManager =
                getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

}