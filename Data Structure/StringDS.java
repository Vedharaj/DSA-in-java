public class StringDS
{
    public static void main(String[] args) {
        String name = "vedha";
        
        //1. length
        System.out.println(name.length());
        
        //2. Character access
        System.out.println("char at 0 is "+name.charAt(0));
        
        //3. concatenate
        String conca = "Hello, "+name;
        System.out.println("Concatenated String is "+conca);
        
        //4. compare string
        System.out.println("Compare string with case sensitive "+name.equals("vedha"));
        System.out.println("Compare string without case sensitive "+name.equalsIgnoreCase("Vedha"));
        
        /*5. In Java, you compare strings lexicographically 
        (alphabetical/dictionary order based on Unicode values) primarily 
        using the compareTo() and compareToIgnoreCase() methods of the String class.*/
        
        System.out.println("strings lexicographically of Apple "+name.compareTo("Apple"));
        
        //6. To uppercase
        System.out.println("uppercase "+name.toUpperCase());
        
        //7. To lowercase
        System.out.println("lowercase "+name.toLowerCase());
        
        //8.Trim
        String text = "\u0000Hello, vedha!   ";
        System.out.println("Before trim "+text+"\nAfter trimmed "+text.trim());
        
        //9. Strip
        System.out.println("Before strip "+text+"\nAfter Stripped "+text.strip());
        
        //10. finding a sub-string
        System.out.println("Index of 'ha' in name is "+name.indexOf("ha"));
        
        //11. substring
        System.out.println("Substring from 0 to 3 in name is "+name.substring(0,3));
        
        //12. contains
        System.out.println("Contains method "+name.contains("ha"));
        
        //13. Replace
        System.out.println("Change l to i in hello is"+"hello".replace("l", "i"));
        
        //14. Start and end with method
        System.out.println("Check name start 'v' and end with 'e' "+name.startsWith("ve")+" "+name.endsWith("ha"));
        
        //15. split methods
        String text2 = "Hello World";
        System.out.println("Spliting "+text2);
        for (String i: text2.split(" ")){
            System.out.println(i);
        }
        
        //16. isBlank and isEmpty methods
        System.out.println("isBlank and isEmpty methods: ");
        System.out.println("without space checking "+"".isEmpty()+" "+"".isBlank());
        System.out.println("with space checking "+" ".isEmpty()+" "+" ".isBlank());
        
        //17. char to Array
        for(char i: name.toCharArray()){
            System.out.println(i);
        }
        
        //18. StringBuilder and StringBuffer Methods
        String sbd = new StringBuilder(name).reverse().toString();
        System.out.println("Reverse using stringbuilder: "+sbd);
        String sbf = new StringBuffer(name).reverse().toString();
        System.out.println("Reverse using stringbuffer: "+sbf);
    }
}
