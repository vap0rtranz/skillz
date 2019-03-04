/**
 * 
 */
package com.redhat.training;

/**
 * @author jupittma
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TestTodoMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TodoMap testMap = new TodoMap();
		boolean timeToQuit = false;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				timeToQuit = executeMenu(in, testMap);
			} catch (IOException e) {
				System.out.println("ERROR: could not read input");
			}
		} while (!timeToQuit);

	}
	
	public static boolean executeMenu(BufferedReader in, TodoMap todo) throws IOException {
		String action;
		int id;
		
		System.out.println("\n [N]ew [C]omplete [R]ead [D]elete [L]ist [Q]uit ?:");
		action = in.readLine();
		if ((action.length() == 0) || (action.toUpperCase().charAt(0)) == 'Q') {
			return true;
		}
		
		switch (action.toUpperCase().charAt(0)) {
		case 'N':
			todo.addTodo();
			System.out.println("Added new item");
			break;
			
		case 'C':
			System.out.println("Enter ID of item:");
			id = new Integer(in.readLine().trim());
			todo.completeTodo(id);
			System.out.println("Completed item");
			break;
			
		case 'R':
			System.out.println("Enter ID of item:");
			id = new Integer(in.readLine().trim());
			todo.findItemTodo(id);
			System.out.println("Here is item:");
			break;
			
		case 'D':
			System.out.println("Enter ID of item:");
			id = new Integer(in.readLine().trim());
			todo.deleteTodo(id);
			System.out.println("Item deleted.");
			break;
			
		case 'L':
			System.out.println("List of items:");
			todo.printTodo();
			break;
		}
		return false;
	}

}
