First of all, Only if when the object implement the **cloneable** then can the method "clone" in this object, otherwise you will get CloneNotSupportedException in it.

And then using 'super.clone' makes a field-for-filed copy of instances of that class for cloning a object.

**Field-for-filed** does not mean create a new object, yet means copy the value of every field from the original object into the cloned object.

The using cloneable example is create a object is too expensive, such as having to access datebase.

PS: using clone method not really create a new object. it likes copy all the instances from one class to another class.

And use the "clone" can copy object without call by reference