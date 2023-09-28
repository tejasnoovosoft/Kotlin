fun majorityElement(nums: IntArray): Int {
    var element = 0
    var count = 0

    for (num in nums) {
        if (count == 0) {
            element = num
            count++
        } else if (element == num) {
            count++
        } else {
            count--
        }
    }
    return element
}

fun main() {
    val nums1 = intArrayOf(3, 2, 3)
    val nums2 = intArrayOf(2, 2, 1, 1, 1, 2, 2)

    println("Majority element in nums1: ${majorityElement(nums1)}")
    println("Majority element in nums2: ${majorityElement(nums2)}")
}
