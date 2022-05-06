package exercicio5

fun main() {

    println("------- LISTA DE OBJETOS -------")

    val imprimirLista = Dicionario().inserirDadosLista()
    imprimirLista.forEach { i ->
        println(i)
    }
}



