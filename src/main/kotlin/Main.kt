

fun main(args: Array<String>) {
    concatenation(intArrayOf(10,1,2,3,5,6,7)).forEach { print(it)
    }
}

fun concatenation(nums: IntArray): IntArray{
    val ans = IntArray(nums.size*2).apply {
        for (i in 0..nums.size-1){
            this[i] = nums[i]
            this[nums.size+i]=nums[i]
        }
    }
    return ans
}