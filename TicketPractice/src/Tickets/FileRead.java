package Tickets;

import java.io.*;
import java.util.*;

public class FileRead {
	private BufferedReader br;
	
	public void fileOpen() {
		try { 
			File file = new File(Collections.route);
			br = new BufferedReader(new FileReader(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String[][] getData() throws IOException {
		String readtxt;
		ArrayList<String> datas = new ArrayList<String>();

		if((readtxt = br.readLine()) == null) {
			System.out.println("빈 파일입니다");
		}
		
		while((readtxt = br.readLine()) != null) {
			datas.add(readtxt);
		}
		
		String[][] actDatas = new String[datas.size()][];
		
		for(int i = 0; i < datas.size(); i++) {
			actDatas[i] = datas.get(i).split(",");
		}
		
		for(int i = 0; i < actDatas.length; i++) {
			for(int j = 0; j < actDatas[i].length; j++) {
				System.out.print(actDatas[i][j]);
			}
			System.out.println("");
		}
		
		return actDatas;
	}
}
