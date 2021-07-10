class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        String base[] = { "type", "color", "name" };
	    int indexType = 0;
	    
	    for (int k = 0; k < base.length; k++) {
	        if (base[k].equals(ruleKey)) {
	            indexType = k;
	        }
	    }
	    
	    int aux = 0;
	    for(int i = 0; i < items.size(); i++) {
	        if (items.get(i).get(indexType).equals(ruleValue)) {
	            aux += 1;
	        }
	    }
	    
        return aux;
    }
}