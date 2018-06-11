package upb.dice.ida;

public class InputDataRecord {

	private int id;
	private String label;
	private int group;

	public InputDataRecord(int id, String label, int group) {
		super();
		this.id = id;
		this.label = label;
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "InputDataRecord [id=" + id + ", label=" + label + ", group=" + group + "]";
	}

}
