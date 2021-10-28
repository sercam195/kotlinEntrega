import kotlin.random.Random

fun main() {

    val dado1 = Dado()
    val dado2 = Dado(1,3)
    val dado3 = Dado(4,6)

    for (j in 1..100) {
        var sumaTotal=0
        Jugador(j)
        for (i in 1..100) {
           var sumaDados = (dado1.tiradaDado() + dado2.tiradaDado() + dado3.tiradaDado())
            sumaTotal += sumaDados
        }
        println("Jugador " + j + " ha sacado " + sumaTotal + " puntos")
    }
}
class Dado(var valorMin : Int = 1, var valorMax : Int = 6) {

    fun tiradaDado(): Int {
        val num = Random.nextInt(valorMin, valorMax)
        return num
    }
}
class Jugador(numero : Int){
}