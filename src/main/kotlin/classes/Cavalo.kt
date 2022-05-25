package classes

import heranca.Animal

class Cavalo(nome: String, Idade: Int, sexo: String, corPelos: String, override var especie: String,
                      var altura: Double) :Animal(nome, Idade, sexo, corPelos) {
    override fun som() {
        super.som()
        println("$nome relinchando")
        println("Hiin in in ")
    }

    override fun correr() {
        println("pocotó pocotó pocotó")
    }

    override fun dormir() {
        println("Groarghhrr")
        println("ZZZZzzzzzzz")
    }

    override fun comer() {
        println("Nhac Nhac")
        println("Chomp Chomp Chomp ")
    }
    override fun toString(): String {
        return "Cachorro: $nome;\n" +
                "Idade: $Idade\n" +
                "Raça: $especie\n" +
                "Altura: $altura"
    }
}
