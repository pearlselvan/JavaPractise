package Lang;

/**
 * Created by muthuselvan on 3/10/17.
 * Reff : http://javapapers.com/java/how-java-garbage-collection-works/
 *
 */

/*

 in C : malloc , calloc  and free , destructor in manually
 Technique : finding live object
 and dead object

What is GC ?
------------
Garbage collection is the process of reclaiming the unused memory
space and making it available for the future instances.

 When GC happen ?
 Java objects reside in an area called the heap.
 The heap is created when the JVM starts up and may increase or decrease in size
 while the application runs.
 When the heap becomes full, garbage is collected
------------------------------------------
During the garbage collection objects that are no longer used are cleared,
thus making space for new objects.

When new object will create object in heap area

static member / class defination are stored in method area ( permgen)

Which thread will take care ?
Garbage Collector ,is a daemon thread

GC steps ?
---------
Mark (start from main and mark the reachable / unreachable object )
  -> Delete / Sweep
   -> Compacting
( fragmenting )

heap is divided into ?
-----------------------
Eden space  -> old generation
if GC collector run different cycle then obj will from eden to old generation

minror GC in eden space : https://www.youtube.com/watch?v=UnaNQgzw4zY goto 40
----------------------
Again Eden will divide  into Survivor 1 and Survivor 2
when old generation is full ...that time majar gc will happen thats perform
mark -delete -> compacting

Before GC ?
-----------
Before removing an object from memory garbage collection thread invokes finalize() method
of that object and gives an opportunity to perform any sort of cleanup required

Summary on Major and Minor GC :
-----------------------------
These are called as Young generation, Tenured or Old Generation and Perm Area of the heap.
 New Generation is further divided into three parts known as Eden space, Survivor 1 and Survivor 2 space.
 When an object first created in heap its gets created in new generation inside Eden space and
after subsequent minor garbage collection if an object survives its gets moved to survivor 1 and then survivor 2
before major garbage collection moved that object to old or tenured generation


Types of GC ?
-------------
Reff : http://javarevisited.blogspot.com/2011/04/garbage-collection-in-java.html

Object of types of GC is Each is generational garbage collector
which has been implemented to increase the throughput of the application or
to reduce garbage collection pause times.
1. Throughput Garbage Collector : -XX:+UseParallelGC
2. Concurrent low pause Collector : -Xingc or -XX:+UseConcMarkSweepGC
3. The Incremental (Sometimes called train) low pause collector:-XX:+UseTrainGC

JVM :
(single thread ) -XX:+UseSerialGC ,-XX:+ParallelGC,-XX+UseG1GC


When to use which GC ?
-----------------------
if the application requires :
   short pause then use concurrent collector ( most the web application )
if the application required :
   high through put then use parallel collector

G1 garbase collection  officiall from 1.7:
----------------------------------------
   mixes : concurrent + paralllel GC , low pass with fragmentation
   better heap utilization

How to log the GC ?
------------------
-verbose:gc , -XX:+PrintGCDetails , -Xloggc:gcLogfile.log

Garabage collection analyser by IBM / eclipse plugin
GC tool by java : jvisualvm this will show how sweep ..
jhat : is heap analyser tool




When object becomes eligible for garbage collection ?
------------------------------------------------------
1) All references to that object explicitly set to null e.g. object = null
2)The object is created inside a block and reference goes out scope once control exit that block.
3)Parent object set to null if an object holds the reference to another object
and when you set container object's reference null, child or contained object automatically
 becomes eligible for garbage collection
4.If an object has only lived weak references via WeakHashMap it will be eligible for garbage collection.


Check through the code :
-------------------------
Runtime rs =  Runtime.getRuntime();
System.out.println("Free memory in JVM before Garbage Collection = "+rs.freeMemory());
rs.gc();
System.out.println("Free memory in JVM after Garbage Collection = "+rs.freeMemory());


Example Program for GC OutOfMemoryError
----------------------------------------

Garbage collection does not guarantee safety from out of memory issues.
Mindless code will lead us to OutOfMemoryError.

import java.util.LinkedList;
import java.util.List;

public class GC {
	public static void main(String[] main) {
		List l = new LinkedList();
		// Enter infinite loop which will add a String to the list: l on each
		// iteration.
		do {
			l.add(new String("Hello, World"));
		} while (true);
	}
}




what are thing we need to avoid memory leak ?
| -------------------------------------------------------------------------------------------|
 https://nirajrules.wordpress.com/2009/09/17/measuring-performance-response-vs-latency-vs-throughput-vs-load-vs-scalability-vs-stress-vs-robustness/
| Response Time – Amount of time system takes to process a request after it has received one |
  Latency – In simplest terms this is Remote Response time
  Throughput – transactions per second your application can handle
  Scalability – is the measure of how your system responds when additional hardware is added.
   Does it take new increased load by making use of added resources?

| -------------------------------------------------------------------------------------------|

Java 8 Improvement

Turn on the -XX:+UseStringDeduplication JVM argument while using G1 garbage collector.
 This optimizes the heap memory by removing duplicate String values to a single char[] array.
 This option is introduced in Java 8 u 20.


Does Garbage collection occur in permanent generation space in JVM?
http://javarevisited.blogspot.com/2012/10/10-garbage-collection-interview-question-answer.html?m=1
This  is a tricky Garbage collection interview question as many programmers are not sure
whether PermGen space is part of Java heap space or not and since it maintains class Meta data and String pool,
whether its eligible for garbage collection or not. By the way Garbage Collection does
occur in PermGen space and if PermGen space is full or cross a threshold, it can trigger Full GC.
If you look at output of GC you will find that PermGen space is also garbage collected.
This is why correct sizing of PermGen space is important to avoid frequent full GC.
You can control size of PermGen space by JVM options -XX:PermGenSize and -XX:MaxPermGenSize.


 */
public class GarbageCollectionDemo {
}
