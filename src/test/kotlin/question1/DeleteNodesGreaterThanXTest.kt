package question1

import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import question1.linkedlist.ListNode

internal class DeleteNodesGreaterThanXTest {

    private val solution = DeleteNodesGreaterThanX()

    @Test
    fun `removeGreaterThanX - input is null`() {
        solution.removeGreaterThanX(null, 100).shouldBeNull()
    }

    @Test
    fun `removeGreaterThanX - single node not removed`() {
        solution.removeGreaterThanX(ListNode(99), 100).shouldBe(ListNode(99))
        solution.removeGreaterThanX(linkedListOf(100), 100).shouldBe(linkedListOf(100))
    }

    @Test
    fun `removeGreaterThanX - single node removed`() {
        solution.removeGreaterThanX(ListNode(102), 100).shouldBeNull()
    }

    @Test
    fun `removeGreaterThanX - two element`() {
        solution.removeGreaterThanX(linkedListOf(100, 95), 94).shouldBeNull()
        solution.removeGreaterThanX(linkedListOf(100, 95), 95).shouldBe(ListNode(95))
        solution.removeGreaterThanX(linkedListOf(100, 95), 96).shouldBe(ListNode(95))
        solution.removeGreaterThanX(linkedListOf(100, 95), 99).shouldBe(ListNode(95))
        solution.removeGreaterThanX(linkedListOf(100, 95), 100).shouldBe(linkedListOf(100, 95))
        solution.removeGreaterThanX(linkedListOf(100, 95), 101).shouldBe(linkedListOf(100, 95))

        val list2 = linkedListOf(95, 105)
        solution.removeGreaterThanX(list2, -1).shouldBeNull()
        solution.removeGreaterThanX(list2, 95).shouldBe(list2)
        solution.removeGreaterThanX(list2, 98).shouldBe(ListNode(95))
        solution.removeGreaterThanX(list2, 105).shouldBe(ListNode(95))
        solution.removeGreaterThanX(list2, 106).shouldBe(list2)
    }

    @Test
    fun `removeGreaterThanX - misc`() {
        solution.removeGreaterThanX(linkedListOf(100, 95, 120), 0).shouldBeNull()
        solution.removeGreaterThanX(linkedListOf(100, 95, 120), 120).shouldBe(linkedListOf(100, 95, 120))
        solution.removeGreaterThanX(linkedListOf(100, 95, 120), 119).shouldBe(linkedListOf(100, 95))

        val list2 = linkedListOf(120, 95, 77)
        solution.removeGreaterThanX(list2, 100).shouldBe(linkedListOf(95, 77))

        solution.removeGreaterThanX(linkedListOf(1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 8, 4, 1, 7, 99, 129), 8)
            .shouldBe(linkedListOf(1, 3, 5, 2, 8, 4, 1, 7))

        val longList = arrayOf(
            1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 8, 4, 1, 7, 99, 129,
            1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 8, 4, 1, 7, 99, 129,
            1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 8, 4, 1, 7, 99, 129,
            1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 8, 4, 1, 7, 99, 129,
            1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 8, 4, 1, 7, 99, 129,
            1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 8, 4, 1, 7, 99, 129,
            1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 4, 4, 4, 98, 199, 199, 199, 242,
            1, 3, 5, 2, 9, 123, 17, 41, 44, 92, 1345, 233, 8, 4, 1, 7, 99, 129
        ).toIntArray()

        val l1 = linkedListOf(*longList)
        val l2 = linkedListOf(*longList)
        val l3 = linkedListOf(*longList)

        solution.removeGreaterThanX(l1, 8)
            .shouldBe(
                linkedListOf(
                    1,
                    3,
                    5,
                    2,
                    8,
                    4,
                    1,
                    7,
                    1,
                    3,
                    5,
                    2,
                    8,
                    4,
                    1,
                    7,
                    1,
                    3,
                    5,
                    2,
                    8,
                    4,
                    1,
                    7,
                    1,
                    3,
                    5,
                    2,
                    8,
                    4,
                    1,
                    7,
                    1,
                    3,
                    5,
                    2,
                    8,
                    4,
                    1,
                    7,
                    1,
                    3,
                    5,
                    2,
                    8,
                    4,
                    1,
                    7,
                    1,
                    3,
                    5,
                    2,
                    4,
                    4,
                    4,
                    1,
                    3,
                    5,
                    2,
                    8,
                    4,
                    1,
                    7
                )
            )

        solution.removeGreaterThanX(l2, 0).shouldBeNull()

        solution.removeGreaterThanX(l3, 1000)?.toList()
            .shouldBe(
                listOf(
                    1,
                    3,
                    5,
                    2,
                    9,
                    123,
                    17,
                    41,
                    44,
                    92,
                    233,
                    8,
                    4,
                    1,
                    7,
                    99,
                    129,
                    1,
                    3,
                    5,
                    2,
                    9,
                    123,
                    17,
                    41,
                    44,
                    92,
                    233,
                    8,
                    4,
                    1,
                    7,
                    99,
                    129,
                    1,
                    3,
                    5,
                    2,
                    9,
                    123,
                    17,
                    41,
                    44,
                    92,
                    233,
                    8,
                    4,
                    1,
                    7,
                    99,
                    129,
                    1,
                    3,
                    5,
                    2,
                    9,
                    123,
                    17,
                    41,
                    44,
                    92,
                    233,
                    8,
                    4,
                    1,
                    7,
                    99,
                    129,
                    1,
                    3,
                    5,
                    2,
                    9,
                    123,
                    17,
                    41,
                    44,
                    92,
                    233,
                    8,
                    4,
                    1,
                    7,
                    99,
                    129,
                    1,
                    3,
                    5,
                    2,
                    9,
                    123,
                    17,
                    41,
                    44,
                    92,
                    233,
                    8,
                    4,
                    1,
                    7,
                    99,
                    129,
                    1,
                    3,
                    5,
                    2,
                    9,
                    123,
                    17,
                    41,
                    44,
                    92,
                    233,
                    4,
                    4,
                    4,
                    98,
                    199,
                    199,
                    199,
                    242,
                    1,
                    3,
                    5,
                    2,
                    9,
                    123,
                    17,
                    41,
                    44,
                    92,
                    233,
                    8,
                    4,
                    1,
                    7,
                    99,
                    129
                )
            )
    }
}

/**
 * @return a [List] of the values of each node in the linked list.
 */
fun ListNode.toList(): List<Int> {
    val list = mutableListOf(this.data)
    var nextNode: ListNode? = this.next
    while (nextNode != null) {
        list.add(nextNode.data)
        nextNode = nextNode.next
    }

    return list.toList()
}

/**
 * The list contents as a [String]: (1)->(2)->(3)
 *
 * @return a [String] representation of the List.
 */
fun ListNode?.contentToString(): String {
    this ?: return "(null)"

    return buildString {
        var node: ListNode? = this@contentToString
        while (node != null) {
            append(node)
            node = node.next
        }
        toString()
    }.replace(")(", ")->(")
}


/**
 * Create a linked list from the given elements.
 * @param elements The elements to add to the list.
 * @return The head of a linked list of the [elements].
 * @throws IllegalArgumentException if [elements] is empty.
 */
fun linkedListOf(vararg elements: Int): ListNode {
    require(elements.isNotEmpty()) { "Cannot create ListNode without elements." }

    val sentinel = ListNode(Int.MAX_VALUE)
    var node = sentinel
    for (element in elements) {
        val newNode = ListNode(element)
        node.next = newNode
        node = newNode
    }

    return sentinel.next!!
}

