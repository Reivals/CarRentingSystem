package validationTests;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import model.DataValidation;

public class DataValidationTest {

	@Test
	public void nameInputValidationTest() {
		ArrayList<String> array = new ArrayList<String>();
		array.addAll(Arrays.asList("Michal","Ania","Karolina","Monika","Adam","Jeremiasz","Robert","Tomasz","Tomek","Kasia","Katarzyna","Grzegorz","Beata"));
		for(String data : array)
		{
		DataValidation.validName(data);
		}
	}
	@Test
	public void surnameInputValidationTest() {
		ArrayList<String> array = new ArrayList<String>();
		array.addAll(Arrays.asList("Karkowski","Tomahla","Nowak","Kowalski","Poloczek","Tys","Nowakowski"));
		for(String data : array)
		{
		DataValidation.validSurname(data);
		}
	}
	@Test
	public void streetInputValidationTest() {
		ArrayList<String> array = new ArrayList<String>();
		array.addAll(Arrays.asList("Kozielska","Botnicka","Chorzowska","Zimnej Wody","Cesarska","Abdullaha","Nieziemska","NIEZIEMSKA","NiEzIeMSka","Ksiezycowa","Ostropca","Lewa","Prawa"));
		for(String data : array)
		{
		DataValidation.validStreet(data);
		}
	}
	@Test
	public void cityInputValidationTest() {
		ArrayList<String> array = new ArrayList<String>();
		array.addAll(Arrays.asList("Gliwice","Berlin","Paryz","Warszawa","Chorzow","Zabrze","Jerzmiecice","Skalka","Kielce","Tam","Wielkie Kamieniolomy"));
		for(String data : array)
		{
		DataValidation.validCity(data);
		}
	}
	@Test
	public void localNumberInputValidationTest() {
		ArrayList<String> array = new ArrayList<String>();
		array.addAll(Arrays.asList("22/13"));
		for(String data : array)
		{
		DataValidation.validLocalNumber(data);
		}
	}

}
