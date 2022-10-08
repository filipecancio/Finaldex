package dev.cancio.finaldex.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.cancio.finaldex.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel
) {
    //Settings
    viewModel.setResult(2)

    //View
    Text(text = viewModel.getScore("home"))
}