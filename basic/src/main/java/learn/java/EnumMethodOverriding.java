package learn.java;

public enum EnumMethodOverriding {

	CONSTANT_1 {
		@Override
		public void printMe() {
			System.out.println("I am Constant 1");

		}
	},
	CONSTANT_2 {
		@Override
		public void printMe() {
			System.out.println("I am Constant 2");

		}
	},
	CONSTANT_3

	{
		@Override
		public void printMe() {
			System.out.println("I am Constant 3");

		}
	};
	public abstract void printMe();

}
