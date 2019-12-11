package main.kotlin.microsEmpresarios

fun main(args: Array<String>) {
    println("Hello world!")

    //El constructor del Micro es (cantParados, cantSentados, volumen)
    val elrapido = MicroKotlin(cantidadSentados = 20, cantidadParados =  20, volumen = 200)
    val chevallier = MicroKotlin(cantidadSentados = 20, cantidadParados = 30, volumen = 100)

    val jonasa = ClaustrofobicoKotlin()

    elrapido.puedeSubir(jonasa)
    chevallier.puedeSubir(jonasa)

    //jonasa no se puede subir al chevallier...
    try {
        chevallier.subirSiPodesA(jonasa)
    } catch (e : Exception) {
        println("No se pudo subir al pasajero, vamos a probar otro micro!")
        //pero por ejemplo, podríamos tratar de que se suba al otro micro!
        elrapido.subirSiPodesA(jonasa)
    }

    //Si no hay gente en el micro, no puedo bajar a alguien!
    //Si descomentan la siguiente linea, tira error y el programa termina acá (no ejecuta las últimas dos líneas)
    //chevallier.bajaA(jonasa);

    println(elrapido.quienSubioPrimero())
    println(chevallier.quienSubioPrimero())
}