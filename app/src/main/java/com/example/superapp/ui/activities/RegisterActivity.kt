package com.example.superapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.superapp.MainActivity
import com.example.superapp.R
import com.example.superapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)

        // Hide action bar
        supportActionBar?.hide()

        binding.textLogin.setOnClickListener {
            goLoginActivityFromRegisterActivity()
        }
    }

    private fun goMainActivityFromRegisterActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun goLoginActivityFromRegisterActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}