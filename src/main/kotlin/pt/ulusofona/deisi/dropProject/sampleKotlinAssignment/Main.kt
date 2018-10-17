package pt.ulusofona.deisi.dropProject.sampleKotlinAssignment

fun main(args: Array<String>) {
    println("Enter the first number")
    val num1 = readLine()!!.toInt()

    println("Enter the second number")
    val num2 = readLine()!!.toInt()

    val soma = num1 + num2

    println("${num1} + ${num2} = ${soma}")
}