package exercicio5


class Dicionario()

fun inserirDadosLista() {

    val listaDicionario = mutableMapOf<String, String>()

    listaDicionario.put("Bola", " -> Azul")
    listaDicionario.put("Boneca", " -> Amarela")
    listaDicionario.put("Dado", " -> Rosa")
    listaDicionario.put("Carrinho", " -> Verde")
    listaDicionario.put("Pião", " -> Roxo")

    println("------- EXIBIR LISTA DE OBJETOS -------")
    listaDicionario.forEach {
        it.key
    }
}


//Criar um dicionário que represente os objetos e suas cores. Para isso,
//o dicionário deverá ter como chave String e como valor uma lista de
//Strings.

//Exemplo dos valores:
//bola -> azul
//boneca -> amarela
//dado -> rosa

//Em seguida crie um arquivo com seu método main, imprimir no
//Main todas as chaves junto com seus valores associados. Para isso,
//utilizar o foreach com as chaves.