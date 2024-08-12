package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1, "akshay", 1, "male", "java", 1/1/2024, 51));
		al.add(new Employee(2, "ritesh", 2, "male", "python", 1/2/2024, 111));
		al.add(new Employee(3, "govinda", 3, "male", "react", 1/3/2024, 151));
		al.add(new Employee(4, "amitabh", 4, "male", "mern", 1/4/2024, 201));
		al.add(new Employee(5, "devendra", 5, "male", "java", 1/5/2024, 251));
		al.add(new Employee(6, "narendra", 6, "male", "angular", 1/6/2024, 300));
		al.add(new Employee(7, "ramdas", 7, "male", "matlab", 1/7/2024, 351));
		al.add(new Employee(8, "salman", 8, "female", "ruby", 1/8/2024, 400));
		al.add(new Employee(9, "shahrukh", 9, "female", "powerbi", 1/9/2024, 451));
		al.add(new Employee(10, "amir", 10, "male", "testing", 1/10/2024, 500));
		Map<String, List<Employee>> getdata=al.stream().collect(Collectors.groupingBy(Employee::getGender ));
		getdata.forEach((gender,count)-> System.out.println("count of "+gender +" "+count));
		
		Optional<Employee> emp = al.stream()
		        .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(emp);
		
		Optional<Employee> emp1 = al.stream()
		        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

		System.out.println(emp1.get());
//max exp, second highest, second lowest, name starts with a,min salary of dept
	}

}
