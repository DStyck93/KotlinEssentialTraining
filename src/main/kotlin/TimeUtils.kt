private const val hourInMillis = 60 * 60 * 1_000

//internal fun millisForHours(hours: Int) = hours * hourInMillis

fun Int.millisForHours() = this * hourInMillis