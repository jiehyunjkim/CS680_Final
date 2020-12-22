package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class FSElementTest {
	
	private String dirToStringArray(Directory d) {
		String[] dirInfo = {d.isDirectory(), d.getName(), Integer.toString(d.getsize(), d.getCreationTime()), 
				d.getParent().getName(),d.countChildren()};
		return dirInfo;
	}

	@Test
	public void verifyDirectoryEqualityRoot() {
		String[] expected = {"root", "file", 50, 2020-12-25};
		Directory actual = new Directory("root", "file", 50, 2020-12-25);
		assertArrayEquals(expected, dirToStringArray(actual));
	}
	

}
