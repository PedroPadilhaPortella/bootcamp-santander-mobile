package one.digitalinnovation.digionebank.pessoa

import pessoa.classes.Cliente
import pessoa.classes.ClienteTipo
import pessoa.classes.TesteAutenticacao

fun main() {
    val cliente = Cliente(
        name = "Jose da Silva",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        password = "123456"
    )

    println(cliente)

    TesteAutenticacao().autentica(cliente)
}