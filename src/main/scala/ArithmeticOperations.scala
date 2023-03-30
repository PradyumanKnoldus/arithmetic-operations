package com.knoldus

object ArithmeticOperations extends App {

  // Function to perform arithmetic operation on a list of numbers
  def performArithmeticOperation[T: Numeric](numbers: List[Option[T]], operation: String): Option[T] = {
    val numeric = implicitly[Numeric[T]]

    // Extract non-None values from the list
    val list: List[T] = for {
      number <- numbers
      if number.isDefined
    } yield number.get


    if (list.isEmpty) {
      None
    } else {
      // Perform the appropriate arithmetic operation based on the input operation
      operation match {
        case "Addition" => Some(list.reduce(numeric.plus))
        case "Subtraction" => Some(list.reduce(numeric.minus))
        case "Multiplication" => Some(list.reduce(numeric.times))
        case _ => None
      }
    }
  }

  private val numbers = List(Some(1), Some(2), None, Some(3), Some(4))

  private val additionResult = ArithmeticOperations.performArithmeticOperation(numbers, "Addition")
  println(s"Addition result: $additionResult") // prints "Addition result: Some(10)"

  private val subtractionResult = ArithmeticOperations.performArithmeticOperation(numbers, "Subtraction")
  println(s"Subtraction result: $subtractionResult") // prints "Subtraction result: Some(-8)"

  private val multiplicationResult = ArithmeticOperations.performArithmeticOperation(numbers, "Multiplication")
  println(s"Multiplication result: $multiplicationResult") // prints "Multiplication result: Some(24)"

  private val emptyList = List[Option[Int]]()

  private val emptyResult = ArithmeticOperations.performArithmeticOperation(emptyList, "Addition")
  println(s"Empty result: $emptyResult") // prints "Empty result: None"
}
