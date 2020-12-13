/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    let aux = [], next = 0 ;
    for( let i = 0; i < nums.length; i+=2){
          aux[i] = nums[next++];  
          aux[i+1] = nums[n++];
    }
    return aux;
};