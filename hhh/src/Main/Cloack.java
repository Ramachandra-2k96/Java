package Main;

public class Cloack {

	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double angle = (30 * j + i*30-i*2.5);
                System.out.println("Hour: " + i + ", Minute: " + j*5 + " => Angle: " + angle%360);
            }
            System.out.println("\n\n\n");
        }

	}

}
