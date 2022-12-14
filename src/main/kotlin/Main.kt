fun main(args: Array<String>) {
    concatenation(intArrayOf(10, 1, 2, 3, 5, 6, 7)).forEach {
        print(it)
    }
    buildArray(intArrayOf(0, 2, 1, 5, 3, 4)).forEach { print(" " + it) }
}

fun concatenation(nums: IntArray): IntArray {
    val ans = IntArray(nums.size * 2).apply {
        for (i in 0..nums.size - 1) {
            this[i] = nums[i]
            this[nums.size + i] = nums[i]
        }
    }
    return ans
}

fun buildArray(nums: IntArray): IntArray {
    val ans = IntArray(nums.size).apply {
        for (i in nums.indices) {
            if (nums[i] < nums.size) this[i] = nums[nums[i]]
            else println("Error: nums[i]>=nums.size")
        }
    }
    return ans
}

fun sum(num1: Int, num2: Int): Int = num1 + num2

fun runningSum(nums: IntArray): IntArray {
    val runSum = IntArray(nums.size).apply {
        for (i in nums.indices) {
            if (i == 0) this[i] = nums[i]
            else this[i] = this[i - 1] + nums[i]
        }
    }
    return runSum
}
