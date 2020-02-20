package packages;
import java.util.Stack;
import java.util.Hashtable;

public class SymbolTable<K, V> implements Enviroment{

	Stack<Hashtable> st;

	public SymbolTable(){

		// creates an empty stack 
		st = new Stack<Hashtable>();
	}

	public void beginScope(){
		// push a new hastable onto the stack to represent a new scope
		st.push(new Hashtable<K, V>());
	}

	public void endScope(){
		// if the st is empty and we try to pop
		if(st.empty()){
			System.out.println("Tried to pop empty stack");
		}
		// if not pop the top entry of the stack
		st.pop();
	}

	public boolean inCurrentScope(Object key){
		if(st.empty()){
			System.out.println("Tried to probe empty stack");
		}
		// checks the top scope only for the specified key
		return st.peek().contains(key);
	}

	public void add(Object key, Object value){
		// add the new variable or function with its info
		st.peek().put(key, value);
	}

	public V lookup(Object key){
		if(st.empty()){
			System.out.println("Tried to lookup through empty stack");
		}
		// search for key
		return (V)st.peek().get(key);
	}
}
