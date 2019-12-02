package com.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Pavan","Chandra","Arun","Pretham","Raja","Mausam","Suresh","Kirthi","Nimisha");
		
		List<String> namesWitha=names.stream().filter(a->a.contains("a")).collect(Collectors.toList());
		
		namesWitha.stream().forEach(a->System.out.println(a));
		
		
		names.stream().filter(x->(x.length()>6)).map(s->"Welcome "+s).forEach(Printer::print);
	}

}


class Printer{
	
	public static void print(String s) {
		System.out.println(s);
	}
}