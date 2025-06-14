fun main() {
    val login: String
    val password: String
    val confirmPassword: String

    print("Введите логин (от 8 до 20 символов) : ")
    readln().also { login = it }

    print("Введите пароль (от 8 до 20 символов): ")
    readln().also { password = it }

    print("Повторите пароль : ")
    readln().also { confirmPassword = it }

    if (isCorrectInput(login, password, confirmPassword))
        println("Введенные данные соответствуют требованиям!!!")
    else
        println("Введенные данные не соответствуют требованиям ")
}

fun isCorrectInput (
     login: String,
     password: String,
     confirmPassword: String
): Boolean
{
    if (password != confirmPassword) {
        println("Пароли отличаются")
        return false
    }
    if (password.length < 8 || password.length > 20) {
        println("Не подходящая длина пароля")
        return false
    }
    if (login.length < 8 || login.length > 20) {
        println("Неподходящая длина логина")
        return false
    }

    if (login.windowed(3).any{ it in password }){
        println("В пароле есть повторяющиеся символы ")
        return false
    }
    return true
}
