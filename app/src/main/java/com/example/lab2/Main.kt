package com.example.lab2

//Ejercicio 1
fun calcularPromedio(numbers: List<Int>): Double {
    val sum = numbers.reduce { acc, num -> acc + num }
    return sum.toDouble() / numbers.size
}


//Ejercicio 2
val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val impares = numeros.filter { it % 2 != 0 }


//Ejercicio 3
fun isPalindrome(text: String): Boolean {
    return text == text.reversed()
}


//Ejercicio 4
val nombres = listOf("Juan", "Pedro", "Luis", "Ana", "Maria")
val saludos = nombres.map { "¡Hola, $it!" }


//Ejercicio 5
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
val suma = performOperation(5, 3) { x, y -> x + y }
val resta = performOperation(5, 3) { x, y -> x - y }


//Ejercicio 6 falta terminarlo
data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun mapPersonToStudent(person: Person): Student {
    return Student(person.name, person.age, person.gender, "")
}

val person = Person("John", 20, "Male")
val student = mapPersonToStudent(person)


fun main() {
//Ejercicio 1
    println(calcularPromedio(listOf(1, 2, 3, 4, 5)))

//Ejercicio 2
    println(impares)

//Ejercicio 3
    println(isPalindrome("oso"))
    println(isPalindrome("hola"))

//Ejercicio 4
    println(saludos)

//Ejercicio 5
    println("Suma: $suma, Resta: $resta")

//Ejercicio 6
    println("El Estudiante ${student.name} tiene ${student.age} años")
}


