package com.example.compose

import androidx.lifecycle.ViewModel

class CoordinateViewModel(val repository : CoordinateRepository): ViewModel(){
    fun sayHello() = "${repository.giveHello()} from $this"
}