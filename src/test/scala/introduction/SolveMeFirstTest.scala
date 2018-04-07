package introduction

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}
import java.lang.System.setIn
import java.nio.charset.StandardCharsets.UTF_8

import org.scalatest.FlatSpec

import scala.Console.withOut

class SolveMeFirstTest extends FlatSpec {
  "SolveMeFirst" should "sum two regular numbers" in {
    val in = new ByteArrayInputStream("1\n4\n".getBytes(UTF_8))
    val out = new ByteArrayOutputStream

    setIn(in)

    withOut(out) {
      (new SolveMeFirst).run()
    }

    assert(out.toString == "5\n")
  }
}
