import java.util.HashMap;
import java.util.Map;

public class MovieSelection {
	
	public boolean flightMovie(int movieDuration[], int lengthOfFlight) {
		
		// create a HashMap to store movie and duration
		Map<Integer, Integer> map = new HashMap<>();
		
		// iterate through the array and fill the HashMap
		for (int i = 0; i < movieDuration.length; i++) {
			map.put(movieDuration[i], i);
		}
		
		// iterate through the array, check whether there are two numbers in $movieDuration array whose sum equals $lengthofFlight
		for (int i = 0; i < movieDuration.length; i++) {
			int duration = lengthOfFlight - movieDuration[i];
			
			if (map.containsKey(duration) && map.get(duration) != i) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieSelection movies = new MovieSelection();
		int movieDuration[] = {90, 50, 75, 80, 99, 60}; 
		System.out.println(movies.flightMovie(movieDuration, 2));
	}
}