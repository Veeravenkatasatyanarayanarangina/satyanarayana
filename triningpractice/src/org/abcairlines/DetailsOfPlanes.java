package org.abcairlines;

abstract class Airoplane
{
	abstract void speed();//abstract method
	abstract void capasity();
	abstract void modeOfUse();
	//concrete method because route is same for two flights 
	 void route()
	 {
		 System.out.println("it will be trvells hyderabad to russia....");
	 }                                                                                           
	
}
class Airbus_A380 extends Airoplane
{
	void speed() 
	{
		System.out.println("Airbus_A380 airbus top speed is 1,185 km/h");
	}	
	void capasity() {
		System.out.println("Airbus-A380 maximum capasity is 853 passengers........");
	}
	void modeOfUse() {
		System.out.println("passenger travel.............");
	}
	
}
class Anthov_An225 extends Airoplane
{
	void speed() 
	{
		System.out.println("Anthov_An225 airbus top speed is 850 km/h");
	}	
	void capasity() {
		System.out.println("Anthov_An225's corgo capasity is 1,100 cubic metrics");
	}
	void modeOfUse() {
		System.out.println("Goods carrier...........");
	}
	
}

public class DetailsOfPlanes 
{
	public static void main(String[] args)
	{
		Airoplane airoplane =new Airbus_A380();
		airoplane.route();
		airoplane.speed();
		airoplane.modeOfUse();
		airoplane.capasity();
		System.out.println("=========================");
		airoplane = new Anthov_An225();
		airoplane.route();
		airoplane.speed();
		airoplane.modeOfUse();
		airoplane.capasity();
		
		
	}
	

}
