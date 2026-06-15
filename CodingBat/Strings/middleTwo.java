//Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
//code
public String middleTwo(String str) {
  if(str.length() == 2){
    return str;
  } else{
    int res = ((str.length()-1)/2);
    return (str.substring(res,res+2));
  }
}
//op
//middleTwo("string") → "ri"
//middleTwo("code") → "od"
//middleTwo("Practice") → "ct"
