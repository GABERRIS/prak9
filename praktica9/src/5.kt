fun main() {
    // Запрашиваем у пользователя число N
    print("Введите число N: ")
    val n = readLine()!!.toInt()

    // Выводим все простые числа до N
    println("Простые числа до $n:")
    for (i in 2..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
    println()
}

// Функция для проверки, является ли число простым
fun isPrime(num: Int): Boolean {
    // 1 не является простым числом
    if (num <= 1) {
        return false
    }
    // Проверяем делимость на числа от 2 до корня из num
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    // Если число не делится ни на одно из этих чисел, оно простое
    return true
}