class Pessoa {
    // As propriedades e funções são os membros das classes
    var nome:String? = null
    var idade:Int? = null
}

fun main() {
    val pessoa1 = Pessoa()
    pessoa1.nome = "Pedro Portella"
    pessoa1.idade = 20
    
    println(pessoa1.nome)
    println(pessoa1.idade)
}
