package one.digitalinnovation.collections

fun main () {
    val nomes = Array<String>(size = 3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Jose"
    nomes[2] = "Joao"

    for (nome in nomes) {
        println(nome)
    }

    println("*************")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("*************")
    val nomes2 = arrayOf("Pandego", "MalucoDoido", "TaxadoDeDoido")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}