package model;

import java.time.LocalDate;

public class Deal {
	private static int counter=0;
	private int id;
	private Car car;
	private Customer customer;
	private LocalDate begin;
	private LocalDate end;
	
	
	public Deal()
	{}
	
	public Deal(Car car, Customer customer,LocalDate begin,LocalDate end) {
		this.car = car;
		this.customer = customer;
		id=counter;
		this.begin = begin;
		this.end = end;
		
		counter++;
	}


	public Car getCar() {
		return car;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	@Override
	public String toString()
	{
		return "Umowa nr: #"+id+". Auto marki: "+car.getBrand()+", Nazwisko: "+customer.getSurname()+", od "+begin+" do "+end;
	}

	public int getId() {
		return id;
	}
	
	

}
