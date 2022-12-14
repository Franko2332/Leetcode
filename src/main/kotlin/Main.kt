fun main(args: Array<String>) {
    println(smallestEvenMultiple(13))
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

fun defangIPaddr(address: String): String = address.replace(".", "[.]")

fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0
    for (i in 0..operations.size - 1) {
        if (operations[i].equals("++X") || operations[i].equals("X++")) x++
        else if (operations[i].equals("--X") || operations[i].equals("X--")) x--
    }
    return x
}

fun smallestEvenMultiple(n: Int): Int = if (n % 2 == 0) n
else n * 2