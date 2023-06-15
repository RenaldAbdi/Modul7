package com.example.uts_renald

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

    @Parcelize
    data class DataMember (
        val imgmember: Int,
        val namemember: String
    ) : Parcelable