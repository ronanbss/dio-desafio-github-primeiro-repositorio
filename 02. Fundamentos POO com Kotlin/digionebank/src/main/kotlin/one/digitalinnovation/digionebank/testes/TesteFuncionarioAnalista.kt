package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista(nome = "João Marcos", cpf = "123.123.123-12", salario = 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}