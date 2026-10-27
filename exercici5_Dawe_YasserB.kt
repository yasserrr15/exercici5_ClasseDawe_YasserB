import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val array = IntArray(10)
    for (i in 0 until 10) {
        array[i] = scanner.nextInt()
    }
    for (i in 0 until 10) {
        var abans = 0
        for (j in 0 until i) {
            if (array[j] == array[i]) {
                abans++
            }
        }
        if (abans == 1) {
            println(array[i])
        }
    }
}