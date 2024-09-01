public class RemoveDuplicates {
    public static void r_Duplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base Case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Working
        char currChar = str.charAt(idx);  // Character present at index will be stored in currChar
        if(map[currChar-'a'] == true) {     // Checking if current character is present in the map or not
            // Duplicate
            r_Duplicates(str, idx+1, newStr, map); // If not present in the map then go to next index or if present in the map then do not add that character in the map, as it is already present
        } else {  // if the above value is false then the else condition will get executed
            map[currChar - 'a'] = true;   // True bcoz earlier it is not present in the map, thats its a unique and now it will get added to the map
            r_Duplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        r_Duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

// idx + 1 -> Go to the next character in the string
// .append mns add the chgaracter to the StringBuilder
