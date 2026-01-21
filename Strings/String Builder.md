Java StringBuilder – Notes

1️⃣ Declaration
StringBuilder sb = new StringBuilder("Apna College");
System.out.println(sb);

2️⃣ Get Character from Index
StringBuilder sb = new StringBuilder("Tony");
System.out.println(sb.charAt(0)); // T

3️⃣ Set Character at Index
StringBuilder sb = new StringBuilder("Tony");
sb.setCharAt(0, 'P');
System.out.println(sb); // Pony

4️⃣ Insert Character at Index
StringBuilder sb = new StringBuilder("tony");
sb.insert(0, 'S');
System.out.println(sb); // Stony

5️⃣ Delete Character (Range)
StringBuilder sb = new StringBuilder("Stony");
sb.delete(0, 1);
System.out.println(sb); // tony

6️⃣ Append (Add at End)
StringBuilder sb = new StringBuilder("Tony");
sb.append(" Stark");
System.out.println(sb); // Tony Stark

7️⃣ Length of StringBuilder
StringBuilder sb = new StringBuilder("Tony Stark");
System.out.println(sb.length());

8️⃣ Reverse a String (Manual)

CODE

StringBuilder sb = new StringBuilder("HelloWorld");
for(int i = 0; i < sb.length() / 2; i++) {
    int front = i;
    int back = sb.length() - i - 1;
    char frontChar = sb.charAt(front);
    char backChar = sb.charAt(back);
    sb.setCharAt(front, backChar);
    sb.setCharAt(back, frontChar);
}
System.out.println(sb); // dlroWolleH

⚠️ Important Points

StringBuilder is mutable

Faster than String for modifications

Methods: append(), insert(), delete(), setCharAt()
