package exercicio5

class Dicionario {

    fun inserirDadosLista(): MutableMap<String, String> {

        val listaDicionario = mutableMapOf<String, String>()

        listaDicionario.put("Bola", "Azul")
        listaDicionario.put("Boneca", "Amarela")
        listaDicionario.put("Dado", "Rosa")
        listaDicionario.put("Carrinho", "Verde")
        listaDicionario.put("Pião", "Roxo")

        return listaDicionario
    }
}
