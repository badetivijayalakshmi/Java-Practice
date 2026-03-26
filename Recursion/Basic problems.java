//Print numbers from 5 to 1.
public static void printNumbers(int n) {
if(n == 0) {
return;
}
System.out.println(n);
printNumbers(n-1);
}
//Print the sum of first n natural numbers.
class Recursion1 {
  public static void printSum(int n, int sum) {
    if(n == 0) {
    System.out.println(sum);
    return;
}
  sum += n;
  printSum(n-1, sum);
}
  public static void main(String args[]) {
  printSum(5, 0);
}
}
//Print factorial of a number n.
class Recursion1 {
  public static void printFactorial(int n, int fact) {
  if(n == 0) {
    System.out.println(fact);
    return;
}
  fact *= n;
  printFactorial(n-1, fact);
}
public static void main(String args[]) {
  printFactorial(5, 1);
}
//Print the fibonacci sequence till nth term.
class Recursion1 {
public static void printFactorial(int a, int b, int n) {
if(n == 0) {
return;
}
System.out.println(a);
printFactorial(b, a+b, n-1);
}
public static void main(String args[]) {
printFactorial(0, 1, 5);
}
}
//Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
public class Recursion2 {
public static void towerOfHanoi(int n, String src, String helper, String dest) {
if(n == 1) {
System.out.println("transfer disk " + n + " from " + src + " to " + dest);
return;
}
//transfer top n-1 from src to helper using dest as 'helper'
towerOfHanoi(n-1, src, dest, helper);
//transfer nth from src to dest
System.out.println("transfer disk " + n + " from " + src + " to " + helper);
//transfer n-1 from helper to dest using src as 'helper'
towerOfHanoi(n-1, helper, src, dest);
}
public static void main(String args[]) {
int n = 4;
towerOfHanoi(n, "A", "B", "C");
}
}
//Print all the subsequences of a string.
public class Recursion2 {
public static void printSubseq(String str, int idx, String res) {
if(idx == str.length()) {
System.out.println(res);
return;
}
//choose
printSubseq(str, idx+1, res+str.charAt(idx));
//don't choose
printSubseq(str, idx+1, res);
}
public static void main(String args[]) {
String str1 = "abc";
String str2 = "aaa";
printSubseq(str1, 0, "");
}
}
//Time complexity - O(2^n)









