package com.pemmob.satriapnd.data.dummy

import com.pemmob.satriapnd.data.model.Category
import com.pemmob.satriapnd.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Makanan
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik gurih", price = 15000.0, stock = 10, img = "icon_app_jualan"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Mendoan khas Banyumas", price = 20000.0, stock = 15, img = "icon_app_jualan"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale pisang manis", price = 25000.0, stock = 20, img = "icon_app_jualan"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk legit", price = 30000.0, stock = 40, img = "icon_app_jualan"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Nopia rasa cokelat", price = 22000.0, stock = 12, img = "icon_app_jualan"),

        // Minuman
        Product(id = 6, category_id = 2, category = categories[1], name = "Es Dawet", description = "Dawet segar", price = 8000.0, stock = 25, img = "icon_app_jualan"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Kopi Robusta", description = "Kopi hitam lokal", price = 18000.0, stock = 30, img = "icon_app_jualan"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Wedang Jahe", description = "Jahe hangat", price = 10000.0, stock = 18, img = "icon_app_jualan"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Teh Poci", description = "Teh melati", price = 7000.0, stock = 22, img = "icon_app_jualan"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Sirup Stroberi", description = "Sirup buah", price = 15000.0, stock = 15, img = "icon_app_jualan"),

        // Kerajinan
        Product(id = 11, category_id = 3, category = categories[2], name = "Batik Purbalingga", description = "Kain batik", price = 150000.0, stock = 10, img = "icon_app_jualan"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Sandal Bandol", description = "Sandal karet", price = 40000.0, stock = 25, img = "icon_app_jualan"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu lantai", price = 25000.0, stock = 50, img = "icon_app_jualan"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Anyaman Bambu", description = "Keranjang kayu", price = 60000.0, stock = 15, img = "icon_app_jualan"),
        Product(id = 15, category_id = 3, category = categories[2], name = "Ukiran Kayu", description = "Hiasan meja antik", price = 85000.0, stock = 8, img = "icon_app_jualan")
    )
}
