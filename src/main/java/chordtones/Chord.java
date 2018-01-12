package chordtones;;


public class Chord {
	
	private String name;
	private String root;
	private String third;
	private String fifth;
	private String seventh;
	private String ninth;

	public Chord(String name, String root, String third, String fifth, String seventh) {
		this.name = name;
		this.root = root;
		this.third = third;
		this.fifth = fifth;
		this.seventh = seventh;
	}
	
	public Chord(String name, String root, String third, String fifth, String seventh, String ninth) {
		this.name = name;
		this.root = root;
		this.third = third;
		this.fifth = fifth;
		this.seventh = seventh;
		this.ninth = ninth;
	}

	public void setNotes(String name, String root, String third, String fifth, String seventh, String ninth) {
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
	
	public String getRoot()	{
		return root;
	}
	
	public String getThird() {
		return third;
	}
	
	public String getFifth() {
		return fifth;
	}
	
	public String getSeventh() {
		return seventh;
	}
	
	public String getNinth() {
		return ninth;
	}
	
	

	public String getNotes() {
		return "Root: " + root + ", third: " + third + ", fifth: " + fifth + ", seventh: " + seventh + ", ninth: " + ninth;
	}
	
	
	
	public boolean equals(Object obj) {
			if ( !(obj instanceof Chord) ) return false;
			return name.equals(((Chord)obj).name);
			
	}
	

}






