package com.pucpr.puckotlin03

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class Exercio_03 {
    //Criar um Mimificador
    @RequestMapping("mimificador/{text}")
    @ResponseBody
    fun handleString(@PathVariable text: String): String {
        val padraEsperado = """(a|á|à|ã|â|ä|e|ë|é|è|ê|ï|i|í|ì|î|o|ö|ô|ó|ò|õ|ü|u|ú|ù|û)""".toRegex()
        val result = padraEsperado.replace(text,"i")
        return result
    }
}
//        val padraoEsperado = "([0-9]{2})([0-9]{4,5})([0-9]{4})".toRegex()
//        val formatoEsperado = "($1) $2-$3"
//        val telefoneFormatado = "1122223333".replace(padraoEsperado, formatoEsperado)