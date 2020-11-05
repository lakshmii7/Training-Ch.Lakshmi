
public class SplitStringexmple {
public static void main(String[] args) {
	String position="Lakshmi@Chebrolu";
	String[] splitposition=position.split("@",2);
	for(String a:splitposition)
		System.out.println(a);
}
}
