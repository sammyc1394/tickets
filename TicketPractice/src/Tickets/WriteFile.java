package Tickets;

import java.io.* ;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WriteFile {
	private boolean isFileExist;
	private BufferedWriter bw;
	
	public void fileOpen() {
		try {
			File file = new File(Collections.route);	
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			bw = new BufferedWriter(new FileWriter(file, true));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void headWrite() throws IOException {
		if(isFileExist == false) {
			bw.write(Collections.head);
		} else {
			
		}
	}
	
	public void dataWrite(String[] types, int amount) throws IOException {
		 
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date = sdf.format(cal.getTime());

		// ticketTypeKor, ageTypeKor, discountTypeKor, totalPriceS
		String data = date + "," + types[0] + "," + types[1] + "," + amount + "," + types[3] + "," + types[2];
		bw.newLine(); bw.write(data);
	}
}
