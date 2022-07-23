package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "Joao", 1000.0, "CLT")
    val pedro = Funcionario(nome = "Pedro", 3000.0, "PJ")
    val maria = Funcionario(nome = "Maria", 5000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("***********")

    repositorio.findAll().forEach { println(it) }

    println("***********")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}