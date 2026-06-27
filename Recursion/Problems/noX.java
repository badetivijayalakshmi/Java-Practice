//Given a string, compute recursively a new string where all the 'x' chars have been removed.
//code
public String noX(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x'){
    return noX(str.substring(1));
  }
  return str.charAt(0)+noX(str.substring(1));
}
//op-noX("xaxb") → "ab"
//noX("abc") → "abc"
//noX("xx") → ""
