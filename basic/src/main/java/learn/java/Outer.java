package learn.java;

public class Outer {
	
	int x = 0;
	
	class InnerWithDefaultScope {
		
		public void changeX(){
			x++;
		}
		
	}
	
	public class Inner {
		
		public void changeX(){
			x++;
		}
		
	}
	
	public static class InnerStatic {
		
	}
	
	public Inner returnInner(){
		Inner inner = new Inner();
		inner.changeX();
		return inner;
	}
	
	public InnerWithDefaultScope returnInnerWithDefaultScope(){
		InnerWithDefaultScope inner = new InnerWithDefaultScope();
		inner.changeX();
		return inner;
	}
	
}
