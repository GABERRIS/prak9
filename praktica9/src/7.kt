fun main() {
    // Запрашиваем у пользователя ввод строки
    println("Введите строку:")
    val inputString = readLine() ?: ""

    // Создаем новую строку, которая будет хранить измененную строку
    var modifiedString = ""

    // Проходим по каждому символу входной строки
    for (char in inputString) {
        // Проверяем, является ли символ буквой
        if (char.isLetter()) {
            // Если да, меняем регистр символа
            if (char.isUpperCase()) {
                modifiedString += char.toLowerCase()
            } else {
                modifiedString += char.toUpperCase()
            }
        } else {
            // Если символ не буква, добавляем его в строку без изменений
            modifiedString += char
        }
    }

    // Выводим измененную строку
    println("Измененная строка: $modifiedString")
}