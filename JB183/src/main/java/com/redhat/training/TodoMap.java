/**
 * 
 */
package com.redhat.training;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author jupittma
 *
 */
public class TodoMap {
	
	/**
	 * @param args
	 * global vars
	 */
	Map< Integer, TodoItem > todoMap;
	static Integer count = 0;
	TodoItem item;
	Scanner scn;
	
	/** Default constructor */
	
	public TodoMap() {
		this.todoMap = new HashMap <Integer, TodoItem>();
	}
	
	public void addTodo() {
		String ans = "Y";
		do {
			// local vars
			
			item = new TodoItem();
			count++;
			scn = new Scanner(System.in);
			String state = "";
			String status = "";
			
			System.out.println("Enter Item description: ");
			item.setItem(scn.nextLine());
			System.out.println("Is ToDo Item done? Y/N: ");
			state = scn.nextLine();
			
			if (state.toUpperCase().charAt(0) == 'Y')
				status = Status.COMPLETED.toString();
			else
				status = Status.PENDING.toString();
			
			item.setStatus(status);
			todoMap.put(new Integer (count), item);
			System.out.println("Do you want to add another Item? Y/N: ");
			ans = scn.next().toUpperCase();
		} while (ans.equalsIgnoreCase("Y"));
		
	}
	
	public void printTodo() {
		System.out.println("- ToDo List: there are " + todoMap.size() + " items to do!");
		for (Integer key : todoMap.keySet() ) {
			System.out.println(key + " : " + todoMap.get(key).getItem() + " = " + todoMap.get(key).getStatus());
		}
		
	}
	
	public void completeTodo(int key) {
		if (todoMap.get(key).getStatus().equals(Status.COMPLETED.toString())) {
			System.out.println("Item " + todoMap.get(key).getItem() + " is already completed.");
		}
		else {
			item = new TodoItem();
			String i = todoMap.get(key).getItem();
			item.setItem(i);
			item.setStatus(Status.COMPLETED.toString());
			todoMap.replace(key, item);
			System.out.println("Marked " + item.getItem() + " as COMPLETED.");
			printTodo();
		}
			
	}
	
	public void deleteTodo(int id) {
		System.out.println("Enter ID of item to delete:");
		scn = new Scanner(System.in);
		todoMap.remove(id);
		System.out.println("Item removed!");
		
	}
	
	public void findItemTodo(int id) {
		System.out.println("\n");
		System.out.println(id + " : " + todoMap.get(id).getItem() + " : " + todoMap.get(id).getStatus());
	}
}
