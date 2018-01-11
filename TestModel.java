import java.util.Observable;

public class TestModel {
	private int value;
	
	public TestModel() {
		value = 1;
	}
	public String getValue() {
		return String.valueOf(value);
	}
	
	@SuppressWarnings("deprecation")
	public void setValue(int value2) {
		value = value2;
	
	}
}
