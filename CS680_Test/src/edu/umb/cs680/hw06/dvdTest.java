package edu.umb.cs680.hw06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw06.dvd.DrawerClosedNotPlaying;
import edu.umb.cs680.hw06.dvd.DrawerClosedPlaying;
import edu.umb.cs680.hw06.dvd.DrawerOpen;

class dvdTest {

	@Test
	void opendrawertest() {
		dvd player = dvd.getInstance(DrawerOpen.getInstance());
		State expected = DrawerClosedNotPlaying.getInstance();
		State actual = player.openCloseButtonPushed();
		assertEquals(expected, actual);
	}
    @Test
    void closedplayingtest() {
    	dvd player = dvd.getInstance(DrawerClosedPlaying.getInstance());
		State expected = DrawerClosedPlaying.getInstance();
		State actual = player.playButtonPushed();
		assertEquals(expected, actual);
    }
    
    @Test
    void closednotplayingtest() {
    	dvd player = dvd.getInstance(DrawerClosedNotPlaying.getInstance());
		State expected = DrawerClosedNotPlaying.getInstance();
		State actual = player.stopButtonPushed();
		assertEquals(expected, actual);
    }
}
