package com.automibile.twowheler;

import com.automobile.Vehicle;

public class Hero extends Vehicle
{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "hero splenderplus";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "Ap 37 BP 1008 ";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "satya";
	}
	public float getspeed()
	{
		return 45.9f;
	}
	public void radio()
	{
		System.out.println("radio is not available ");
	}
	}


