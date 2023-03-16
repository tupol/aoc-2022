package day04

import scala.io.*
import scala.util.{Failure, Try}

@main
def part2(): Unit = {

  def result(input: Iterator[(Interval, Interval)]): Int =
    input
      .map { case (l, r) => l.isPartiallyContainedIn(r) || r.isPartiallyContainedIn(l) }
      .filter(_ && true)
      .size

  val testInput = input("day04/input_test.txt")
  println(result(testInput) == 4)

  val mainInput = input("day04/input.txt")
  println(result(mainInput))
}