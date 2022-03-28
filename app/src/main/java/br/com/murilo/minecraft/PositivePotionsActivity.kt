package br.com.murilo.minecraft

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.murilo.minecraft.databinding.ActivityPositivePotionsBinding

class PositivePotionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPositivePotionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPositivePotionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnForca.setOnClickListener {
            val it  = Intent(applicationContext, PotionStrenghtActivity::class.java)
            startActivity(it)
        }
        binding.btnVisao.setOnClickListener {
            val it = Intent(applicationContext, PotionNightVision::class.java)
            startActivity(it)
        }
        binding.btnResistence.setOnClickListener {
            val it = Intent(applicationContext, PotionFireResistense::class.java)
            startActivity(it)
        }
        binding.btnInvisible.setOnClickListener {
            val it = Intent(applicationContext,PotionInvisibleActivity::class.java)
            startActivity(it)
        }
        binding.btnJump.setOnClickListener {
            val it = Intent(applicationContext, PotionSuperJumpActivity::class.java)
            startActivity(it)
        }
    }

}

