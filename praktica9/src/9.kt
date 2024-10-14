import kotlin.random.Random

fun main() {
    // Запрашиваем у пользователя желаемую длину пароля
    println("Введите желаемую длину пароля:")
    val passwordLength = readLine()!!.toInt()

    // Генерируем пароль
    val password = generatePassword(passwordLength)

    // Выводим сгенерированный пароль
    println("Сгенерированный пароль: $password")
}

// Функция для генерации случайного пароля заданной длины
fun generatePassword(length: Int): String {
    // Определяем набор возможных символов для пароля
    val characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&()_+=-`~,./<>?;':[]{}|"

    // Создаем пустую строку для хранения пароля
    var password = ""

    // Генерируем случайные символы и добавляем их в строку пароля
    for (i in 0 until length) {
        password += characters[Random.nextInt(characters.length)]
    }

    // Возвращаем сгенерированный пароль
    return password
}