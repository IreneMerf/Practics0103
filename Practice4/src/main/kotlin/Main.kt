fun main() {

    fun printFullName ( ) {
        val firstName : String = "Арина"
        val lastName : String = "Белых"
        val inline = $firstName + " " + $lastName
        print(inline)
        {

    // Задача 2
            printFullName(firstName = Арина , lastName = Белых )
            println(printFullName)
    //3
    fun printFullName(firstName: String, lastName: String) {
        println(firstName + " " + lastName)
        fun calculateFullName(firstName: String, lastName: String): String {
            return firstName + " " + lastName
        }
        //4
        fun calculateFullNameWithLength(firstName: String, lastName: String): Pair<String, Int> {
            val fullName = firstName + " " + lastName
            return Pair(fullName, fullName.length)
        }
    //5
    fun findingPrimeNumber(number: Int): Boolean {
        val i: Int = 2
        for (i in i..number step 1) {
            if (number % i == 0) return false
        }
        return true
    }


    fun fibonacci(number: Int): Int {
        if (number <= 0) {
            return 0
        }
        if (number == 1 || number == 2) {
            return 1
        }
        return fibonacci(number - 1) + fibonacci(number - 2)
    }
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(7))
    println(fibonacci(10))
}
}