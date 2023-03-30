package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ArithmeticOperationsTest extends AnyFlatSpec {

  "performArithmeticOperation" should "return the correct result for addition" in {
    val inputList = List(Some(1), Some(2), None, Some(3), Some(4))
    val expectedResult = Some(10)

    val result = ArithmeticOperations.performArithmeticOperation(inputList, "Addition")

    assert(result === expectedResult)
  }

  it should "return the correct result for subtraction" in {
    val inputList = List(Some(1), Some(2), None, Some(3), Some(4))
    val expectedResult = Some(-8)

    val result = ArithmeticOperations.performArithmeticOperation(inputList, "Subtraction")

    assert(result === expectedResult)
  }

  it should "return the correct result for multiplication" in {
    val inputList = List(Some(1), Some(2), None, Some(3), Some(4))
    val expectedResult = Some(24)

    val result = ArithmeticOperations.performArithmeticOperation(inputList, "Multiplication")

    assert(result === expectedResult)
  }

  it should "return None when the input list is empty" in {
    val inputList = List[Option[Int]]()
    val expectedResult = None

    val result = ArithmeticOperations.performArithmeticOperation(inputList, "Addition")

    assert(result === expectedResult)
  }

  it should "return None when the operation is not recognized" in {
    val inputList = List(Some(1), Some(2), None, Some(3), Some(4))
    val expectedResult = None

    val result = ArithmeticOperations.performArithmeticOperation(inputList, "Division")

    assert(result === expectedResult)
  }
}
