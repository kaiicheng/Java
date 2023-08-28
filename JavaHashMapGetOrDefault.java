import java.util.HashMap;

public class JavaHashMapGetOrDefault {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Name", "cookie");
		map.put("Age", "18");
		map.put("Sex", "Female");
		System.out.println(map);
		
		// "Name" in the map, so get "cookie"
		String name = map.getOrDefault("Name", "random");		
		System.out.println(name);
		System.out.println(map);

		// "Score" not in the map, so get "80"
		String score = map.getOrDefault("Score", "Not Found");
		System.out.println(score);
		System.out.println(map);
		
	}
}
