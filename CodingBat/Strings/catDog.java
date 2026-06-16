//Return true if the string "cat" and "dog" appear the same number of times in the given string.
//code
public boolean catDog(String str) {
  int countcat = 0;
  int countdog = 0;
  for(int i=0;i<=str.length()-3;i++){
      if(str.substring(i,i+3).equals("cat")){
          countcat++;
      } else if(str.substring(i,i+3).equals("dog")){
          countdog++;
      }
  }
  if(countcat == countdog) return true;
  return false;
}
//op-catDog("catdog") → true
//catDog("catcat") → false
//catDog("1cat1cadodog") → true
