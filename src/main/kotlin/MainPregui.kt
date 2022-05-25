import classes.Preguica

fun main(){
    val flecha = Preguica("Flecha", 25, "Macho",
        "Cinza amarelado", "Bradypus variegatus")

    while (true) {
        println("Seja bem Vindo(a)")
        println("'-.-''-.-''-.-''-.-''-.-''-.-''-.-''-.-'")
        println("Digite 0 - Listar dados do preguiça")
        println("Digite 1 - Escutar o do preguiça")
        println("Digite 2 - Escutar o preguiça dormindo")
        println("Digite 3 - Escutar o preguiça correndo")
        println("Digite 4 - Escutar o preguiça comendo")
        println("Digite 5 - Sair")
        print("Digite aqui: ")
        var n = readln().toInt()

        println("\n\n")
        when (n) {

            0 -> {
                println("Dados do preguiça")
                println(flecha)
                println("-w-w-w-w-w-w-w-w-w-w")
            }
            1 -> {
                flecha.som()
                println("-*-*-*-*-*-*-*-*-*-*")
            }
            2 -> {
                println("Preguiça dormindo...")
                flecha.dormir()
                println("='_'=='_'=='_'=='_'=")
            }
            3 -> {
                println("Subindo em árvores...")
                flecha.correr()
                println("-*-*-*-*-*-*-*-*-*-*")
            }
            4 -> {
                println("Som do preguiça comendo...")
                flecha.comer()
                println("='_'=='_'=='_'=='_'=")
            }
            5 -> break
        }
    }
}