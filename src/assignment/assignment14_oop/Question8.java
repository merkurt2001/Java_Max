package assignment.assignment14_oop;

public class Question8 {

	public static void main(String[] args) {
		
	    Value v= new Value(3);
	    System.out.println(v.calledConstructor);
	}

}

class Value {
	
	 int param=0;
	 boolean calledMethod= false;
	 boolean calledConstructor= false;
	 
	 public Value(int param){
	   this.param= param;
	   this.calledConstructor=true;
	 }
	 public Value(){

	 }
	 
	 public boolean wasModified(){
	   boolean value=false;
	   if (this.calledMethod){
	     value= true;
	   }
	   return value;
	 }
	 
	 public void setVal(int param){
	   this.calledMethod= true;
	   this.param=param;
	 } 
	 public int getVal(){
	   int val;
	   boolean flag= false;
	   flag= wasModified();
	   if (flag){ 
	     val= this.param;
	   } 
	   else if (this.calledConstructor){
	     val=this.param;
	   }   
	   else 
	  {
	    val=0;
	  }
	  return val;
	 }
	}
