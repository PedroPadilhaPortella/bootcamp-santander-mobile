package pessoa.classes

class Gerente(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Funcionario(name = name, cpf = cpf, salary = salary), Logavel {
    override fun calculoAuxilio(): Double = salary * 0.4

    override fun login(): Boolean = "senha123" == password
}