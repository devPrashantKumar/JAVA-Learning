## Process
Process is the instance of a Program that is getting executed.  
It has its own resources like memory, thread etc. OS allocates these resources to process when its created.

---

## Thread
Thread is a lightweight process, and 1 process can have multiple threads.  
When a process is created it starts with one thread known as "main thread" and from that we can create multiple threads to run tasks concurrently.

---

## Difference b/w Multithreading, MultiProcessing and MultiTasking

- **Multithreading** - Multiple threads inside a single process running concurrently.
- **Multiprocessing** - Running multiple processes, each with its own memory space.
- **Multitasking** - An OS-level concept where multiple tasks run “at the same time” using Context Switching

---

## Number of Ways to create a Thread

- by Extending "Thread" class
- by implementing "Runnable" interface

---

## Thread Lifecycle

- New
- Runnable
- Running
- Blocked
- Waiting
- TimedWaiting
- Terminated

---

## Notes on Thread States

- when thread is in TimedWaiting (sleep, join) State it releases all the MONITOR Locks
- when thread is in Waiting (wait) State it doesn't release the MONITOR Locks

---

## Single Producer Consumer Problem

https://github.com/devPrashantKumar/JAVA-Learning/tree/main/JAVA-Basics/SingleProducerConsumerProblemPractice

---

## Deprecated Methods

stop, suspend and resume methods deprecated from "Thread" class , because they don't release monitor locks, which can cause deadlock issues.

---

## JOIN

when JOIN method is invoked on a thread object. current thread will be blocked and waits for the specific thread to finish