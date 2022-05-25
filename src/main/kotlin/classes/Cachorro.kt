package classes

import heranca.Animal

class Cachorro(nome: String, Idade: Int, var vacinado: Boolean, var adestrado: Boolean,
                    var sexo: String, override var especie: String,
                    var corPelos: String) : Animal(nome, Idade, sexo, corPelos){


     override fun som() {
         super.som()
        println("Cachorro latindo")
        println("Au Au Au....")
    }

    override fun correr() {
        println("cachorro: Hoje eu pego esse motoqueiro...")
        println("motoqueiro: Vrum Vrum Vruuuuummmm")
        println("cachorro: Au Au Au....")
    }

    override fun dormir() {
        println("ron-ron\n" +
                "Zzzzzzzz")
    }

    override fun comer() {
        println("\nChomp! Chomp!")
    }

    override fun toString(): String {
        return "Cachorro: $nome;\n" +
                "Idade: $Idade\n" +
                "Raça: $especie\n" +
                "Cor do pelo: $corPelos\n"
    }
}