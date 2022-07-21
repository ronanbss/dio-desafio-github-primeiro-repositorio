package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val ronan = Pessoa(nome = "Ronan Brito", cpf = "123.123.123-12")

    println(ronan.nome)
    println(ronan.cpf)

    val joao = Funcionario(nome = "Ronan Brito", cpf = "123.123.123-12", salario = BigDecimal.valueOf(val = 2000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}