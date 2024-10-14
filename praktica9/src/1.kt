import kotlin.random.Random

fun main() {
    // Генерация 10 случайных чисел от 1 до 100
    for (i in 1..10) {
        val random = Random.nextInt(1, 101)
        println(random)
    }
}