//Given a string, return true if the string starts with "hi" and false otherwise.
//Code
public boolean startHi(String str) {
  if(str.length() < 2){
    return false;
  }
  if(str.substring(0,2).equals("hi")){
    return true;
  } else{
    return false;
  }
}
//op:
//startHi("hi there") → true
//startHi("hi") → true
//startHi("hello hi") → false
