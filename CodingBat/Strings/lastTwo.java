//Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
//code
public String lastTwo(String s) {
  if(s.length() < 2) return s;
  int n = s.length()-1;
  char last = s.charAt(n);
  char last2 = s.charAt(n-1);
  String res = "";
  for(int i = 0;i<n-1;i++){
      res = res+s.charAt(i);
      
  }
  return (res+last+last2);
}
//op-
//lastTwo("coding") → "codign"
//lastTwo("cat") → "cta"
//lastTwo("ab") → "ba"
