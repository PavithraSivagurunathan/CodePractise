package wrapperclass;

public class Integer1 {
	int a ;
	Integer1(){
	}
    Integer1(int a){
    	this.a=a;
    }
    public String toString() {
    	return "value is"+a;
    }
    public static Integer1 valueOf(int a) {
    	return new Integer1(a);
    }
    public int intValue() {
    	return a;
    }
    
}
