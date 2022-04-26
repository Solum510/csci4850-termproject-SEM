package util;

import java.util.Scanner;

public class ReadFile {
	static String filepath = "reviews.csv";
	
	public static void createReviews() {
		Scanner scanOut = new Scanner(filepath);
		//title,author,genres,score,review
		while(scanOut.hasNextLine()) {
			Scanner scanIn = new Scanner(scanOut.nextLine());
			scanIn.useDelimiter(",");
			String title = scanIn.next();
			String author = scanIn.next();
			String genres = scanIn.next();
			int score = scanIn.nextInt();
			String review = scanIn.next();
			scanIn.close();
			UtilDBGamereview.createEntries(title, author, genres, score, review);
		}
		scanOut.close();
	}
}
