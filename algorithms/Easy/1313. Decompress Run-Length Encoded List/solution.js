/**
 * @param {number[]} nums
 * @return {number[]}
 */
var decompressRLElist = function(nums) {
    const tm = nums.length;
    let aux = [], i = 0;
    
    for (i; i < tm; i+=2) {
        aux = aux.concat(Array(nums[i]).fill(nums[i+1]));
    }
    
    return aux;
};