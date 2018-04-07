package introduction

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}
import java.lang.System.setIn
import java.nio.charset.StandardCharsets.UTF_8

import common.InOutTest
import org.scalatest.FlatSpec

import scala.Console.withOut

class SolveMeFirstTest extends InOutTest {
  "SolveMeFirst" should "sum two regular numbers" in {
    assertExercise(new SolveMeFirst, "1\n4\n", "5\n")
  }
}
