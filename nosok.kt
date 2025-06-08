fun main() {
    val login: String
    val password: String
    val confirmPassword: String

    print("Введите логин : ")
    readln().also { login = it }

    print("Введите пароль : ")
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
): Boolean {
    if (password != confirmPassword)
        return false
    if (password.length < 8 || password.length > 20)
        return false
    if (login.length < 8 || login.length > 20)
        return false

    if (login.windowed(3).any{ it in password }){
        println("В пароле есть повторяющиеся символы ")
        return false
    }

    return true
}
