package com.example.challengeandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.challengeandroidstudio.databinding.ActivityMainBinding
import com.example.challengeandroidstudio.model.Catalog
import com.example.challengeandroidstudio.model.Category
import com.example.challengeandroidstudio.adapter.CatalogAdapter
import com.example.challengeandroidstudio.adapter.CategoryAdapter


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val adaptercategory = CategoryAdapter()
    private val adaptercatalog = CatalogAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCategory()
        setListCatalog()
    }

    private fun setListCategory(){
        val datacategory = listOf(
            Category(image = R.drawable.img_ricered, name = "Nasi"),
            Category(image = R.drawable.img_noodlebowl, name = "Mie"),
            Category(image = R.drawable.img_popcorn, name = "Snack"),
            Category(image = R.drawable.img_chicken, name = "Ayam"),
            Category(image = R.drawable.img_soup, name = "Sayuran"),
            Category(image = R.drawable.img_drinks, name = "Minuman"),
        )
        binding.rvCategory.apply {
            adapter = this@MainActivity.adaptercategory
        }
        adaptercategory.submitData(datacategory)
    }

    private fun setListCatalog(){
        val datacatalog = listOf(
            Catalog(image = R.drawable.img_fried_rice, name = "Nasi Goreng Spesial Solo", price = 40000.0),
            Catalog(image = R.drawable.img_fried_rice_black_pepper, name = "Nasi Goreng Lada Hitam", price = 30000.0),
            Catalog(image = R.drawable.img_noodle_aceh, name = "Mie Goreng Aceh", price = 20000.0),
            Catalog(image = R.drawable.img_noodle_chicken, name = "Mie Ayam Solo",price = 15000.0),
            Catalog(image = R.drawable.img_honey_grilled_chicken, name = "Ayam Bakar Madu", price = 16000.0),
            Catalog(image = R.drawable.img_fried_chicken, name = "Ayam Goreng", price = 14000.0),
            Catalog(image = R.drawable.img_crab_asparagus_soup, name = "Sup Asparagus Kepiting", price = 50000.0),
            Catalog(image = R.drawable.img_tamarind_vegetable_soup, name = "Sayur Asem", price = 12000.0),
            Catalog(image = R.drawable.img_batter_coated_fried_tempeh, name = "Tempe Mendoan", price = 8000.0),
            Catalog(image = R.drawable.img_fried_tofu_in_sweet_spicy_sauce, name = "Tahu Gejrot", price = 7000.0),
            Catalog(image = R.drawable.img_ice_tea, name = "Es Teh Manis", price = 4000.0),
            Catalog(image = R.drawable.img_squeezed_orange_ice, name = "Es Jeruk Peras", price = 6000.0),

            )
        binding.rvCatalog.apply {
            adapter = this@MainActivity.adaptercatalog
        }
        adaptercatalog.submitData(datacatalog)
    }
}
