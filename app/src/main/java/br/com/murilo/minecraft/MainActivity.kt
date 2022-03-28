package br.com.murilo.minecraft

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.murilo.minecraft.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPositivePotions.setOnClickListener {
            val it = Intent(applicationContext, PositivePotionsActivity::class.java)
            startActivity(it)
        }

        binding.btnNegativePotions.setOnClickListener {
            val it = Intent(applicationContext, NegativePotionsActivity::class.java)
            startActivity(it)
        }
    }
}


