package com.example.uts_renald

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Music (
    val imgmusic: Int,
    val namemusic: String,
    val descmusic: String
) : Parcelable