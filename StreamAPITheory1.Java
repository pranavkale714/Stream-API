public class StreamAPITheory1 {
    public static void main(String[] args) {
        System.out.println("The Stream API in Java, introduced in Java 8, is a powerful feature");
        System.out.println("used for processing collections of objects in a functional and declarative way.");
        System.out.println();

        System.out.println("A Stream is a sequence of elements that supports sequential and parallel");
        System.out.println("aggregate operations. It allows developers to perform complex data processing tasks");
        System.out.println("concise, readable, and efficiently.");

        System.out.println("Why Use Stream API?");
        System.out.println("- Reduces boilerplate code.");
        System.out.println("- Makes code more readable and concise.");
        System.out.println("- Supports functional-style programming.");
        System.out.println("- Allows parallel processing of data.");
     

        System.out.println("Types of Stream Operations:");
        System.out.println("Intermediate Operations:");
        System.out.println("- Return a new stream.");
        System.out.println("- Are lazy (executed only when a terminal operation is called).");
        System.out.println("- Examples: filter(), map(), distinct(), sorted(), limit()");
        System.out.println("Terminal Operations:");
        System.out.println("- Trigger the processing of the stream pipeline.");
        System.out.println("- Return a result or produce a side effect.");
        System.out.println("- Examples: forEach(), collect(), count(), reduce(), toArray()");


        System.out.println("Characteristics of Stream:");
        System.out.println("- Not a data structure – It does not store elements.");
        System.out.println("- Lazy evaluation – Operations are not executed until needed.");
        System.out.println("- One-time use – A stream can be used only once.");
        System.out.println("- Can be infinite – Streams can represent infinite sequences.");
        System.out.println("- Supports parallelism – Can be processed in parallel using parallelStream().");
    }
}
