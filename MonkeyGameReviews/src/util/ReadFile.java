package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import javax.servlet.ServletContext;

public class ReadFile {
	
	public static void createReviews(ServletContext context, String filename) {
		Scanner scanOut;
		try {
			InputStream is = context.getResourceAsStream(filename);
			if(is != null) {
			scanOut = new Scanner(is);
			while(scanOut.hasNextLine()) {
				Scanner scanIn = new Scanner(scanOut.nextLine());
				scanIn.useDelimiter(",");
				String title = scanIn.next();
				//System.out.println(title);
				String author = scanIn.next();
				//System.out.println(author);
				String genres = scanIn.next();
				//System.out.println(genres);
				Integer score = Integer.valueOf(scanIn.next());
				//System.out.println(score);
				String review = scanIn.next();
				//System.out.println(review);
				scanIn.close();
				UtilDBGamereview.createEntries(title, author, genres, score, review);
			}
			scanOut.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//title,author,genres,score,review
	}
}
