/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
var restoreString = function(s, indices) {
    
    let aux = [];
    const tm = indices.length;
    
    for(let i = 0; i< tm; i++) {
        aux[indices[i]] = s[i];
    }
    
    return aux.join('');
};