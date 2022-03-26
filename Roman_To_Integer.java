class Solution {
    public int romanToInt(String s) {
Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result-=map.get(s.charAt(i));
            }
            else {
                result+=map.get(s.charAt(i));
            }
        } 
        return result;
    }
}
// Approach 2
class Solution {
    public int romanToInt(String s) {
       int result = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                switch (c) {
                    case 'I':
                        result += 1 * (result >= 5 ? -1 : 1);
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        result += 10 * (result >= 50 ? -1 : 1);
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        result += 100 * (result >= 500 ? -1 : 1);
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }
            }

            return result;
        }
}
