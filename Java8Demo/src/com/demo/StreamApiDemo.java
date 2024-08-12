package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//IntStream is an class of stream interface it represents stream of primitive int valued elements
List<String> myList=Arrays.asList("apple","banana","orange");
Stream<String> sequentialStream=myList.stream();

Stream<String> parallelStream=myList.parallelStream();

//stream.of() method creates a stream from individual value
Stream<String> stream=Stream.of("apple","banana","orange");
sequentialStream=Stream.of("red","blue");
sequentialStream.forEach(System.out::println);
System.out.println("print "+sequentialStream);


//filter() : Filters elements based on a predicate
List<String> filtered= myList.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
List<String> filtered1=myList.stream().filter(s->s.length()>10).collect(Collectors.toList());
System.out.println("filter method "+filtered1);

//map(): transform elements using a function
List<Integer> lengths=myList.stream().map(String::length).collect(Collectors.toList());

//sorted(): sorts elements
List<String> sorted=myList.stream().sorted().collect(Collectors.toList());
System.out.println("sorted list is "+sorted);
//with comparator natural ordering
Stream<Integer> st=Stream.of(1,5,2,7,4,8,3);
st.sorted((a,b)->b-a).forEach(System.out::println);

	//without comparator
List<Integer> l=Arrays.asList(2,4,6,8,10,4);
l.stream().sorted().collect(Collectors.toList());
List<Integer>l1=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println("without comparator "+l);
System.out.println("without comparator but reverse order"+l1);
	

//distinct(): remove duplicate elements.
List<String> distinct=myList.stream().distinct().collect(Collectors.toList());

//forEach(): perform action for each element
myList.stream().forEach(System.out::println);
//collect(): accumulates elements into a collection.
List<String> collected=myList.stream().collect(Collectors.toList());
//flatmap():Transform each element into a stream of elements and then flattens these stream into a 
List<List<Integer>> nestedList=Arrays.asList(
		Arrays.asList(1,2),
		Arrays.asList(3,4),
		Arrays.asList(5,6)
		);
List<Integer> flattendList=nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
//collectors.groupingBy(): Gr elements based on classifier function
Map<Integer, List<String>> groupedByLength=myList.stream().collect(Collectors.groupingBy(String::length));
//List<String> filtered= myList.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
	}

}
