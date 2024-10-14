fun main() {
    // Ввод строки от пользователя
    println("Введите строку:")
    val inputString = readLine()!!.toLowerCase() // Преобразуем строку в нижний регистр для удобства

    // Инициализация счетчиков для гласных и согласных
    var vowelCount = 0
    var consonantCount = 0

    // Проход по каждому символу в строке
    for (char in inputString) {
        // Проверка, является ли символ гласной
        if (char in 'a'..'z' && char in "aeiou") {
            vowelCount++
        }
        // Проверка, является ли символ согласной
        else if (char in 'a'..'z' && char !in "aeiou") {
            consonantCount++
        }
    }

    // Вывод результатов
    println("Количество гласных: $vowelCount")
    println("Количество согласных: $consonantCount")
}