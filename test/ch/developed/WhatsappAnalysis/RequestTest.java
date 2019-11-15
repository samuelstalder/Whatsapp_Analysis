package ch.developed.WhatsappAnalysis;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RequestTest {
	
	static List<Message> messageList;
	static Request request;
	
	@BeforeAll
	static void init() {
		Import imp = new Import();
		String slimDataSetFilePath = "..\\3.txt";
		try {
			messageList = imp.precessFileData(slimDataSetFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		request = new Request(messageList);
	}

	
	//tests based on a specific chat (Group-chat android whatsapp)
	@Test
	void namesInSlimDataSet() {
		HashMap<String, Integer> nameList = request.usernames();
		boolean containsName = nameList.containsKey("~alina");
		assertTrue(containsName);
	}
	
	@Test
	void analysisWithSlimDataSet() {
		
	}
	
	@Test
	void searchWordInSlimDataSet() {
		
	}
	
	@Test
	void timespanInSlimDataSet() {
		
	}
	
	@Test
	void timetableInSlimDataSet() {
		
	}
	
	@Test
	void timetableInSlimDataSetPersonSpecific() {
		
	}
}
