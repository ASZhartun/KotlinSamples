package requests

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser


class WeatherHolder {
    fun makeRequest() {
        val okHttpClient = OkHttpClient()
        val response = okHttpClient.newCall(Request.Builder().url("https://www.boredapi.com/api/activity").build()).execute()
        val message = parseResponse(response)
        println(message)
        val parse = JSONParser().parse(message)
        val result = parse as JSONObject
        val any = result["activity"]
        println(any)
    }

    fun parseResponse(response : Response) : String {
        return response.body?.string() ?: "no response"
    }
}