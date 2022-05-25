package heranca

abstract class Animal(var nome: String, var Idade: Int, sexo: String, corPelos: String){


    abstract var especie:String

    /*
    Gerar métodos abstratos
     */

    open fun som(){
        println("\nOlha o sonzinho desse animal...")
    }

    open fun correr(){
        println("\nOlha como este animal faz....")
    }

    abstract fun dormir()

    abstract fun comer()

}