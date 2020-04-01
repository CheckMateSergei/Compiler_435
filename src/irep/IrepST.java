package irep;
import ast.*;
import visitor.*;
import java.util.Stack;
import java.util.HashMap;
import java.util.ArrayList;

public class IrepST implements Enviroment<String, Type>{

	public Stack<HashMap> st;

	public IrepST(){

		// creates an empty stack 
		st = new Stack<HashMap>();
	}

	public void beginScope(){
		// push a new hastable onto the stack to represent a new scope
		st.push(new HashMap<String, Type>());
	}

	public void endScope(){
		// if the st is empty and we try to pop
		if(st.empty()){
			System.out.println("Tried to pop empty stack");
		}
		// if not pop the top entry of the stack
		st.pop();
	}

	public boolean inCurrentScope(String key){
		if(st.empty()){
			System.out.println("Tried to probe empty stack");
		}
		// checks the top scope only for the specified key
		return (st.peek()).containsKey(key);
		//return this.lookup(key) == null;
	}

	public void add(String key, Type value){
		// add the new variable or function with its info
		st.peek().put(key, value);
	}

	public Type lookup(String key){
		if(st.empty()){
			System.out.println("Tried to lookup through empty stack");
		}
		// search for key
		return (Type)st.peek().get(key);
	}
}
