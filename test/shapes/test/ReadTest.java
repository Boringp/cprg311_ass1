package shapes.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Clock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import shapes.*;
import driver.*;
import sorting.*;
class ReadTest {
	private Shape shapes[];
	
	@BeforeEach
	void setUp() throws Exception {
		String filePath = "res/polyfor3.txt";
		this.shapes= readDriver.readFile(filePath);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.shapes =null;
	}
	

	
	
	@Test
	void insertionSortTest() {
		Clock clock = Clock.systemDefaultZone();
		long start = clock.millis();
		Arraysorts.bubbleSort(shapes);
		long end=clock.millis();
		System.out.println("time used: "+(end-start));
		assertTrue(Arraysorts.isSorted(shapes));
		for(int i=0;i<this.shapes.length;i=i+1000) {
			System.out.println(shapes[i].getHeight());}
	}

}
