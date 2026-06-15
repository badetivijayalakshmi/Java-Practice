//Given a non-empty string like "Code" return a string like "CCoCodCode".
//code
public String stringSplosion(String str) {
  String res = "";
  for(int i=0;i<=str.length();i++){
    res = res+str.substring(0,i);
  }
  return res;
}
//op-
//stringSplosion("Code") → "CCoCodCode"
//stringSplosion("abc") → "aababc"
//stringSplosion("ab") → "aab"
