//Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
//code
public String stringX(String str) {
    if (str.length() <= 2) {
        return str;
    }
    String res = "";
    for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i) != 'x') {
            res += str.charAt(i);
        }
    }
    return str.charAt(0) + res + str.charAt(str.length() - 1);
}
//op-stringX("xxHxix") → "xHix"
//stringX("abxxxcd") → "abcd"
//stringX("xabxxxcdx") → "xabcdx"
