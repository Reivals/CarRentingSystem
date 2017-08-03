package model;

import java.util.regex.Pattern;

public class DataValidation {
	/*<----------------------------BEGIN OF CUSTOMER'S VALIDATION--------------------------------------------------------------->*/
	public static boolean validName(String name)
	{
		return Pattern.matches("[a-zA-Z]{5,20}", name);
	}
	public static boolean validSurname(String surname)
	{
		return Pattern.matches("[a-zA-Z]{3,25}", surname);
	}
	public static boolean validCity(String city)
	{
		return Pattern.matches("[a-zA-Z]{4,25}", city);
	}
	public static boolean validPostCode(String postCode)
	{
		return Pattern.matches("[0-9]{2}-[0-9]{3}", postCode);
	}
	public static boolean validStreet(String street)
	{
		return Pattern.matches("[a-zA-Z]{3,20}", street);
	}
	public static boolean validLocalNumber(String localNumber)
	{
		return Pattern.matches("[1-9]{1,3}[a-zA-Z]{0,1}/{0,1}[1-9]{0,3}", localNumber);
	}
	/*<----------------------------END OF CUSTOMER'S VALIDATION--------------------------------------------------------------->*/
	
	
	/*<----------------------------BEGIN OF CAR'S VALIDATION-------------------------------------------------------------------->*/
	public static boolean validBrand(String brand)
	{
		return Pattern.matches("[a-zA-Z]{3,15}", brand);
	}
	public static boolean validEngine(String engine)
	{
		return Pattern.matches("[a-zA-Z0-9]{3,10}", engine);
	}
	public static boolean validPower(String power)
	{
		return Pattern.matches("[1-9]{1}[0-9]{2}", power);
	}
	public static boolean validNavi(String navi)
	{
		return Pattern.matches("[Yes]{0,1}[No]{0,1}", navi);
	}
	public static boolean validAvaliable(String avaliable)
	{
		return Pattern.matches("[Yes]{0,1}[No]{0,1}", avaliable);
	}
	public static boolean validDateOfProduction(String date)
	{
		return Pattern.matches("[0-9]{4}[-]{1}[0-9]{2}[-]{1}[0-9]{2}", date);
	}
	/*<----------------------------END OF CAR'S VALIDATION-------------------------------------------------------------------->*/

}
