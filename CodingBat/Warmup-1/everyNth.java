//Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
//Code
public String everyNth(String str, int n) {
  String res = "";
  for(int i=0;i<str.length();i = i+n){
    res = res + str.charAt(i);
  }
  return res;
}
//op-everyNth("Miracle", 2) → "Mrce"
//everyNth("abcdefg", 2) → "aceg"
//everyNth("abcdefg", 3) → "adg"
