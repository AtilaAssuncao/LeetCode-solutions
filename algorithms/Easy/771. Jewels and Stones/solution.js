/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(J, S) {
        
    let count = 0;
    const tm = S.length;
    
    for (let i = 0; i < tm ; i++) {
        if(J.includes(S[i])) {
            count++;
        } 
    }
        
    return count;
};