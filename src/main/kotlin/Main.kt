import java.lang.IllegalStateException
import kotlin.random.Random

fun main() {
    when (val result = getString()) {
        is StringResult.Error -> println("There was an error")
        is StringResult.Success -> println(result.string)
    }
}

fun getRandomString(): String {
    val rand = Random.nextInt(10)
    return if (rand > 5) {
        throw IllegalStateException()
    } else {
        rand.toString()
    }
}

fun getString(): StringResult {
    return try {
        StringResult.Success(getRandomString())
    } catch (error: IllegalStateException) {
        StringResult.Error(error)
    }
}