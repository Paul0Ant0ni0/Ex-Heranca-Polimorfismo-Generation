import classes.Cachorro

fun main() {

    //Classe cachorro criada aparti da classe abstrata Animal

    val luna = Cachorro("Luna,", 5,
        true, true, "femea", "vira-lata", "Amarelo-ligth")

    while (true) {
        println("Seja bem Vindo(a)")
        println("'-.-''-.-''-.-''-.-''-.-''-.-''-.-''-.-'")
        println("Digite 0 - Listar dados do cachorro")
        println("Digite 1 - Escutar o cachorro latindo")
        println("Digite 2 - Escutar o cachorro dormindo")
        println("Digite 3 - Escutar o cachorro correndo")
        println("Digite 4 - Escutar o cachorro comendo")
        println("Digite 5 - Sair")
        print("Digite aqui: ")
        var n = readln().toInt()

        println("\n\n")
        when (n) {

            0 -> {
                println("Dados do cachorro")
                println(luna)
                println("-w-w-w-w-w-w-w-w-w-w")
            }
            1 -> {
                luna.som()
                println("-*-*-*-*-*-*-*-*-*-*")
            }
            2 -> {
                println("Cachorro dormindo...")
                luna.dormir()
                println("='_'=='_'=='_'=='_'=")
            }
            3 -> {
                println("Cachorro correndo...")
                luna.correr()
                println("-*-*-*-*-*-*-*-*-*-*")
            }
            4 -> {
                println("Som do cachorro comendo...")
                luna.comer()
                println("='_'=='_'=='_'=='_'=")
            }
            5 -> break
        }
    }

}