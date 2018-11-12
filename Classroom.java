public class Classroom{
	public static void main(String[] args) {
		Wilder florent = new Wilder("Florent", true);
		System.out.println(florent.getFirstname());
		System.out.println(florent.whoAmI());

		Wilder franck = new Wilder("Franck", false);
		franck.setFirstname("Franck Martinez");
		System.out.println(franck.whoAmI());
	}
}
