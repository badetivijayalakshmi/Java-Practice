//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
//code
public String zipZap(String str) {
    String res = "";

    for (int i = 0; i < str.length(); i++) {

        if (i < str.length() - 2 &&
            str.charAt(i) == 'z' &&
            str.charAt(i + 2) == 'p') {

            res += "zp";
            i += 2;     // skip the whole pattern
        } else {
            res += str.charAt(i);
        }
    }

    return res;
}
//op
//zipZap("zipXzap") → "zpXzp"
//zipZap("zopzop") → "zpzp"
//zipZap("zzzopzop") → "zzzpzp"
