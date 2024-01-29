

///  In this we see some basics concepts about string , string manipulations & methods related to string class 


/* ---------------------------------------------------
 */ 


package string;




// How to declare a string in Java?




// /**
//  * Ex1
//  */
// public class Ex1 {

//     public static void main(String[] args) {
//         System.out.println("String declaration in java ");
//         //1. to declare string in java you just need to pass the string literals in double quote 
        
//         String str1="Le Ban gya naya string ";
//         System.out.println(str1);
//         String str2="le ban gya dusra string, ab aage bolo ";
//         System.out.println(str2);
        
//         //2. you just define character array & store in array reference variable and then pass this into string created dynamically.

//         char c[]=new char[]{'s','h','i','v','a','a','y','y'};// declare & initialization of character array.
//         String ss1=new String(c);
//         System.out.println("ye String char array ko milla ke bna h "+ss1);

//         //3. now with the help of new keyword you can make the string 

//         String ss2=new String("New keyword ki help se ban gya String ");
//         System.out.println(ss2);
//     }
    
// }








// What is the difference between str1 == str2 and str1.equals(str2)?

/*solutions: here we see the difference of above two 
        1. str1 == str2
        --> this basically store the reference or check the reference where string is poiting in the memory.
        2. equals
        --> it is the method that basically inherit from object class have implementations in string, it checks the contains of the two string instead of there pointing location.
*/



// /**
//  * Ex1
//  */
// public class Ex1 {

//     public static void main(String[] args) {
//         System.out.println("Difference between (str1==str2) and equals methods, as both do compare over the string. ");

//         String str1="PATNA";
//         String str2="PATNA";
//         String str3="Gaya";
//         String str4="Vaishali";
//         String str5=new String("Gaya");
//         String str6=new String("PATNA");

//         System.out.println(str1==str2);  // true
//         System.out.println(str1==str6);  // false
//         System.out.println(str3==str5);  // false 
//         System.out.println(str1.equals(str6));  // true
//         System.out.println(str3.equals(str5));  // true

//     }
// }





// How do you check whether a String is empty in Java?


// /**
//  * Ex1
//  */
// public class Ex1 {

//     public static void main(String[] args) {
//         System.out.println("check for empty string ");
//         String s1="";
//         int length=s1.length();
//         System.out.println("Length of the string is "+length); // find the length of the string if it contains some characters of not .

//         String s2="";
//         System.out.println(s2.isEmpty());  // returns true if the string is empty 


//     }
// }




/// Different methods in String Manipulations:



/**
 * Ex1
 */
public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Different String methods ");

        // Based on Comparison

        // 1. equals methods
        String s1="Bihar";
        String s2=new String("Bihar");
        System.out.println(s1.equals(s2));

        //2. equalIgnorecase()
        String s3="Bharat";
        String s4=new String("BHaRat");
        System.out.println(s3.equalsIgnoreCase(s4));// ignore the case if the string are equal.

        // 3. compare to() -> this funt. work same as in strcmp() funct. in C.
            // return integer value based on place if 0(strings are equals), negative (according to dictionary order), positive means(opposite of dictionary order).

        String s5=new String("BCET");
        String s6=new String("BCET");

        // various index methods.
        // 1. indexof(ch)
        System.out.println("it returns the index of the character "+s3.indexOf('i'));
        System.out.println("it takes the index where the search would have to begun"+s3.indexOf('a', 2));
        System.out.println("it check the substring index"+s1.indexOf("ha"));
        System.out.println("start from index to find the subindex of string"+s4.indexOf("Ra", 2));

        // 2. LastIndexof()
        System.out.println("it searches start from last index "+s5.lastIndexOf('E'));
        System.out.println("from the index it take "+s6.lastIndexOf('B', 3));
        System.out.println("search of the String "+s3.lastIndexOf("ar"));
        System.out.println("search from the specified index "+s3.lastIndexOf("ha", 5));

        // Substring methods
        // 1. with first index 

        String ss1=new String("String Banaoo");
        System.out.println(ss1.substring(5));
        // 2. with both index
        System.out.println(ss1.substring(4, 8));

        // trim of the string 
        // --> front & back se string ke gap ko hata deta h ye method.
        String str1=new String("          String     ki trimming   krni      h        ");
        System.out.println(str1.trim());

        // String Conversion

        // 1. to lowercase
        String str2=new String("case badAlna h StRinG ka ");

        String slow=str2.toLowerCase();
        System.out.println(slow);
        String supr=str2.toUpperCase();
        System.out.println(supr);

        // String to char array;
        String s10=new String("Convert this into char Array");
        char c[]=s10.toCharArray();
        for (char d : c) {
            System.out.print(d+"    ");
            
        }




    }
}

































//////////////////////////////////////////////////////////////////////////////