package com.generic.inf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestGeneric {

	public static void main(String[] args) {
		//Un-comment and comment one by one 
		//List<? extends Fruit> fruits=new ArrayList<Fruit>();//T
		//List<? extends Fruit> fruits=new ArrayList<Melon>();//T
		//List<? extends Fruit> fruits=new LinkedList<WaterMelon>();//T
		//List<? extends Fruit> fruits=new Vector<Object>();//F
		//List<? super Melon> melons=new ArrayList<Fruit>();//T
		//List<? super Melon> melons=new LinkedList<>();//T
		//List<? super Melon> melons=new LinkedList<WaterMelon>();//F		 

	}

}
class Fruit{}
class Melon extends Fruit{}
class WaterMelon extends Melon{}