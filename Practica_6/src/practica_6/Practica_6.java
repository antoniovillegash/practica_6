package practica_6;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Practica_6{
    public static void main (String ...argd) throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader("input.txt"));
        StringBuilder sb = new StringBuilder();
        Boolean x;
        
        while(in.hasNext()) {
            sb.append(in.next());
        }
        in.close();
        String s = sb.toString();
        
        Stack<Character> st=new Stack<Character>();  
        for (int i=0;i<s.length();++i){
            if((s.charAt(i)=='(')||(s.charAt(i)=='{')||(s.charAt(i)=='[')){
                st.push(s.charAt(i));
            }
            else if(st.isEmpty()==false){   
            switch(s.charAt(i)){
            case']':
                if(st.pop()!='['){
                    x = false;
                    System.exit(0);
                }
                break;
            case'}':
                if(st.pop()!='{'){
                    x = false;
                    System.exit(0);
                }
                break;
            case')':
                if(st.pop()!='('){
                    x = false;
                    System.exit(0);
                }break;
            }
            }
        }           
        if(st.isEmpty()){
            x = true;
        }else 
            x = false;
        System.out.println(s + " => " + x);
        }   
}
