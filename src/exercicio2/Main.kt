package exercicio2

fun main() {

    val conjuntoVazio = mutableSetOf(1,5,5,6,7,8,8,8)

    println("Os números da lista são: $conjuntoVazio")
}

//Definir e inicializar um novo conjunto vazio. Adicionar os seguintes
//elementos ao conjunto vazio: {1,5,5,6,7,8,8,8}. Imprimir o resultado na
//tela. Qual é a diferença entre este exercício e o anterior?

// Resposta: Quando usamos listOf o resultado exibido mostra todos os
// números da lista, sendo eles repetidos ou não. Já quando usamos o setOf ele lê
// os números porém sem repetir os números que estão dentro desse conjunto.