/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    
    const value = n.toString(), tm = value.length;
    let i = 1, sum = Number(value[0]), mult = Number(value[0]);

    for (i; i< tm; i++) {
        mult *= Number(value[i]);
        sum += Number(value[i]);
    }
    
    return mult-sum;
};