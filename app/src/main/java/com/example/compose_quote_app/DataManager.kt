package com.example.compose_quote_app

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.compose_quote_app.models.Quote
import com.google.gson.Gson

object DataManager {
    var data = emptyArray<Quote>()
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true
    }
}