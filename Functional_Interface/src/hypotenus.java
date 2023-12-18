@FunctionalInterface
interface pythagores{
	double find_hypo(int a,int b);
}
public class hypotenus {

	public static void main(String[] args) {
		pythagores p=(int adj,int opp)->{return Math.sqrt(Math.pow(adj, 2)+Math.pow(opp, 2));};
		System.out.print(p.find_hypo(5, 12));
	}

}
