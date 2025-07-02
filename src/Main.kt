fun twosum(nums: IntArray, target: Int ): IntArray{

    for (i in nums.indices){
        for (j in i until nums.size){
            if (nums[i] + nums[j] == target){
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf()
}

fun main(){

    var nums = intArrayOf(2, 7, 11)
    var target = 9
    var result = twosum(nums, target)
    println(result.joinToString())


}