fun <T> Array<T>.nonEmptyList(): List<T> {
    check(isNotEmpty()) {
        "NonEmptyList must have at least one item"
    }
    return toList()
}

fun <T> Set<T>.toNonEmptyList(): List<T> {
    check(isNotEmpty()) {
        "NonEmptyList must have at least one item"
    }
    return toList()
}

//class ListUtils {
//    companion object {
//        fun <T> nonEmptyList(vararg items: T): List<T> {
//            check(items.isNotEmpty()) {
//                "NonEmptyList must have at least one item"
//            }
//            return items.toList()
//        }
//
//        fun <T> setToNonEmptyList(set: Set<T>): List<T> {
//            check(set.isNotEmpty()) {
//                "NonEmptyList must have at least one item"
//            }
//            return set.toList()
//        }
//    }
//}