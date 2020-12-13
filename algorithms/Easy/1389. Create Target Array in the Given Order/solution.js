/**
 * @param {number[]} nums
 * @param {number[]} index
 * @return {number[]}
 */
var createTargetArray = function(nums, index) {
    let aux = [];
    for (let i = 0; i<nums.length; i++) {
          if (aux[index[i]] === undefined) {
                aux[index[i]] = nums[i];
          } else {
                for (let j = aux.length; j> index[i]; j--) {
                    aux[j] = aux[j-1];
                }
                aux[index[i]] = nums[i];
          }
    }
    return aux;
};