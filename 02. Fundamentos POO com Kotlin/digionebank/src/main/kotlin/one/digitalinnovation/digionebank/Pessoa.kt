package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ronan"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val ronan = Pessoa()

    println(ronan.nome)
    println(ronan.cpf)
}