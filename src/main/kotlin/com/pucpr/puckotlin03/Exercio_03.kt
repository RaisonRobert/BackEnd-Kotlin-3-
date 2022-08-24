package com.pucpr.puckotlin03

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Exercio_03 {
    //Criar um Mimificador
    @RequestMapping("mimificador")
    @ResponseBody
    fun number(
        @RequestParam
            (name = "mimi", required = false, defaultValue = "get") mimi: String
    ): String {
        
        return mimi
    }
}