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
