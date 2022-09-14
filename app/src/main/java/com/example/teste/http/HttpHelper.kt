package com.example.teste.http

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class HttpHelper {
    fun post(json: String): String {

        //URL do SERVIDOR
        val URL = "http://192.168.0.10:8080/adda/usuario"

        //CABECALHO HTTP
        val headerHttp = MediaType.parse("application/json; charset=utf-8")

        //CLIENTE PRA MANDAR REQUISICAO
        val callHttp = OkHttpClient()

        //CRIAR CORPO DA REUISICAO
        val bodyRequest = RequestBody.create(headerHttp,json)

        //CONSTRUIR O METODO POST PARA O SERVIDOR
        var requestHttp = Request.Builder().url(URL).post(bodyRequest).build()

        //CLIENT VAI FAZER A REQUISICAO E RECEBER A RESPOSTA
        val response = callHttp.newCall(requestHttp).execute()

        return response.body().toString()

    }
}