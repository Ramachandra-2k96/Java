package Main;

public class Cloack {

	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
            	String time1 =String.valueOf(9+i)+ ":"+String.valueOf(j*5)+" -> ";
                double angle = (90- 30 * i + j*30 - j *2.5);
                System.out.println(time1+Math.abs(angle%360));
            }
            System.out.println("\n\n");
        }

	}

}
