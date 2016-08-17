package dotty.tools
package dotc
package repl
import java.io.{Writer, PrintWriter}

class NewLinePrintWriter(val _out: Writer, autoFlush: Boolean)
extends PrintWriter(_out, autoFlush) {
  def this(out: Writer) = this(out, false)
  override def println(): Unit = { print("\n"); flush() }
}

