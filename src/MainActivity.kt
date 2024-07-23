//Ejercicio 1
fun calcularPromedio(numbers: List<Int>): Double {
    val sum = numbers.reduce { acc, num -> acc + num }
    return sum.toDouble() / numbers.size
}


//Ejercicio 2
val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val impares = numeros.filter { it % 2 != 0 }
println(impares)


//Ejercicio 3
fun isPalindrome(text: String): Boolean {
    return text == text.reversed()
}


//Ejercicio 4
val nombres = listOf("Alicia", "Bruno", "Carlos")
val saludos = nombres.map { "¡Hola, $it!" }
println(saludos)


//Ejercicio 5
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val suma = performOperation(5, 3) { x, y -> x + y }
val resta = performOperation(5, 3) { x, y -> x - y }
println("Suma: $suma, Resta: $resta")


//Ejercicio 6 falta terminarlo
data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun mapPersonToStudent(person: Person, studentId: String): Student {
    return Student(person.name, person.age, person.gender, studentId)
}

val personas = listOf(Person("Ana", 20, "Femenino"), Person("Luis", 22, "Masculino"))
val estudiantes = personas.map { mapPersonToStudent(it, "ID${it.name}") }
estudiantes.forEach {println("El Estudiante ${it.name} tiene ${it.age} años.") 
}
