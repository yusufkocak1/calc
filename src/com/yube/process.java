package com.yube;

import java.sql.Array;
import java.util.ArrayList;

public class process implements calculator {
	ArrayList<contact> list = new ArrayList<>();

	public process(String text) {
		// TODO Auto-generated constructor stub
		calcframe.procscreen.setText(String.valueOf(processor(splitter(text))));
	}

	@Override
	public ArrayList<contact> splitter(String procText) {
		// TODO Auto-generated method stub
		String[] operator = new String[10];
		list.clear();
		String[] parts = procText.split("[-+*/=]");
		String[] parts2 = procText.split("");
		int i = 1;
		operator[0] = "e";

		for (String string : parts2) {
			if (string.equals("/") || string.equals("*") || string.equals("-")
					|| string.equals("+")) {
				operator[i] = string;
				i++;
			}
		}
		i = 0;
		for (String string : parts) {
			list.add(new contact(Double.parseDouble(string), operator[i]
					.charAt(0)));
			i++;
		}
		System.out.println(parts[0] + "\n" + operator[0]);

		return list;
	}

	@Override
	public double processor(ArrayList<contact> data) {
		int size = data.size();

		for (int i = 0; i + 1 < size; i++)
			switch (data.get(i + 1).getOperator()) {
			case '/':
				data.get(i).setNumber(
						data.get(i).getNumber() / data.get(i + 1).getNumber());
				data.remove(i + 1);
				size--;
              break;
				
	
				

			}for (int i = 0; i + 1 < size; i++)
				switch (data.get(i + 1).getOperator()) {
				
					
				case '*':
					data.get(i).setNumber(
							data.get(i).getNumber() * data.get(i + 1).getNumber());
					data.remove(i + 1);
					size--; 
	              break;
					

				}

		for (int i = 0; i + 1 < size; i++)
			switch (data.get(i + 1).getOperator()) {
			case '-':
				data.get(i).setNumber(
						data.get(i).getNumber() - data.get(i + 1).getNumber());
				data.remove(i + 1);
				size--;
				break;

			}
		for (int i = 0; i + 1 < size; i++)
			switch (data.get(i + 1).getOperator()) {
			case '+':
				data.get(i).setNumber(
						data.get(i).getNumber() + data.get(i + 1).getNumber());
				data.remove(i + 1);
				size--;
				

			}

		
		return data.get(0).number;
	}

}
