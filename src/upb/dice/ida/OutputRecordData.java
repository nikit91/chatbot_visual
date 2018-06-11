package upb.dice.ida;

import java.util.ArrayList;

public class OutputRecordData {
	int groupId;
	ArrayList<InputDataRecord> output;

	public OutputRecordData(int groupId, ArrayList<InputDataRecord> output) {
		super();
		this.groupId = groupId;
		this.output = output;
	}

	public ArrayList<InputDataRecord> getOutput() {
		return output;
	}

	public void setOutput(ArrayList<InputDataRecord> output) {
		this.output = output;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "OutputRecordData [groupId=" + groupId + ", output=" + output + "]";
	}

}