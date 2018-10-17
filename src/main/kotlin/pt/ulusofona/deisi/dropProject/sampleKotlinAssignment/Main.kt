package pt.ulusofona.deisi.dropProject.sampleKotlinAssignment

fun main(args: Array<String>) {
    println("Introduza o primeiro número")
    val num1 = readLine()!!.toInt()

    println("Introduza o segundo número")
    val num2 = readLine()!!.toInt()

    val soma = num1 + num2

    println("${num1} + ${num2} = ${soma}")
}