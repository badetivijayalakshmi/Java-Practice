//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
//code
public boolean xyzThere(String str) {
  for(int i=0;i<=str.length()-3;i++){
    if(str.substring(i,i+3).equals("xyz")){
      if(i == 0 || str.charAt(i-1) != '.') return true;
    }
  }
  return false;
}
//op-xyzThere("abcxyz") → true
//xyzThere("abc.xyz") → false
//xyzThere("xyz.abc") → true
