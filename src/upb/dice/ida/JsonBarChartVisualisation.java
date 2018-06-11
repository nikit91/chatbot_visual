package upb.dice.ida;

import java.util.ArrayList;

public class JsonBarChartVisualisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputDataRecord node1 = new InputDataRecord(1, "Paris", 1);
		InputDataRecord node2 = new InputDataRecord(2, "London", 2);
		InputDataRecord node3 = new InputDataRecord(3, "Berlin", 2);
		InputDataRecord node4 = new InputDataRecord(4, "Tokyo", 3);
		
		ArrayList<InputDataRecord> inputDataSet = new ArrayList<InputDataRecord>();
		inputDataSet.add(node1);
		inputDataSet.add(node2);
		inputDataSet.add(node3);
		inputDataSet.add(node4);
		
		System.out.println(inputDataSet.get(0).toString());
		
		ArrayList<InputDataRecord> group1Array = new ArrayList<InputDataRecord>();
		group1Array.add(node1);
		OutputRecordData output = new OutputRecordData(1,group1Array);
		System.out.println(output);
		
		/*
		for(InputDataRecord data : inputDataSet) {
			
			
		}
		*/	
		/*
		for(InputDataRecord inputDataSet : var) {
			System.out.println(myvalue.to);
		}
		*/
		
		
		System.out.println("output = "+ node1.toString());
	}

}
