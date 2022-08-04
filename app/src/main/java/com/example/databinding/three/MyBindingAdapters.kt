package com.example.databinding.three

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("loadImageFromServer")
fun ImageView.loadImageFromUrl(profilePhoto: String){
    this.load(profilePhoto)
}
