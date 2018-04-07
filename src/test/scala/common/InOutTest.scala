package common

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}
import java.lang.System._
import java.nio.charset.StandardCharsets._

import org.scalatest.FlatSpec

import scala.Console.{setIn => _, _}

class InOutTest extends FlatSpec {
  def assertExercise(exercise: Exercise, input: String, output: String): Unit = {
    val in = new ByteArrayInputStream(input.getBytes(UTF_8))
    val out = new ByteArrayOutputStream

    setIn(in)

    withOut(out) {
      exercise.solve()
    }

    assert(out.toString == output)

  }
}
