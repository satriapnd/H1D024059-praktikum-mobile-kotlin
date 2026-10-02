package com.pemmob.satriapnd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pemmob.satriapnd.ui.screen.DaftarProdukScreen
import com.pemmob.satriapnd.ui.screen.DetailProductScreen
import com.pemmob.satriapnd.ui.screen.HubungiKamiScreen
import com.pemmob.satriapnd.ui.theme.JualanTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pemmob.satriapnd.ui.viewmodel.ProductViewModel

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JualanTheme {
                val navController = rememberNavController()
                val productViewModel: ProductViewModel = viewModel()
                
                NavHost(
                    navController = navController,
                    startDestination = "daftar_produk"
                ) {
                    composable(route = "daftar_produk") {
                        DaftarProdukScreen(
                            navController = navController,
                            viewModel = productViewModel
                        )
                    }

                    composable(
                        route = "detail/{productId}",
                        arguments = listOf(navArgument(name = "productId") {
                            type = NavType.IntType
                        })
                    ) { backStackEntry ->
                        val productId = backStackEntry.arguments?.getInt("productId") ?: 0
                        DetailProductScreen(
                            productId = productId,
                            navController = navController,
                            viewModel = productViewModel
                        )
                    }

                    composable(route = "hubungi_kami") {
                        HubungiKamiScreen(navController = navController)
                    }
                }
            }
        }
    }
}
