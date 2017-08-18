package victor.training.oo.structural.adapter;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class AdaptersInJdk {
	public static void main(String[] args) {
		// 2
		String array[] = new String[] { "a", "b", "c" };
		List<String> list = Arrays.asList(array);
		businessCodeWithList(list);

		// 3
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		PrintWriter writer = new PrintWriter(buffer);

		writer.println("Text with endline");
		writer.close();
		System.out.println("In buffer = '" + buffer.toString() + "'");
	}
	
	private static void businessCodeWithList(List<String> list) {
		System.out.println("Arrays as List: " + list);
	}
}
