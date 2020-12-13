/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps  = function(num) {
    if (num <= 0) return 0;
    
    let count = 0;
    do {
        (num%2 === 0)? num/= 2 : num--;
        count++;
    } while (num > 0);
    
    return count;
};