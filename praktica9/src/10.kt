fun longestWord(text: String): String {
    // Удаляем знаки препинания из строки
    val words = text.replace("[.,!?;:]".toRegex(), "").split(" ")

    // Инициализируем переменную для хранения самого длинного слова и его длины
    var longestWord = ""
    var longestWordLength = 0

    // Проходим по всем словам в строке
    for (word in words) {
        // Если длина текущего слова больше текущей максимальной длины
        if (word.length > longestWordLength) {
            // Обновляем значения самого длинного слова и его длины
            longestWord = word
            longestWordLength = word.length
        }
    }

    // Возвращаем самое длинное слово
    return longestWord
}

fun main() {
    val text = "Это строка с несколькими словами, и мы ищем самое длинное."
    val longestWord = longestWord(text)
    println("Самое длинное слово: $longestWord")
}