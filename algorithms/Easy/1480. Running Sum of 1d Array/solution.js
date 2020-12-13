/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    const aux = [nums[0]]
    for(let i = 1; i < nums.length; i++){
        aux[i] = aux[i-1] + nums[i]
    }
    return aux;
};