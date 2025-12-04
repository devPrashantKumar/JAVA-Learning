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
## Video 21 :
- **Title:** 21. Control Flow Statements in Java | Decision Making, Looping and Branching Statements
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