import java.util.Arrays;

public class AnagramChecker {
    public static String areAnagram(String str1, String str2) {
        String originalString1 = str1;
        String originalString2 = str2;

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        //if str1 is not equal to str2 then not anagram
         if(str1.length() != str2.length())
         {
            return originalString1 + "and" + originalString2 + " are not anagrams.";      
        }
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
         
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2))
        {
            return originalString1 + " and " + originalString2 + " are anagrams.";
        } else {
            return originalString1 + " and " + originalString2 + " are NOT anagrams.";
        }
    }

    public static void main(String[] args) {
        // Test cases
        String result1 = areAnagram("listen", "silent");
        System.out.println(result1);

        String result2 = areAnagram("hello", "world");
        System.out.println(result2);

        
    }
}
