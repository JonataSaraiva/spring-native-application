package br.com.own.graalvmtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraalvmTestApplication

fun main(args: Array<String>) {
	runApplication<GraalvmTestApplication>(*args)
}
