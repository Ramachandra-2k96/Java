@FunctionalInterface
interface function{
	int add(int a,int b);
}

public class functional_i {
	public static void main(String[] args) {
		function f=(int a,int b)->{return a+b;};
		System.out.print(f.add(3, 7));
	}

}
