package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria do Bairro", cpf = "123.123.123-12", salario = 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}

