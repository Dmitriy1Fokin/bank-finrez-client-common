package ru.fdo.bank.finrez.clientservicecommon.coreapi.event


data class ClientCorpCreatedEvent(val clientId: String,
                                  val name: String,
                                  val orgForm: String,
                                  val abbreviatedName: String,
                                  val inn: String,
                                  val kpp: String,
                                  val ogrn: String,
                                  val okpo: String,
                                  val okved: String,
                                  val addressU: String,
                                  val addressF: String,
                                  val email: String)