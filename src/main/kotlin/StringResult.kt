sealed class StringResult {

    class Success(val string: String): StringResult()

    class Error(val throwable: Throwable): StringResult()
}