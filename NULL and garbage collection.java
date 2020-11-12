// First, it DOESN'T need to assign null to parameters when no longer use it. 

// For example, 

int[] buffer = new int[100]; 
doSomething(buffer); 
buffer = null  // No need to explicitly assign null 


// But like all things: it depends. The GC in Java these days is VERY good
// and everything should be cleaned up very shortly after it is no longer
// reachable. This is just after leaving a method for local variables, and
// when a class instance is no longer referenced for fields.
//
// You only need to explicitly null if you know it would remain referenced
// otherwise. For example an array which is kept around. You may want to
// null the individual elements of the array when they are no longer needed.

  
ArrayList longLivedList = new ArrayList<DataElement>(...); 
  
// set the reference to the irrelevant DataElement to null 
longLivedList.set(someIndex, null); 




Drawbacks in Reference Counted GC (JAVA)
  
Consider two classes A and B having each other’s references.
class A {
    private B b;

    public void setB(B b) {
        this.b = b;
    }
}

class B {
    private A a;

    public void setA(A a) {
        this.a = a;
    }
}

public class Main {
    public static void main(String[] args) {
        A one = new A();
        B two = new B();

        // Make the objects refer to each other (creates a circular reference)
        one.setB(two);
        two.setA(one);

        // Throw away the references from the main method; the two objects are
        // still referring to each other
        one = null;
        two = null;
    }
}
 

When we assign null values for the two variables one and two, the external references existed with the class objects (“A” and “B”) created at the beginning will be removed. 
Still, they won’t be eligible for garbage collection as the reference counters of those two objects will not become zero due to object “A” having its reference inside “B” and the object “B” having its reference inside “A”.

