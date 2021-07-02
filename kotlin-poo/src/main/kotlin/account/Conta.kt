package one.digitalinnovation.digionebank.account

import java.lang.IllegalArgumentException

class Conta(
    val agency: String,
    val number: String
) : Depositavel, Sacavel {

    var amount: Double = 0.0; private set

    override fun deposito(amount: Double) {
        this.amount += amount
    }

    override fun saque(amount: Double) {
        if(this.amount < amount) throw IllegalArgumentException("There is no possible to do a withdraw without enough amount!")

        this.amount -= amount
    }

    override fun toString(): String {
        return """
            Ag:     $agency
            Cc:     $number
            Amount:  $amount       
        """.trimIndent()
    }
}