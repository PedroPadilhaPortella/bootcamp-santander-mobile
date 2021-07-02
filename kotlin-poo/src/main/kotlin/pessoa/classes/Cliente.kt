package pessoa.classes

class Cliente(
    name: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val password: String
) : Pessoa(name, cpf), Logavel {
    override fun login(): Boolean = "123456" == password

    override fun toString(): String = """
        Nome:     $name
        Cpf:      $cpf
        Tipo:     ${clienteTipo.descricao}
    """.trimIndent()
}