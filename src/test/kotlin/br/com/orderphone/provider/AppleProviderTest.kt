package br.com.orderphone.provider

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AppleProviderTest{
    private val testSample: AppleProvider = AppleProvider()

    @Test
    fun SendOrderMessageWithBodyEmptyWhenSendAppleProviderReturnsBodyMessageError() {
        //arrange
        val expected = 42
        //act

        //assert
        //assertEquals(expected, testSample.sum(40, 2))
    }
}