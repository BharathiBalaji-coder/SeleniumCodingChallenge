package Week03.Day02;

public class ChildClass extends ParentClass {
	
	public void childBehaviour() {
		System.out.println("Child Character");

	}
	
	public static void main(String[] args) {
		
		
		ChildClass child=new ChildClass();
		child.childBehaviour();
		child.parentBehaviour();

	}

}
