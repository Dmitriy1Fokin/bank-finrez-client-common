package ru.fdo.bank.finrez.clientservicecommon.coreapi.query

import org.springframework.data.domain.Pageable

data class FindClientByParamsQuery(val searchParameters: Map<String, String>, val pageable: Pageable)