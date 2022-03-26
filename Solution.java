import java.util.*;
import java.io.*;
//Google kickStart Moist Problem 2013 practice.
public class Solution{
    public static void main(String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int test = in.nextInt();
        List<String> arrayList = new ArrayList<String>();
    
            for(int cases = 1;cases<=test;cases++){
    
            int stringSize =in.nextInt();
            in.nextLine();
            while(stringSize>0){
                String str =  in.nextLine();
                arrayList.add(str);
                stringSize--;
            }
            int result = 0;
            for(int i=0;i<arrayList.size()-1;i++){
                if(arrayList.get(i).compareTo(arrayList.get(i+1)) > 0){
                    result++;
                }
            }
            System.out.println("Case #" + cases + ": " + result + "\n");
            arrayList.clear();
        }
        in.close();
    }
}
