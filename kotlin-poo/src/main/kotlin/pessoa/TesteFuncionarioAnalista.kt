package one.digitalinnovation.digionebank.testes

import pessoa.classes.Analista
import pessoa.classes.ImprimeRelatorioFuncionario

fun main() {
    val analista = Analista("João Pedro", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(analista)
}
