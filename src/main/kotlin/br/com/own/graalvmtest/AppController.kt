package br.com.own.graalvmtest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/app")
class AppController {

    @GetMapping
    fun hello() : String = "Hello World!"

}