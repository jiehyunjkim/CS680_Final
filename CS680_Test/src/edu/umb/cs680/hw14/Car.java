package edu.umb.cs680.hw14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Car {
	private int mileage;
	private int year;
	private int price;
	
	private int dominationCount;
	private int count;
	
	public Car(int mileage, int year, int price) {
		this.mileage = mileage;
		this.year = year;
		this.price = price;
	} 
	
	public int getPrice() {
		return price;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public int getDominationCount() {
		return dominationCount;
	}
	
	public void setDominationCount(int cnt) {
		this.count = cnt;
	}
		
	public class PriceComparator implements Comparator<Car>{
			public int compare(Car car1, Car car2){
				return car2.getPrice() - car1.getPrice();
		}
	}
	
	public class YearComparator implements Comparator<Car>{
			public int compare(Car car1, Car car2){
				return car1.getYear() - car2.getYear();
		}
	}
	
	public class MileageComparator implements Comparator<Car>{
		public int compare(Car car1, Car car2){
			return car2.getMileage() - car1.getMileage();
		}
	}
	
	public class ParetoComparator implements Comparator<Car>{
		public int compare(Car car1, Car car2){
			return car2.getDominationCount() - car1.getDominationCount();
		}
	}
	
	public void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<>();
		
		carList.add(new Car(20000, 2017, 25000));
		carList.add(new Car(30000, 2019, 38000));
		
		Collections.sort(carList, Comparator.comparing((Car car) -> car.getMileage()));
		Collections.sort(carList, (Car car1, Car car2) -> (int)car2.getMileage() - car1.getMileage());
		
		Collections.sort(carList, Comparator.comparing((Car car) -> car.getYear()));
		Collections.sort(carList, (Car car1, Car car2) -> (int)car2.getYear() - car1.getYear());
		
		Collections.sort(carList, Comparator.comparing((Car car) -> car.getPrice()));
		Collections.sort(carList, (Car car1, Car car2) -> (int)car2.getPrice() - car1.getPrice());
		
		Collections.sort(carList, Comparator.comparing((Car car) -> car.getDominationCount()));
		Collections.sort(carList, (Car car1, Car car2) -> (int)car2.getDominationCount() - car1.getDominationCount());
	}
	
}