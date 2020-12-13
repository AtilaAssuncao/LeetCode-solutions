/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    
    const maior = Math.max(...candies);
    let aux = [];
    candies.forEach((el, i)=> aux[i] = (el+extraCandies) >= maior);
    
    return aux;
};