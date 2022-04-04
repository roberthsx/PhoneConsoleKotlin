package br.com.orderphone.provider

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

//notificador
//observador -- observer
//enviaMsg
// construir mensagem -- strategy // builder
//adicionar detalhe diferente a cada empresa  -- decorator

//## Eu como Usuario
//## Necessito de envio de pedido de smartphones aos fornecedores de forma digital
//para as marcas (Apple,Samsung,Motorola) , independente de como será o envio(http, rest , soap),
// e ter o controle de envio dos mesmos
//## Para aumentar nosso número e controle de pedidos que hoje é feito de forma manual


//Dado Mensagem de envio de pedido cujo corpo esteja vazia
//Quando envio de pedido Apple
//Entao devolver mensagem de erro de pedido

//Dado Mensagem de envio de pedido cujo tipo seja diferente de Http
//Quando envio de pedido Apple
//Entao devolver mensagem de tecnologia incompativel

//Dado Mensagem de envio de pedido cuja mensagem esteja ok
//Quando envio de pedido Apple
//Entao devolver mensagem de envio realizado


//## Eu como Usuario
//## Necessito de envio de pedido de smartphones aos fornecedores de forma digital
//para as marcas (Apple,Samsung,Motorola) , independente de como será o envio(http, rest , soap),
// e ter o controle de envio dos mesmos
//## Para aumentar nosso número e controle de pedidos que hoje é feito de forma manual
internal class AppleProviderTest{
    private val testSample: AppleProvider = AppleProvider()

    //Dado Mensagem de envio de pedido cujo corpo esteja vazia
    //Quando envio de pedido Apple
    //Entao devolver mensagem de erro de pedido
    @Test
    fun SendOrderMessageWithBodyEmptyWhenSendAppleProviderReturnsBodyMessageError() {
        //arrange
        val expected = 42
        //act

        //assert
        //assertEquals(expected, testSample.sum(40, 2))
    }

    //Dado Mensagem de envio de pedido cujo tipo seja diferente de Http
    //Quando envio de pedido Apple
    //Entao devolver mensagem de tecnologia incompativel
    @Test
    fun SendOrderMessageWithTypeDiffHttpWhenSendAppleProviderReturnsProtocolMessageError() {
        //Arrange
        //val orderMessage = OrderMessage()
        val expectReturn = "Error Send Protocol"

        //Act
        val appleProvider = AppleProvider()
        //val messageReturn: Unit = appleProvider.sendMessage(orderMessage)

        //Assert
        //assertNotNull(messageReturn)
        //assertEquals(expectReturn, messageReturn)
    }

    //Dado Mensagem de envio de pedido cuja mensagem esteja ok
    //Quando envio de pedido Apple
    //Entao devolver mensagem de envio realizado
    @Test
    fun SendOrderMessageWithMessageOkWhenSendAppleProviderReturnsMessageSucess() {
        //Arrange
        //val orderMessage = OrderMessage()
        val expectReturn = "Send Message Ok"

        //Act
        val appleProvider = AppleProvider()
        //val messageReturn: Unit = appleProvider.sendMessage(orderMessage)

        //Assert
        //assertNotNull(messageReturn)
        //assertEquals(expectReturn, messageReturn)
    }
}