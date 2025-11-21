public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String Nstring = "";
        for(int i = 0; i < str.length(); i ++)
        {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
                Nstring += (char) (str.charAt(i) + 32);
            else
                Nstring += str.charAt(i);
        }
        return Nstring;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        String NewStr1 = str1;
        String NewStr2 = str2;
        int counter = 0;
        if(NewStr2.length() > NewStr1.length() || NewStr1.length() == 0) return false;
        if(NewStr2.length() == 0) return true;
        for (int i = 0; i < NewStr1.length(); i ++)
        {
            if (str1.charAt(i) == NewStr2.charAt(0))
            {
                for (int j = i; j < NewStr1.length(); j ++)
                {
                    if(NewStr1.charAt(j) != NewStr2.charAt(counter))
                        break;
                    if (counter == NewStr2.length()-1) 
                        return true;
                    counter ++;
                }
                counter = 0;
            }
        }
        return false;
    }
}
