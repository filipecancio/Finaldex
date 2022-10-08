package dev.cancio.finaldex.viewmodel

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private var score = "nao sei ainda"

    fun setResult(value: Int) = if (value > 5) {
        score = "voce passou"
    } else {
        score = "voce perdeu"
    }

    fun getScore(name: String): String = "${score}, ${name}."

}