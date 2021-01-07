package ru.fdo.bank.finrez.clientservicecommon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ClientServiceCommonApplication

fun main(args: Array<String>) {
    runApplication<ClientServiceCommonApplication>(*args)
}
