//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//Code
public String stringBits(String str) {
  String res = "";
  for(int i=0;i<str.length();i+=2){
      res += str.charAt(i);
    //res += str.substring(i,i+1);
    }
    return res;
}
//op-stringBits("Hello") → "Hlo"
//stringBits("Hi") → "H"
//stringBits("Heeololeo") → "Hello"
