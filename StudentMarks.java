import java.util.Scanner;
class StudentMarks{
    public static String[][] stArray = new String[0][2];

	public static int[][] stMarksArray = new int[0][4];

	public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}