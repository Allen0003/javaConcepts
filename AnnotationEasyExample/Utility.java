package AnnotationEasyExample;
//Question: why these two annotations cannot switch the position   

//Because assign different @Target for each annotation 
//one is ElementType.TYPE the another one is ElementType.METHOD 
@Description(value = "testing value")
public class Utility {

	@Author(name = "Haoran", group = "Alice")
	public String work() {
		return "work over!";
	}
}