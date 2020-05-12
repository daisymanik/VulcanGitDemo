package testProject1.Package;

public class compile{
    public static void main(String[] args){
    String s = "REVERSE";
    String reverse = "";
    int strLength = s.length();
    System.out.println(strLength);
    for(int i=strLength-1;i>=0;i++){
        reverse = reverse + s.charAt(i);
    }
    System.out.println(reverse);
    }
}
