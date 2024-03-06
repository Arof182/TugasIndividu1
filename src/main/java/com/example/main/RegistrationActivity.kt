package com.example.main

import androidx.activity.compose.setContent
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.main.ui.theme.MainTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                }
            }
        }

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            val fullName = findViewById<EditText>(R.id.etFullName).text.toString()
            val email = findViewById<EditText>(R.id.etEmail).text.toString()

            val intent = Intent(this, DataDisplayActivity::class.java)
            intent.putExtra("fullName", fullName)
            intent.putExtra("email", email)
            startActivity(intent)
        }
    }
}
