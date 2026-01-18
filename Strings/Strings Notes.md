Java Strings – Quick Notes
1️⃣ Taking String Input
Scanner sc = new Scanner(System.in);
String name = sc.next();      // reads one word
String line = sc.nextLine(); // reads full line

2️⃣ String Concatenation
String firstName = "Tony";
String secondName = "Stark";
String fullName = firstName + " " + secondName;
System.out.println(fullName);

3️⃣ Length of a String
System.out.println(fullName.length());

4️⃣ Access Characters of a String
for(int i = 0; i < fullName.length(); i++) {
    System.out.println(fullName.charAt(i));
}

5️⃣ Comparing Strings
String name1 = "Tony";
String name2 = "Tony";

if(name1.equals(name2)) {
    System.out.println("Same string");
}


❌ Do NOT use == for content comparison
✔ Use .equals()

6️⃣ Substring
String name = "TonyStark";
System.out.println(name.substring(0, 4)); // Tony

7️⃣ parseInt (String → int)
String str = "123";
int num = Integer.parseInt(str);
System.out.println(num);

8️⃣ toString (int → String)
int number = 123;
String str = Integer.toString(number);
System.out.println(str.length());

⚠️ Important Note

Java Strings are IMMUTABLE (cannot be changed after creation).

Problem
//Extract Username from Email
Scanner sc = new Scanner(System.in);
String email = sc.next();
String username = "";

for(int i = 0; i < email.length(); i++) {
    if(email.charAt(i) == '@') break;
    username += email.charAt(i);
}

System.out.println(username);
