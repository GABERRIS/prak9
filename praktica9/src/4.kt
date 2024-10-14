

fun isAnagram(str1: String, str2: String): Boolean {
    // Проверяем, равны ли длины строк.
    if (str1.length != str2.length) {
        return false
    }

    // Создаем карту символов для первой строки.
    val charMap = mutableMapOf<Char, Int>()
    for (char in str1) {
        charMap[char] = charMap.getOrDefault(char, 0) + 1
    }

    // Проверяем, присутствуют ли все символы второй строки в карте символов и в нужном количестве.
    for (char in str2) {
        if (!charMap.containsKey(char) || charMap[char] == 0) {
            return false
        }
        charMap[char] = charMap[char]!! - 1
    }

    // Если все символы второй строки найдены в карте, строки являются анаграммами.
    return true
}

fun main() {
    // Примеры использования:
    println(isAnagram("listen", "silent")) // true
    println(isAnagram("hello", "world")) // false
    println(isAnagram("racecar", "carrace")) // true
}