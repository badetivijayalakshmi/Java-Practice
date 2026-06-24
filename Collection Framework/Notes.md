# 1. Generics (`<T>`)

## Purpose

Write code that works with multiple data types while maintaining type safety.

### Without Generics

```java
ArrayList list = new ArrayList();
list.add("Hello");

String s = (String) list.get(0);
```

Requires explicit casting.

---

### With Generics

```java
ArrayList<String> list = new ArrayList<>();
list.add("Hello");

String s = list.get(0);
```

No casting required.

---

## Generic Class

```java
class Box<T>{
    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
```

Usage:

```java
Box<Integer> b = new Box<>();
b.set(10);
```

---

## Generic Method

```java
public <T> void printArray(T[] arr){
    for(T x : arr){
        System.out.println(x);
    }
}
```

(HackerRank Generics Problem)

---

## Benefits

```text
Type Safety
Code Reusability
Compile-Time Error Checking
```

---

## Interview Question

### Difference between Generics and Object?

```text
Object:
Needs casting

Generics:
No casting
Compile-time type checking
```

---

# 2. Comparable vs Comparator

One of the most frequently asked Java interview topics.

---

## Comparable

Used when a class defines its own natural ordering.

```java
class Student implements Comparable<Student>{

    int marks;

    public int compareTo(Student s){
        return this.marks - s.marks;
    }
}
```

Sort:

```java
Collections.sort(list);
```

---

## Comparator

Used when external/custom sorting is required.

```java
Comparator<Student> cmp =
    (a,b) -> a.marks - b.marks;

Collections.sort(list, cmp);
```

---

## Example

Students:

```text
Ram 90
Raj 70
Amit 85
```

Sort by marks:

```java
Collections.sort(students, cmp);
```

---

## Comparison Table

| Comparable             | Comparator                   |
| ---------------------- | ---------------------------- |
| In same class          | Separate class/lambda        |
| compareTo()            | compare()                    |
| One sorting logic      | Multiple sorting logics      |
| Collections.sort(list) | Collections.sort(list, comp) |

---

## Interview One-Liner

> Comparable defines natural ordering; Comparator defines custom ordering.

---

# 3. Collections Framework

Very important for coding rounds.

---

## Collection Hierarchy

```text
Collection
│
├── List
├── Set
└── Queue

Map (Separate hierarchy)
```

---

# List

Allows duplicates.

```java
List<Integer> list = new ArrayList<>();
```

### Methods

```java
add()
get()
remove()
set()
size()
contains()
```

Example:

```java
list.add(10);
list.add(20);
```

Output:

```text
[10,20]
```

---

# Set

No duplicates.

```java
Set<Integer> set = new HashSet<>();
```

Example:

```java
set.add(10);
set.add(10);
```

Output:

```text
[10]
```

---

# Map

Key-Value pair.

```java
Map<Integer,String> map =
    new HashMap<>();
```

Example:

```java
map.put(1,"Ram");
map.put(2,"Raj");
```

Access:

```java
map.get(1);
```

Output:

```text
Ram
```

---

## Most Used Implementations

| Interface | Implementation |
| --------- | -------------- |
| List      | ArrayList      |
| Set       | HashSet        |
| Map       | HashMap        |
| Queue     | LinkedList     |

---

## Time Complexities

| Operation | ArrayList | HashSet | HashMap |
| --------- | --------- | ------- | ------- |
| Add       | O(1)      | O(1)    | O(1)    |
| Search    | O(n)      | O(1)    | O(1)    |
| Remove    | O(n)      | O(1)    | O(1)    |

---

## Interview Question

### HashMap vs HashSet

```text
HashMap:
Key-Value pair

HashSet:
Only unique values
```

---

# 4. Exception Handling

Prevents abrupt program termination.

---

## Types

### Checked Exception

Compiler checks.

Examples:

```java
IOException
SQLException
```

---

### Unchecked Exception

Runtime exceptions.

Examples:

```java
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
```

---

## Try-Catch

```java
try{
    int x = 10/0;
}
catch(Exception e){
    System.out.println(e);
}
```

---

## Multiple Catch

```java
try{

}
catch(IOException e){

}
catch(Exception e){

}
```

---

## Finally

Always executes.

```java
try{

}
finally{
    System.out.println("Done");
}
```

---

## Throw

```java
throw new ArithmeticException();
```

---

## Throws

```java
public static void main(String[] args)
throws IOException
```

---

## Throw vs Throws

| Throw              | Throws                   |
| ------------------ | ------------------------ |
| Used inside method | Used in method signature |
| Throws object      | Declares exception       |

---

# 5. Multithreading Basics

Allows multiple tasks to run simultaneously.

---

## Creating Thread

### Method 1

Extend Thread

```java
class MyThread extends Thread{
    public void run(){
        System.out.println("Running");
    }
}
```

Start:

```java
MyThread t = new MyThread();
t.start();
```

---

### Method 2 (Preferred)

Implement Runnable

```java
class MyTask implements Runnable{

    public void run(){
        System.out.println("Running");
    }
}
```

Start:

```java
Thread t = new Thread(new MyTask());
t.start();
```

---

## Why `start()` not `run()`?

```java
t.start();
```

Creates new thread.

```java
t.run();
```

Runs like normal method.

---

## Thread Lifecycle

```text
NEW
 ↓
RUNNABLE
 ↓
RUNNING
 ↓
TERMINATED
```

---

## Useful Methods

### Sleep

```java
Thread.sleep(1000);
```

Pause for 1 second.

---

### Join

```java
t.join();
```

Wait for thread completion.

---

### Current Thread

```java
Thread.currentThread();
```

---

## Synchronization

Used to avoid race conditions.

```java
synchronized void increment(){
    count++;
}
```

---

## Interview Question

### Thread vs Process

| Process               | Thread          |
| --------------------- | --------------- |
| Independent execution | Part of process |
| Separate memory       | Shared memory   |
| Heavyweight           | Lightweight     |

---

# Placement Quick Revision Sheet

```text
GENERICS
---------
<T>
Type Safety
Code Reuse

COMPARABLE
----------
compareTo()
Natural Sorting

COMPARATOR
----------
compare()
Custom Sorting

COLLECTIONS
-----------
List -> Duplicates Allowed
Set -> Unique Elements
Map -> Key Value Pair

EXCEPTIONS
----------
Checked
Unchecked
try-catch-finally
throw
throws

MULTITHREADING
--------------
Thread
Runnable
start()
sleep()
join()
synchronized
```
