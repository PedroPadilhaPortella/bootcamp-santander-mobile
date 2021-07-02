package one.digitalinnovation.digionebank.bank

data class Banco(
    val name: String,
    val number: Int
) {
    fun info() = "Name: $name - CC $number"
}
