import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

private suspend fun loadItemsFromDB(): List<String> {
    delay(5_000)
    return listOf("Kotlin", "Java", "C#")
}

private suspend fun loadItemsFromNetwork(): List<String> {
    delay(5_000)
    return listOf("Rust", "Python", "C")
}

// Use async() to parallelize the execution of the two provided suspend functions
// Use await() to get results of both async() calls
// Convert the results into a unified list and print out to the console
fun main(): Unit = runBlocking {
    val dbItems = async { loadItemsFromDB() }
    val networkItems = async { loadItemsFromNetwork() }

    val results = dbItems.await() + networkItems.await()

    results.forEach { language -> println(language)}
}