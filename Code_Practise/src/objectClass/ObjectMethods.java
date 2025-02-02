package objectClass;

public class ObjectMethods {
	int rad = 12;
	ObjectMethods(){
		this.rad=22;
		}
	public String toString() {
		return "Radius"+rad;
		
	}
	public int hashCode() {
		return rad+12;
	}
	public boolean equals(Object o) {
		ObjectMethods m=(ObjectMethods) o;
		if(this.rad == m.rad) {
			return true;
		}
		else
		{
			return false;	
		}
		
	}
	@Override
	protected void finalize () {
		System.out.println("Method is called before the garbage collection");
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) {
		ObjectMethods s = new ObjectMethods();
		ObjectMethods s1 = new ObjectMethods();
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s.equals(s1));
		System.out.println(s.getClass());
	    
		System.out.println("End");
		s=null;
		System.gc();
		System.out.println(s);
	}

}
