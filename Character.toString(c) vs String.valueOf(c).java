	// in java there are two different ways to implement char to String
	//
	// 1. Character.toString(char) it need to combine chat to String.
	//
	// 2. String.valueOf(char), it's more easy .
	//
	public void test() {
		String temp = "aa";

		char tempChar = 'a';

		String temp_result1 = Character.toString(tempChar) + Character.toString(tempChar);
		String temp_result2 = String.valueOf(tempChar) + String.valueOf(tempChar);

		if (temp.equals(temp_result2) && temp.equals(temp_result1)) {
			System.out.println(" equals ");
		} else {
			System.out.println(" not equals ");
		}
	}