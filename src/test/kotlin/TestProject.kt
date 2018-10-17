import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class TestProject {

    val outContent = ByteArrayOutputStream()
    val originalOut = System.out
    val originalIn = System.`in`

    @Before
    fun setupStdout() {
        System.setOut(PrintStream(outContent))
    }

    @After
    fun restoreStdoutAndStdin() {
        System.setOut(originalOut)
        System.setIn(originalIn)
    }

    @Test
    fun whenAdding1and3_thenAnswerIs4() {

        val inContent = ByteArrayInputStream("1\n3\n".toByteArray())
        System.setIn(inContent)

        main(emptyArray())

        Assert.assertEquals("Enter the first number\nEnter the second number\n1 + 3 = 4\n", outContent.toString())
    }

    @Test
    fun whenAdding2and5_thenAnswerIs7() {

        val inContent = ByteArrayInputStream("2\n5\n".toByteArray())
        System.setIn(inContent)

        main(emptyArray())

        Assert.assertEquals("Enter the first number\n" +
                "Enter the second number\n2 + 5 = 7\n", outContent.toString())
    }
}