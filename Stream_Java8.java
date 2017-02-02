package Ioc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Java8 {

	public static void main(String[] args) {
		new Stream_Java8().java8Stream();
	}

	// Reference:
	// http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
	public void java8Stream() {
		// Streams are Monads, thus playing a big part in bringing functional
		// programming to Java

		// In functional programming, a monad is a structure that represents
		// computations defined as sequences of steps.

		// Example starts:

		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println); // C1
																														// C2

		// Intermediate operations: return a stream so we can chain multiple
		// intermediate operations without using semicolons

		// Terminal operations: are either void or return a non-stream result

		// intermediate operation: filter, map and sorted
		// terminal operation: forEach

		Arrays.asList("a1", "a2", "a3").stream().map(String::toUpperCase).findFirst().ifPresent(System.out::println);
		// A1

		Stream.of("a1", "a2", "a3").findFirst().ifPresent(System.out::println); // a1

		// streams for working with the primitive data types

		IntStream.range(1, 4).forEach(System.out::print);
		System.out.println(); // 123

		Arrays.stream(new int[] { 1, 2, 3 }).map(n -> 2 * n + 1).average().ifPresent(System.out::println);
		// 5.0

		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println); // 3

		// Primitive streams can be transformed to object streams via
		// mapToObj():
		IntStream.range(1, 4).mapToObj(i -> "a" + i).forEach(System.out::println);

		// a1
		// a2
		// a3

	}
}
