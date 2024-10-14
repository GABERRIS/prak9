import kotlin.random.Random

fun main() {
    // Генерируем случайное число от 1 до 100
    val secretNumber = Random.nextInt(1, 101)

    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуй угадать.")

    // Цикл для получения ввода от пользователя
    var guesses = 0
    while (true) {
        println("Введите ваше число:")
        val guess = readLine()?.toIntOrNull()

        // Проверяем, ввел ли пользователь число
        if (guess == null) {
            println("Некорректный ввод. Пожалуйста, введите целое число.")
            continue
        }

        guesses++

        // Сравниваем число пользователя с загаданным числом
        when {
            guess < secretNumber -> println("Загаданное число больше.")
            guess > secretNumber -> println("Загаданное число меньше.")
            else -> {
                println("Поздравляю! Вы угадали число $secretNumber за $guesses попыток.")
                break // Завершаем цикл, если число угадано
            }
        }
    }
}