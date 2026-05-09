class Solution {

public String encode(List<String> strs) {
        // if list is empty return an empty string
        if (strs.isEmpty()) return "";
        // need to count each str in strs
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str.length()).append(',');
        }
        sb.append('#');
        for (String str : strs){
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return new ArrayList<>();
        ArrayList<Integer> sizes = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        int i = 0;
        while (str.charAt(i)!='#'){
            StringBuilder curr = new StringBuilder();
            while (str.charAt(i) != ','){
                curr.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(curr.toString()));
            i++;
        }
        i++;
        for (int size : sizes){
            res.add(str.substring(i, i+size));
            i+=size;
        }
        return res;
    }    
}
