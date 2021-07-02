package pepz.classes

data class Funcionario (
    val name: String,
    val salary: Double,
    val type: String
    ) {
    override fun toString(): String {
        return """
            Nome: $name, Salary: R$ $salary, Type: $type
        """.trimIndent()
    }
}