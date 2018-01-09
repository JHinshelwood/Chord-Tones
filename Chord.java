public class Chord {
	
	private String name;
	private String root;
	private String third;
	private String fifth;
	private String seventh;
	private String ninth;

	public Chord(String name, String root, String third, String fifth, String seventh, String ninth) {
		this.name = name;
		this.root = root;
		this.third = third;
		this.fifth = fifth;
		this.seventh = seventh;
		this.ninth = ninth;
	}

	public String getName() {
		return name;
	}

	public String getNotes() {
		return "Root: " + root + ", third: " + third + ", fifth: " + fifth + ", seventh: " + seventh + ", ninth: " + ninth;
	}
}