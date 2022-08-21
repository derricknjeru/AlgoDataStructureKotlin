package arrays_strings

import java.util.*

fun duplicateZeros(arr: IntArray): Unit {
    val queue: Queue<Int> = LinkedList();
    arr.forEachIndexed { index, item ->
        if (item == 0) {
            queue.add(0)
            queue.add(0)
        } else {
            queue.add(item);
        }

        val first = queue.poll();
        arr[index] = first;
    }

}