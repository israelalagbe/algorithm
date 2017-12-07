import java.util.*;

public class Stack
{
	 List L=new ArrayList();
	public static void main(String [] args){
	Stack s=new Stack();
	s.push(8)	;
	s.pop();
	s.print();
	}
	void push(Object o){
		L.add(o);
	}
	void pop(){
		L.remove(L.size()-1);
	}
	void print(){
		System.out.println(L);
	}
}