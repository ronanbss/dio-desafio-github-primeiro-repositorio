package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "Joao", 1000.0, "CLT")
    val pedro = Funcionario(nome = "Pedro", 3000.0, "PJ")
    val maria = Funcionario(nome = "Maria", 5000.0, "CLT")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach { println(it) }

    println("**********")
    println(funcionarios.find { it.nome == "Maria" })

    println("**********")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("**********")
    funcionarios
        .groupBy { it.tipoContracao }
        .forEach { println(it) }

}

