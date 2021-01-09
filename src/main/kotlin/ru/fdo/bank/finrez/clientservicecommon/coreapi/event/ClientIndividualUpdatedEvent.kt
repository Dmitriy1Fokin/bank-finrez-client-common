package ru.fdo.bank.finrez.clientservicecommon.coreapi.event

import java.time.LocalDate

data class ClientIndividualUpdatedEvent(val clientId: String,
                                        val lastName: String,
                                        val firstName: String,
                                        val middleName: String,
                                        val citizenship: String,
                                        val birthday: LocalDate,
                                        val passport: String)