package com.example.servicedemo24

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject

class RateCheckInteractor {
    val RATE_URL = "" // TODO: указать верный адрес для запросов котировок
    val networkClient = NetworkClient()

    suspend fun requestRate(): String {
        return withContext(Dispatchers.IO) {
            //val result = networkClient.request(MainViewModel.USD_RATE_URL)
            val result = networkClient.request(RATE_URL)
            if (!result.isNullOrEmpty()) {
                parseRate(result)
            } else {
                ""
            }
        }
    }

    private fun parseRate(jsonString: String): String {
        // TODO: использовать GSON для парсинга строки
        /*
        try {
            return JSONObject(jsonString)
                .getJSONObject("rates")
                .getJSONObject("USDRUB")
                .getString("rate")
        } catch (e: Exception) {

            Log.e("RateCheckInteractor", "", e)
        }

         */
        return ""
    }
}
