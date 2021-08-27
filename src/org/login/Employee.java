package org.login;

//Class
public class Employee {

	public static void main(String[] args) {
		String s = "welcome java in greens technology";

		String[] split = s.split(" ");
		String output = "";
		for (int i = 0; i < split.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < split.length; j++) {
					String string = split[j];
					output = output + string;
				}
			} else {

				output = output + split[i];

			}
			output = output + " ";
		}
		System.out.println(output);
		System.out.println("worked");
	}

}
