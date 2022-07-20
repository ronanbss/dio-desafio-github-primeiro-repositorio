package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ronan"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val ronan = Pessoa()

    println(ronan.pessoaInfo())
}