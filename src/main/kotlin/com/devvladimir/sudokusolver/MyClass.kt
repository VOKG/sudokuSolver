package com.devvladimir.sudokusolver
fun main(){

    println(square(triple(2)))
square(2)
    triple(4)

    println(mutliplyBy2(2))
    val squareOfTriple = compose(::square, ::triple)
    println(squareOfTriple(1))
    println(add1(1)(2))
    val square: IntUnaryOp = { it * it }
    val triple: IntUnaryOp = { it * 3 }
    val squareOfTriple3 = compose2(square)(triple)
    println(squareOfTriple3(3))
}
class MyClass {
    fun double(n: Int): Int = n * 2
}

val foo = MyClass()
val mutliplyBy2: (Int) -> Int = foo::double

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3


fun<T,U,V> compose(f:(U)->V, g:(T)-> U):(T)->V ={f(g(it))}


typealias IntUnaryOp = (Int) -> Int
val compose2: (IntUnaryOp) -> (IntUnaryOp) -> IntUnaryOp =
    { x -> { y -> { z -> x(y(z)) } } }


fun compose1(f:(Int)->Int, g:(Int)-> Int):(Int)->Int ={f(g(it))}

val add: (Int) -> (Int) -> Int = { a -> { b -> a + b} }

typealias IntBinOp = (Int) -> (Int) -> Int

val add1: IntBinOp = { a -> { b -> a + b} }

val mult: IntBinOp = { a -> { b -> a * b} }
