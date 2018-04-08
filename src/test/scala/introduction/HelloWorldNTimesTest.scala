package introduction

import common.InOutTest

class HelloWorldNTimesTest extends InOutTest {
  "HelloWorldNTimes" should "print four hello worlds" in {
    val input = "4\n"
    val output = "Hello World\nHello World\nHello World\nHello World\n"

    assertExercise(new HelloWorldNTimes, input, output)
  }
}
