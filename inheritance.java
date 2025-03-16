interface vehicle{
	void start();
	void stop();
}
class Car implements vehicle
{
	public void start()
	{
		System.out.println("Car started.");
	}
	public void stop()
	{
		System.out.println("Car stoped.");
	}
}
class Bike implements vehicle
{
	public void start()
	{
		System.out.println("Bike started.");
	}
	public void stop()
	{
		System.out.println("Bike stoped.");
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Bike bike = new Bike();
		car.start();
		car.stop();
		bike.start();
		bike.stop();
	}

}
