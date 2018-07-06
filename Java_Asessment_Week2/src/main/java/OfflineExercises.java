public class OfflineExercises {

    // Given a string, return a string where
    // for every char in the original,
    // there are two chars.

    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"
    public String doubleChar(String input) {
        String result = "";
        String[] split = input.split("");
        for (int i=0; i<input.length(); i++){
            result += split[i] + split[i];
        }
        return result;
    }
    //
    // A sandwich is two pieces of bread with something in between. Return the
    // string that is between the first and last appearance of "bread" in the
    // given string, or return the empty string "" if there are not two pieces
    // of bread.

    // getSandwich("breadjambread") → "jam"
    // getSandwich("xxbreadjambreadyy") → "jam"
    // getSandwich("xxbreadyy") → ""
    // getSandwich("xxbreadhoneybreadyy") → "honey"

    public String getSandwich(String input) {
        String result = "";
        int firstbread = input.indexOf("bread");
        int secondbread = input.lastIndexOf("bread");
        if (secondbread == firstbread){
            return "";
        } else {
            result = input.substring(firstbread + 5, secondbread);
        }
        return result;
    }

    // Given three ints, a b c, one of them is small, one is medium and one is
    // large. Return true if the three values are evenly spaced, so the
    // difference between small and medium is the same as the difference between
    // medium and large.

    // evenlySpaced(2, 4, 6) → true
    // evenlySpaced(4, 6, 2) → true
    // evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a, int b, int c) {
        boolean bool = false;
        if (Math.abs(a-b) == Math.abs(c-b) || Math.abs(a-b) == Math.abs(a-c)){
            bool = true;
        }
        return bool;
    }

    // Given a string and an int n, return a string made of the first and last n
    // chars from the string. The string length will be at least n.

    // nTwice("Hello", 2) → "Helo"
    // nTwice("Chocolate", 3) → "Choate"
    // nTwice("Chocolate", 1) → "Ce"

    public String nTwice(String input, int a) {
        String result = "";
        result = input.substring(0, a) + input.substring(input.length()-a);
        return result;
    }

    // Given a string, return true if it ends in "ly".

    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    // endsLy("l") → false

    public boolean endsly(String input) {
        boolean bool = false;
        if (input.length()>2){
            if (input.substring(input.length()-2).equals("ly")){
                bool = true;
            }
        } else bool = false;
        return bool;
    }

    // Given a string, return recursively a "cleaned" string where adjacent
    // chars that are the same have been reduced to a single char. So "yyzzza"
    // yields "yza".

    // stringClean("yyzzza") → "yza"
    // stringClean("abbbcdd") → "abcd"
    // stringClean("Hello") → "Helo"
    public String stringClean(String input) {
        String result = "";
        String[] split = input.split("");
        for (int i =1; i<input.length()-1; i++){
            if (result.equals("")){
                result += input.substring(i-1, i);
                i--;
            }else if (!(input.substring(i,i+1).equals(result.substring(result.length()-1)))){
                result += input.substring(i,i+1);
            }
        }
        return result;
    }

    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are 0
    // and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
    // 21 and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.

    // fibonacci(0) → 0
    // fibonacci(1) → 1
    // fibonacci(2) → 1
    // fibonacci(3) → 2
    // fibonacci(4) → 3
    // fibonacci(5) → 5
    // fibonacci(6) → 8
    // fibonacci(25) → 75025

    public int fibonacci(int input) {
        int n=0;
        while (n!=input){
            n+=n;
            n++;
        }
        return n;
    }

    // We have a number of bunnies and each bunny has two big floppy ears. We
    // want to compute the total number of ears across all the bunnies
    // recursively (without loops or multiplication).

    // bunnyEars(0) → 0
    // bunnyEars(1) → 2
    // bunnyEars(2) → 4
    // bunnyEars(4) → 8
    // bunnyEars(16) → 32

    public int bunnyEars(int input) {
        if (input == 0){
            return 0;
        } else {
            return 2 + bunnyEars(input -1);
        }
    }

    // Given a string, return the length of the largest "block" in the string.
    // A block is a run of adjacent chars that are the same.

    // superBlock("jeffbert") → 2
    // superBlock("abbCCCddBBBxx") → 3
    // superBlock("") → 0

    public int superBlock(String str) {
        int maxBlock = 0;

        String a;
        String b;
        if (!(str.equals(""))) {
            int count = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                a = str.substring(i, i + 1);
                b = str.substring(i + 1, i + 2);
                if (a.equals(b)) {
                    count++;
                } else {
                    if (count > maxBlock) {
                        maxBlock = count;
                        count = 0;
                    }
                }
            }
        }
        return maxBlock;

    }

}
