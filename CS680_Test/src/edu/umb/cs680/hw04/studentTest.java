package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw05.car;

class studentTest {

	private String[] studentToStringArray(student s) {
		String[] studentInfo = {Float.toString(s.getTuition()), s.getName(), Integer.toString(s.geti20num()), s.getusAddr(),
				Integer.toString(s.getyrsInState()), s.getforeignAddr(), s.getstatus()};
		return studentInfo;
	}
	
	private String[] inStatestudentToStringArray(student s) {
		String[] inStatestudentInfo = {s.getName(), s.getusAddr()};
		return inStatestudentInfo;
	}
	
	@Test
	void verifystudentEqualityWithEverything() {
		String[] expected = {"25000", "Jenna", "N0026883756", "100 Ocean view", "2","Daejeon, South Korea", "Intl"};
		student actual = new student(25000, "Jenna", 3756, "100 Ocean view", 2,"Daejeon, South Korea", Intl);
		assertArrayEquals(expected, studentToStringArray(actual));
	}
	
	@Test
	void verifyinStatestudent() {
		String[] expected = {"Hugo Marbles", "24 Meadow Ln, Lowell"};
		student actual = new student(3000, "Hugo Marbles", 0, null, 1, "24 Meadow Ln, Lowell", inState);
		assertArrayEquals(expected, inStatestudentToStringArray(actual));
	}

}
