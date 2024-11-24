package com.noxis.internetconnectionobserver

import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {

    fun isConnected(): Flow<Boolean>
}