package com.example.challengeandroidstudio.feature.detail

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.challengeandroidstudio.R
import com.example.challengeandroidstudio.data.model.Catalog
import toIndonesianFormat
import com.example.challengeandroidstudio.feature.main.MainActivity

class DetailActivity : AppCompatActivity() {

    private var count: Int = 1
    private lateinit var catalog: Catalog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        catalog = intent.getParcelableExtra<Catalog>("catalog") ?: return
        showCatalogData()
        setupListeners()
        findViewById<TextView>(R.id.tv_location_title)?.text = getString(R.string.location_title_default)
        findViewById<TextView>(R.id.tv_address)?.text = getString(R.string.address_location)

    }

    private fun showCatalogData() {
        Log.d("DetailActivity", "Catalog: $catalog")
        val ivCatalogImages = findViewById<ImageView>(R.id.iv_catalog_images)
        val tvCatalogName = findViewById<TextView>(R.id.tv_catalog_name)
        val tvCatalogPrice = findViewById<TextView>(R.id.tv_catalog_price)
        val tvFoodDesc = findViewById<TextView>(R.id.tv_food_desc)

        catalog?.let { catalog ->
            Log.d("DetailActivity", "Catalog name: ${catalog.name}")
            ivCatalogImages.setImageResource(catalog.image)
            tvCatalogName.text = catalog.name
            tvCatalogPrice.text = catalog.price.toIndonesianFormat()
            tvFoodDesc.text = catalog.desc
        }

        if (catalog == null) {
            Toast.makeText(this, "Catalog data is null", Toast.LENGTH_SHORT).show()
            finish()
        }
    }


    private fun setupListeners() {

        findViewById<Button>(R.id.ic_add).setOnClickListener { incrementCount() }
        findViewById<Button>(R.id.ic_minus).setOnClickListener { decrementCount() }
        findViewById<CardView>(R.id.cv_location_detail).setOnClickListener { navigateToGoogleMaps() }
        findViewById<Button>(R.id.btn_back_home)?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun incrementCount() {
        count++
        updateQuantityText()
        updateTotalPrice()
    }

    private fun decrementCount() {
        if (count > 1) {
            count--
            updateQuantityText()
            updateTotalPrice()
        } else {
            Toast.makeText(this, "Minimum order is 1", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateQuantityText() {
        findViewById<TextView>(R.id.tv_quantity_text).text = count.toString()
    }

    @SuppressLint("StringFormatMatches")
    private fun updateTotalPrice(){
        val price = catalog.price
        val totalPrice = price * count
        val btnAddToCart = findViewById<Button>(R.id.btn_add_to_cart)
        btnAddToCart?.text = getString(R.string.add_to_cart_text, totalPrice)
    }

    private fun navigateToGoogleMaps() {
        val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.3013244,106.6533703,17z"))
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }
}
