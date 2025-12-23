public class Palindromestring1 {
    public static boolean PalindromeChecker (String s){
        int i = 0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;

            } else {
                
                i++;
                j--;
            }
        }
        return true;

    }
    public static void main(String[]args){
        // String str1 = "madam";
        // String str2 = "hello";
        int num1 = 1221;
        int num2 = 1234;
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        
        System.out.println(num1 + " is 1221:"+PalindromeChecker(str1));
        System.out.println(num2 + " is 1234 :"+PalindromeChecker(str2));
    }
    
}