package br.com.murilo.minecraft

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.murilo.minecraft.databinding.ActivityNegativePotionsBinding

class NegativePotionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNegativePotionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNegativePotionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVeneno.setOnClickListener {
            val it  = Intent(applicationContext, PotionPoisonActivity::class.java)
            startActivity(it)
        }

        binding.btnFraqueza.setOnClickListener {
            val it = Intent(applicationContext, PotionWeaknessActivity::class.java)
            startActivity(it)
        }
        binding.btnDano.setOnClickListener {
            val it = Intent(applicationContext, PotionImmediateDamageActivity::class.java)
            startActivity(it)
        }

    }
}
