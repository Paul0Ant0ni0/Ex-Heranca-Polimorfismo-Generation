import classes.Cavalo

fun main(){

    val spirit = Cavalo("Spirit",20,
        "Macho", "Marrom","Kiger Mustang",1.60 )


    //Looping que só irá parar quando o usuário inserir 5
    while (true) {
        println("Seja bem Vindo(a)")
        println("'-.-''-.-''-.-''-.-''-.-''-.-''-.-''-.-'")
        println("Digite 0 - Listar dados do cavalo")
        println("Digite 1 - Escutar o cavalo relincando")
        println("Digite 2 - Escutar o cavalo dormindo")
        println("Digite 3 - Escutar o cavalo correndo")
        println("Digite 4 - Escutar o cavalo comendo")
        println("Digite 5 - Sair")
        print("Digite aqui: ")
        var n = readln().toInt()

        println("\n\n")
        when (n) {

            0 -> {
                println("Dados do cavalo")
                println(spirit)
                println("-w-w-w-w-w-w-w-w-w-w\n")
            }
            1 -> {
                spirit.som()
                println("-*-*-*-*-*-*-*-*-*-*\n")
            }
            2 -> {
                println("$spirit dormindo...")
                spirit.dormir()
                println("='_'=='_'=='_'=='_'=\n")
            }
            3 -> {
                println("$spirit correndo...")
                spirit.correr()
                println("-*-*-*-*-*-*-*-*-*-*\n")
            }
            4 -> {
                println("Som do $spirit comendo...")
                spirit.comer()
                println("='_'=='_'=='_'=='_'=\n")
            }
            5 -> break
        }
    }

}
