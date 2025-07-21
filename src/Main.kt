//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {

    /*==================
     Primer Ejercicio
     ===================*/

    val numeros = listOf(1,2,3,4,5)

    fun calcularPromedio (numeros: List<Int>): Int {
        return numeros.reduce { acc, num -> acc + num }/numeros.size
    }

    println("\n* Promedio de la lista $numeros = ${calcularPromedio(numeros)}")

    /*==================
     Segundo Ejercicio
     ===================*/

    fun obtenerNumerosImpares(numeros: List<Int>): List<Int> {
        return numeros.filter {it % 2 != 0 }
    }

    println("\n* La lista $numeros tiene los numeros impares ${obtenerNumerosImpares(numeros)}")

    /*==================
     Tercer Ejercicio
     ===================*/

    val palindrome = "reconocer"
    fun isPalindrome(palindrome: String): Boolean = palindrome.reversed() == palindrome

    println("\n* ¿Es '$palindrome' un palindromo?  ${isPalindrome(palindrome)}")

    /*==================
     Cuarto Ejercicio
    ===================*/

    val nombres = listOf("Oscar","Kevin", "Jose", "Maria", "Pedro", "Paula")

    fun saludos(personas : List<String>)
    {personas.map { println("* ¡Hola $it!") }}

    println("")
    saludos(nombres)
    println("")

    /*==================
      Cuarto Ejercicio
      =================*/

    val sum = { x: Int, y: Int -> x + y }
    val mul = { x: Int, y: Int -> x * y }
    fun performOperation(op1: Int, op2: Int, operation: (Int, Int) -> Int ): Int  = operation(op1, op2)

    println("* " + performOperation(1,2, sum))
    println("* " + performOperation(1,2, mul))


    /*==================
      Quinto Ejercicio
      =================*/

    val people = listOf(
        Person("Alice", 29, "Female"),
        Person("Bob", 31, "Male"),
        Person("Oscar", 20, "Male")
    )


    fun createStudent (people: List<Person>): List<Student> {
        return people.map {Student(it.name,it.age, it.gender, Random.nextInt(1, 100)) }
    }

    println("\n* "+createStudent(people))










}

