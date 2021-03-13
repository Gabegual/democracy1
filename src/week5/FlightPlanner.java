package week5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import acm.program.ConsoleProgram;
import acm.util.ErrorException;

public class FlightPlanner extends ConsoleProgram {

	private HashMap<String, ArrayList<String>> flights;
	private ArrayList<String> enteredCities = new ArrayList<String>();
	private String firstCity;

	public void run() {

		Welcome();

	}

	private void Welcome() {
		println("Welcome to Flight Planner");
		readFlightData("FlightPlanner");
		println("Here is a list of all the Cities in our database");
		printCityList(enteredCities);
		println("Lets plan a round-trip route!");
		String startCity = readLine("Enter the starting city: ");
		ArrayList<String> route = new ArrayList<String>();
		route.add(startCity);
		String currentCity = startCity;
		while (true) {
			String nextCity = askForFirstCity(currentCity);
			route.add(nextCity);
			if (nextCity.equals(startCity)) {
				currentCity = nextCity;
				break;
			}
			printFinalRoute(route);
		}
	}

	private String askForFirstCity(String city) {
		ArrayList<String> destinations = getDestinations(enteredCities);
		String nextCity = null;
		while (true) {
			println("From" + enteredCities + "you can fly directlyto: ");
			printCityList(destinations);
			String prompt = ("Where do you want to depart from" + enteredCities + "?");
			nextCity = readLine(prompt);
			if (destinations.contains(nextCity)) {
				break;
				println("you can`t get to the city by direct flight.");
			}
			return nextCity;
		}
	}

	private ArrayList<String> getDestinations(String fromCity) {
		return flights.get(fromCity);

	}

	private void printCityList(ArrayList<String> cityList) {
		for (int i = 0; i < cityList.size(); i++) {
			String city = cityList.get(i);
			println(" " + city);
		}
	}

	private void printFinalRoute(ArrayList<String> route) {
		println("The route you`ve chosen is: ");
		for (int i = 0; i < route.size(); i++) {
			if (i > 0) {
				print(" -> ");
				print(route.get(i));
			}
			print(route.get(i));
		}

	}

	private void readFlightData(String filename) {
		flights = new HashMap<String, ArrayList<String>>();
		enteredCities = new ArrayList<String>();
		try {
			BufferedReader FlightPlanner = new BufferedReader(new FileReader(filename));
			while (true) {
				String line = FlightPlanner.readLine();
				if (line == null) {
					break;
				} else if (line.length() != 0) {
					readFilghtEntry(line);
					;
				}
			}
			FlightPlanner.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
	}

	private void readFilghtEntry(String line) {
		int arrow = line.indexOf("->");
		if (arrow == -1) {
			throw new ErrorException("Illegal Flight Entry" + line);
		}
		String fromCity = line.substring(0, arrow).trim();
		String toCity = line.substring(arrow + 2).trim();
		defineCity(fromCity);
		defineCity(toCity);
		getDestinations(fromCity).add(toCity);
	}

	private void defineCity(String cityName) {
		if (!enteredCities.contains(cityName)) {
			enteredCities.add(cityName);
			flights.put(cityName, new ArrayList<String>());
		}
	}

}
