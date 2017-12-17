
public class Main {

	public static void main(String[] args) {

		String name = "kevin_castro";

		String[] parts = name.split("_");
		String part1 = parts[0];
		String part2 = parts[1];

		String camelLast = part2.substring(0, 1).toUpperCase() + part2.substring(1);

		System.out.println(part1 + camelLast);

	}

}
