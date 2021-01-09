package ru.fdo.bank.finrez.clientservicecommon.coreapi.command

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.time.LocalDate

data class UpdateClientIndividualCommand(@TargetAggregateIdentifier val clientId: String,
                                         val lastName: String,
                                         val firstName: String,
                                         val middleName: String,
                                         val citizenship: String,
                                         val birthday: LocalDate,
                                         val passport: String)