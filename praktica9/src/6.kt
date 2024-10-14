fun main() {
    val strings = arrayOf("c", "a", "b", "d")
    println("Исходный массив: ${strings.joinToString(", ")}")
    sortStrings(strings)
    println("Отсортированный массив: ${strings.joinToString(", ")}")
}

fun sortStrings(strings: Array<String>) {
    // Используем встроенную функцию сортировки в Kotlin, которая сортирует по алфавиту.
    strings.sort()
}