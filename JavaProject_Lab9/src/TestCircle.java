
public class TestCircle {

	public static void main(String[] args) {
		// Test all constructors and thString()
		Circle c1 = new Circle(1.1,"blue");//call 3rd constructors
		System.out.println(c1);
		System.out.println();
		
		Circle c2 = new Circle(2.2);//2nd constructors
		System.out.println(c2);
		System.out.println();
		
		Circle c3 = new Circle();//1nd constructors
		System.out.println(c3);
		System.out.println();
		
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println(c1);
		System.out.println("The radius of c1 is :"+c1.getRadius());
		System.out.println("The color of c1 is :"+c1.getColor());
		
		//test get area and get circumference
		System.out.printf("The area is: %.2f%n",c1.getArea() );
		System.out.printf("The circumference is: %.3f", c1.getCirclecumference());
	}

}
