package ast;
import irep.Temp;
import visitor.*;
import java.util.Stack;
import java.util.HashMap;
import java.util.ArrayList;

public class TempSymbolTable implements Enviroment<String, Temp>{

	public Stack<HashMap> st;

	public TempSymbolTable(){

		// creates an empty stack 
		st = new Stack<HashMap>();
	}

	public void beginScope(){
		// push a new hastable onto the stack to represent a new scope
		st.push(new HashMap<String, Temp>());
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

	}

	public void add(String key, Temp value){
		// add the new variable or function with its info
		st.peek().put(key, value);
	}

	public Temp lookup(String key){
		if(st.empty()){
			System.out.println("Tried to lookup through empty stack");
		}
		// search for key
		return (Temp)st.peek().get(key);
	}
}
