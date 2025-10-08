import java.util.*;

public class stringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str1:");
        String str1 = sc.nextLine().trim();
        System.out.println("Enter str2");
        String str2 = sc.nextLine().trim();

        String res = str1.replace("*", ".").replace("?",".");

        if(str2.matches(res)){
            System.out.println("The string are matching");
        } else{
            System.out.println("The string not matching");
        }
        
        sc.close();
    }
}
