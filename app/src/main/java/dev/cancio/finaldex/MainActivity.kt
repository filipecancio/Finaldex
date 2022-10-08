package dev.cancio.finaldex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.cancio.finaldex.ui.screen.HomeScreen
import dev.cancio.finaldex.ui.theme.FinaldexTheme
import dev.cancio.finaldex.viewmodel.DetailViewModel
import dev.cancio.finaldex.viewmodel.GameViewModel
import dev.cancio.finaldex.viewmodel.HomeViewModel
import dev.cancio.finaldex.viewmodel.LikeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val homeViewModel = HomeViewModel()
        val detailViewModel = DetailViewModel()
        val gameViewModel = GameViewModel()
        val likeViewModel = LikeViewModel()
        setContent {
            FinaldexTheme {
                HomeScreen(viewModel = homeViewModel)
            }
        }
    }
}