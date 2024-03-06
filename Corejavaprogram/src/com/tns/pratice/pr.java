package com.tns.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class pr {
public static void main(String[] args) {

	List<Integer> no=Arrays.asList(1,2,3,4);
	int sum=no.stream().reduce(0, (a,b)->a+b);
	System.out.println(sum);
}
}