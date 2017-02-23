
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class hash2017 {

    static int ROWS, COLUMNS;
    static char[][] pizza;
    public static String FILENAME = "small.in";
    
    public static void main(String[] arg){
	
	BufferedReader br = null;
	FileReader fr = null;

	try {

	    fr = new FileReader(FILENAME);
	    br = new BufferedReader(fr);


	    br = new BufferedReader(new FileReader(FILENAME));

	    String info = br.readLine();
	    String words[] = info.split(" ");
	    ROWS = Integer.parseInt(words[0]);
	    COLUMNS = Integer.parseInt(words[1]);
	    pizza = new char[ROWS][COLUMNS];	    

	    int i = 0;
	    String row;
	    while ((row = br.readLine()) != null) {
		pizza[i] = row.toCharArray();
		i++;
		
	    }

	} catch (IOException e) {

	    e.printStackTrace();

	} finally {

	    try {

		if (br != null)
		    br.close();

		if (fr != null)
		    fr.close();

	    } catch (IOException ex) {

		ex.printStackTrace();

	    }

	}

    }

}
