package com.dlasit.qamb.app.common.base


interface BaseUseCase<in P> {
    suspend fun execute(params: P)
}