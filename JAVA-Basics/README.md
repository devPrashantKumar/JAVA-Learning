# JAVA Basics

---
## Video 1 :
- **Title:** 1. OOPs Concept in Java with Examples | 4 Pillars of Object Oriented Programming (OOPs)
- **URL:** [Watch on YouTube](https://youtu.be/MIYbPZCk34k?si=q-pKP-KWBQs4FLTE)


### Topics Covered
- Difference b/w Procedural Programming and OOPs Programming
- What is OOPS (properties and methods)
- Class and Object
- 4 Pillars of OOPs 
  - Abstraction
  - Encapsulation
  - Inheritance
  - Polymorphism
- Ques: Can we achieve Method Overloading just by Changing Method Return Type ? 
- Ques: Can we change Method Return Type during Method Overriding?
- IS-A and HAS-A Relationship
- Types of HAS-A Relationship (OneToOne, OneToMany, ManyToMany)
  - Aggregation (Weak Relationship)
  - Composition (Strong Relationship)

---
## Video 2 :
- **Title:** 2. How Java Program Works and its 3 Important Components (JVM, JRE and JDK) with Example
- **URL:** [Watch on YouTube](https://youtu.be/IoireaKRRFo?si=AzX2jMk1cWHblAom)

### Topics Covered
- What is JAVA
- role of JVM
- JVM, JRE and JDK roles and differences
- JSE, JEE and JME
- public static void main (){} method analysis

---
## Video 3 :
- **Title:** 3. Quiz Question: Why only 1 Public Class in JAVA file
- **URL:** [Watch on YouTube](https://youtu.be/ijEJJuIQdzY?si=UVHxCADQoigHQdjY)

### Topics Covered
- Why only 1 Public Class in JAVA file.
- The rule is not a technical limitation — it’s a deliberate design choice to promote clarity, simplicity, and maintainability in Java projects.

---
## Video 4 :
- **Title:** 4. Java Variables - Part1 | Primitive Data Types in Depth
- **URL:** [Watch on YouTube](https://youtu.be/Q6_jrvz-R7w?si=6PiL9AAOIbVBm8C_)

### Topics Covered
- DataType
  - Primitive DataType
  - Referenced DataType
- negative byte, short, int, long stored as a signed 2's complement of its positive value
- float and double stored as IEEE 764 value
- type conversion
  - lower to higher (implicit typecasting)
  - higher to lower (explicit/forced typecasting)
  - promotion during expression evaluation.
- Kind of variables
  - instance/member variable
  - local variable
  - Static variable
  - Method parameter
  - Constructor parameter

---
## Video 5 :
- **Title:** 5. How FLOAT and DOUBLE Number Stored in Memory? | IEEE 754 Representation
- **URL:** [Watch on YouTube](https://youtu.be/NZ3qAfM8Ztw?si=-uSdSSoLYTyiVwHu)

### Topics Covered
- 32 bit IEEE 764 standard to store float
- 64 bit IEEE 764 standard to store long

---
## Video 6 :
- **Title:** 6. Java Variables - Part2 | Reference/Non-Primitive Data Types in Depth
- **URL:** [Watch on YouTube](https://youtu.be/1Ox0fyJuUVY?si=O1sdhN2uIifhXcy-)

### Topics Covered
- Reference DataType
  - Class
  - String 
    - number of object created in string constant pool and Heap Memory
    - why Strings are Immutable in nature
  - Interface
  - Array
- Wrapper Classes
  - Autoboxing
  - Unboxing

---
## Video 7 :
- **Title:** 7. Java Methods in Depth | Different Types of Methods with Examples
- **URL:** [Watch on YouTube](https://youtu.be/Lqan4AF9wzA?si=bp1KWhoYZ2nYoE-Z)

### Topics Covered
- Access Specifiers
  - Private
  - Public
  - Protected
  - Default
- Static methods in java
  - inheritance
  - method overriding (not possible), method hiding is possible (follows compile time binding)
- final methods (can not be overridden in child class) 

---
## Video 8 :
- **Title:** 8. Java Constructor in Depth | Different Types of Constructor with Examples
- **URL:** [Watch on YouTube](https://youtu.be/_hHtmSt5dSg?si=9ZcJGWkaddgO74yX)

### Topics Covered
- constructor can not be inherited, static, final and abstract.

---
## Video 9 :
- **Title:** 9. Java Memory Management and Garbage Collection in Depth
- **URL:** [Watch on YouTube](https://youtu.be/vz6vSZRuS2M?si=DuzfrjrWsThC2PQR)

### Topics Covered
- type of memory area java create
  - Stack (each thread have separate stack memory)
  - Heap
-Heap memory
  - Young Generation (eden, s0,s1) -> Minor GC runs more frequently
  - Old Generation -> Major GC runs less frequently
- Garbage Collector Algorithms
  - Mark & Sweep Algo
  - Mark & Sweep with Compact Memory Algo
- Types of Garbage Collector
  - Serial GC
  - Parallel GC
  - Concurrent Mark & Sweep GC
  - G1 GC

---
## Video 10 :
- **Title:** 10. Java Classes in Depth - Part1 | Nested Class, Concrete, Abstract, Object, Super and Sub Class
- **URL:** [Watch on YouTube](https://youtu.be/aecJeZgl__4?si=Sd4fPk9De7GoKJPE)

### Topics Covered
- Concrete Class
- Abstract Class
- Super class and Sub class
- Object class
- Nested Class
  - static Nested Class
  - non-static nested class
    - member inner class
    - local inner class
    - anonymous inner class

---
## Video 11 :
- **Title:** 11. Java Generic Classes | Java Classes in Depth - Part2
- **URL:** [Watch on YouTube](https://youtu.be/NCx_ABybp2o?si=TsR25cQ8-eT62WF-)

### Topics Covered
- Generic Classes
- Inheritance in Generic classes
- Generic Methods
- raw type generics
- bounded generics
  - upper bound
  - multi bound
- bounded wildcard
  - upper bound
  - lower bound
  - multi bound
- use case difference b/w wildcard and generics
- Type eraser
  - Generic class eraser
  - Generic class bounded type eraser
  - Generic method type eraser
  - Generic method bounded type eraser

---
## Video 12 :
- **Title:** 12. Java Enum, POJO and Final Classes Explained with Examples | Java Classes in Depth - Part3
- **URL:** [Watch on YouTube](https://youtu.be/zNCtAAqxjT0?si=JbT3vev-3eA6mCL0)

### Topics Covered
- Enums
  - common functions (Values, ordinal valueOf, name)
- Enum with custom values
- Method override with constant
- Enum with abstract method
- Enum implement interface
- benefits of enums over static final constants
- Final class

---
## Video 13 :
- **Title:** 13. Java Singleton and Immutable Class Explained with Examples | Java Classes in Depth - Part4
- **URL:** [Watch on YouTube](https://youtu.be/SqDbZOjW1uM?si=haUHUBNdThm6x0V5)

### Topics Covered
- Singleton Class
  - Eager Initialization
  - Lazy Initialization
    - synchronization block
    - double check lock (with volatile due to memory l1 cache issue)
    - Bill Pugh solution (using nested class)
    - Enum Singleton
- Immutable Class

---
## Video 14 :
- **Title:** 14. Java Interface in Depth - Part1
- **URL:** [Watch on YouTube](https://youtu.be/aj3SLuDkGWg?si=rSm2pwaZ1xBxVAhJ)

### Topics Covered
- Interface Basics
- Nested Interface
  - interface inside interface
  - interface inside class
- difference b/w interface and abstract class

---
## Video 15 :
- **Title:** 15. Default, Static & Private Method in Interface - Java8 and Java9 features | Java Interfaces Part2
- **URL:** [Watch on YouTube](https://youtu.be/ZFPajbsXIwM?si=wmX9JtfndU0cucR-)

### Topics Covered
- default methods
- inheritance and diamond problem resolution in case of default methods 
- static methods in interface
- private and private static methods in JAVA9

---
## Video 16 :
- **Title:**  16. Functional Interface and Lambda Expression - Java8 features | Java Interfaces Part3
- **URL:** [Watch on YouTube](https://youtu.be/YXRBBOjgrFU?si=FZ-RrFUS_DJCdltW)

### Topics Covered
- functional interface and lambda expression
- some common functional interface
- functional interface extending other interface
- object class methods inside functional interface

---
## Video 17 :
- **Title:**  17. Java Reflection in Depth (Using Examples)
- **URL:** [Watch on YouTube](https://youtu.be/P4UAoYiaHg4?si=mFJyJNPsLCPstSeq)

### Topics Covered
- 

---
## Video 18 :
- **Title:** 18. Java Annotations with Examples
- **URL:** [Watch on YouTube](https://youtu.be/H5WYze-FL50?si=e3bPqshP3diN--BH)

### Topics Covered
- 

---
## Video 19 :
- **Title:** 19. Exception Handling in Java with Examples
- **URL:** [Watch on YouTube](https://youtu.be/tw4wWCsGNe4?si=97k7ns0PxvgiuoYV)

### Topics Covered
- stack trace structure and order
- exception hierarchy 
- difference b/w exception and error
- difference b/w checked and unchecked exception
- exception handling
  - using throws
  - using try/catch/finally
- throw exception using "throw"
- custom/user-defined exceptions

---
## Video 20 :
- **Title:** 19. Exception Handling in Java with Examples
- **URL:** [Watch on YouTube](https://youtu.be/tw4wWCsGNe4?si=97k7ns0PxvgiuoYV)

### Topics Covered
- bitwise not operator
- unsigned right shift
- operator precedence

---
## Video 21 :
- **Title:** 21. Control Flow Statements in Java | Decision-Making, Looping and Branching Statements
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=Z2B5CYMEWfc)

### Topics Covered
- Switch Statement and Switch Expression
- return from switch expression using (case N -> and yield)
- break and continue keyword

---
## Video 22 :
- **Title:** 22. Collections in Java - Part1 | Java Collections Framework in depth
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=TT1-qsuHMXs&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=23)

### Topics Covered
- Iterable Interface and its methods
- Collection Interface and its methods
- Collection vs Collections

---
## Video 23 :
- **Title:** 23. Collections in Java - Part2 | Comparator Vs Comparable | PriorityQueue
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=vVfZIWMEzMM&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=24)

### Topics Covered
- Queue Interface and its methods 
  - add vs offer 
  - remove vs poll
  - element vs peek
- Min/Max Priority Queue
- Comparator and Comparable Interfaces

---
## Video 25 :
- **Title:** 25. Collections in Java - Part4 | HashMap Internal Working in Java
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=VjYRxcbmEso&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=26)

### Topics Covered
- Difference b/w Map and Collection
- Methods in Map Interface
- Map.Entry Interface in Map
- Internal Implementation and working of HashMap
  - Load Factor
  - Re-Hashing
  - Treefy LinkedList (Red Black Balanced BST)

---
## Video 28 :
- **Title:** 28. Streams in Java8 | Collections in Java - Part7
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=nEno48RpDR4&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=29)

### Topics Covered
- What are Streams
- Different ways to create Stream
- Different Intermediate Operations on Streams
  - filter, map, flatmap, distinct, sorted, peek, limit, skip
  - mapToInt, mapToLong, mapToDouble
  - IntStream, DoubleStream, LongStream
- Different Terminal Operations on Stream
  - forEach, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch, findFirst, findAny
- Parallel Stream

---
## Video 29 :
- **Title:** 29. Multithreading and Concurrency in Java: Part1 | Threads, Process and their Memory Model in depth
- **URL:** [Watch on YouTube](https://youtu.be/TpYIcJN9EV8?si=1h282sHl1DSYm5Br)

### Topics Covered
- Process and Thread
- Process full life cycle (stack, register, PC, code segment, data segment, heap, context switching and thread)
- Multithreading
- Multithreading vs Multitasking
---
## Video 30 :
- **Title:** 30. Thread Creation, Thread Lifecycle and Inter-Thread Communication | Multithreading in Java: Part2
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=AYiE7_loIsE&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=31)

### Topics Covered
- Ways to create Thread in JAVA
  - extend Thread class
  - implement Runnable interface
- Hierarchy of Thread class
- Thread Lifecycle
  - New
  - Runnable (Runnable and Running)
  - Blocked
  - Waiting
  - Timed Waiting
  - Terminated
- Monitor/Intrinsic lock
- use of wait and notifyAll in Inter-Thread communication
- Producer Consumer Problem

---
## Video 31 :
- **Title:** 31. Thread Joining, Daemon Thread, Thread Priority | Multithreading in Java: Part3
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=cdsFwGDVzpg&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=32)

### Topics Covered
- Producer Consumer Problem
- stop, suspend and resume Thread method deprecated
- join
- thread priority
- Daemon Thread
- difference b/w user thread and daemon thread

---
## Video 32 :
- **Title:** 32. Locks and Condition | Java Multithreading Part4 | Reentrant, ReadWrite, Stamped & Semaphore Lock
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=DPob5NLzKFI&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=33)

### Topics Covered
- Locks and Semaphores
  - Reentrant lock
  - ReadWriteLock
  - StampedLock
  - Semaphore
  - synchronized
- optimistic locking without lock
- inter-thread communication using await, signal and signalAll over condition object

---
## Video 33 :
- **Title:** 33. Lock-Free Concurrency | Compare-and-Swap | Atomic & Volatile Variables | Multithreading Part5
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=JGb4qNEBW6Q&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=34)

### Topics Covered
- optimistic locking without lock using CAS technique
- Atomic Variables
  - AtomicInteger
  - AtomicBoolean
  - AtomicLong
  - AtomicReference
- Volatile keyword
- Thread Safe Collections

---
## Video 34 :
- **Title:** 34. Thread Pools in Java | ThreadPoolExecutor Framework | Multithreading Part6
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=ZUWs2U71vvk&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=35)

### Topics Covered
- Thread Pool - what and why
- Executor Framework Hierarchy
- Thread Pool Executor constructor parameters and their usage
  - corePoolSize
  - maximumPoolSize
  - keepAliveTime
  - TimeUnit
  - BlockingQueue<Runnable>
  - RejectedExecutionHandler
- Lifecycle of ThreadPoolExecutor
  - running
  - shutdown
  - stop (shutdownNow)
  - terminated
- ThreadPoolExecutor Example
- max number of threads we can create in thread pool (interview question)
- max thread formula and factors

---
## Video 36 :
- **Title:** 36. Java ForkJoinPool || WorkStealingPool || FixedThreadPool || CachedThreadPool || SingleThreadPool
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=VlfVyz-QG60&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=37)

### Topics Covered

---