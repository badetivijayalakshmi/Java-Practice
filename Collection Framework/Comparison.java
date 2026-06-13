import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class MyClass {
  public static void main(String args[]) {
    Comparator<String> com = new Comparator<String>(){
        public int compare(String a,String b){
            if(a.length() > b.length())
                return 1;
            else
                return -1;
            
        }
    };
    
    List<String> names = new ArrayList<>();
    names.add("Python");
    names.add("C++");
    names.add("Java");
    names.add("Django");
    Collections.sort(names,com);

    
    System.out.println(names);

  }
}
