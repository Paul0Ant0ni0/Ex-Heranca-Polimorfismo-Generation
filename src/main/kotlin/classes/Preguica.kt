package classes

import heranca.Animal

class Preguica(nome: String, Idade: Int, sexo: String, corPelos: String, override var especie: String)
    : Animal(nome, Idade, sexo, corPelos){

    override fun dormir() {
        println("ZZZZZzzzzzzz.........")
    }

    override fun correr() {
        super.correr()
        println("Shiiiiic Shiiic Shiiiicc")
    }

    override fun comer() {
        println("Nhooooooc Nhooooc")
    }

    override fun som() {
        super.som()
        println("......")
    }

    override fun toString(): String {
        return "Preguiça: $nome;\n" +
                "Idade: $Idade\n" +
                "Raça: $especie\n"
    }

}