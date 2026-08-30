import java.util.*;
public class zolo_lab{
    public void use(){
        System.out.println(hasText(null));
        System.out.println(hasText(""));
        System.out.println(hasText("   "));
        System.out.println(hasText("Java"));
        System.out.println(normalizeCoursecode("  cse101  "));
        System.out.println(normalizeCoursecode(""));
        System.out.println(normalizeCoursecode(null));
        System.out.println(countOccurrences("hello ", ' '));
        System.out.println(countOccurrences(null, 'a'));
    }
    static boolean hasText(String value){
        if(value==null){
            System.out.println("null value");
            return false;
        }
        else if(value.isEmpty()){
            System.out.println("empty value");
            return false;
        }
        else if(value.isBlank()){
            System.out.println("blank value");
            return false;
        }
        else{
            System.out.println("text value");
            return true;
        }
    }
    static String normalizeCoursecode(String code){
        if(hasText(code)){
            return code.trim().toUpperCase();}
        return "enter a valid text";
    }
    static int countOccurrences(String text, char target){
        if(text==null) return 0;
        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==target)
            count++;
        }
        return count;
    }
}
