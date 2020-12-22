package edu.umb.cs680.hw06;

interface State{
	public State openCloseButtonPushed();
	public State playButtonPushed();
	public State stopButtonPushed();
	public void open();
	public void close();
	public void play();
	public void stop();
}


public class dvd implements State{
	private dvd() {}
	private static dvd player = null;
	
	private State state;

	public State getState() {
	    return state;
	}

	public static dvd getInstance(State stateParameter) {
	    if(player == null)
	    {   
	        player = new dvd();
	        player.state = DrawerClosedNotPlaying.getInstance();
	    }
	    else 
	        player.state = stateParameter;
	    return player;      
	}

	public void changeState(State newState) {
	    this.state=newState;        
	}
	public State openCloseButtonPushed(){
	    state.openCloseButtonPushed();
	    return state;
	}

	public State playButtonPushed() {
	    state.playButtonPushed();
	    return state;
	}

	public State stopButtonPushed() {
	    state.stopButtonPushed();
	    return player.state;
	}
	public void open() {
	    System.out.println("DVD Player is opened");
	}
	public void close() {
	    System.out.println("DVD Player is closed");

	}
	public void play() {
	    System.out.println("DVD Player is playing");
	}   
	public void stop() {
	    System.out.println("DVD Player is stopped");
	}
	
	
	//DrawerOpen
	public class DrawerOpen{

		private dvd player = dvd.getInstance(DrawerOpen.getInstance());

		private static final State state;
		
		private DrawerOpen() {}

		public static State getInstance() {
		    if(state == null)
		        state = new DrawerOpen();
		    return state;
		}


		@Override
		public void openCloseButtonPushed() {
		    player.close();
		    player.changeState(DrawerClosedNotPlaying.getInstance());
		}

		@Override
		public void playButtonPushed() {
			player.close();
			player.play();
			player.changeState(DrawerClosedPlaying.getInstance());

		}

		@Override
		public void stopButtonPushed() {}
	}
	
	
	//DrawerClosedPlaying
	public class DrawerClosedPlaying{

		private dvd player = dvd.getInstance(DrawerClosedPlaying.getInstance());

		private static State state;

		private DrawerClosedPlaying() {}

		public static State getInstance() {
		    if(state == null)
		        state = new DrawerClosedPlaying();
		    return state;
		}


		@Override
		public void openCloseButtonPushed() { 
			player.changeState(DrawerOpen.getInstance());
			player.stop();
			player.open();
		}

		@Override
		public void playButtonPushed() {}

		@Override
		public void stopButtonPushed() { 
			player.stop();
			player.changeState(DrawerClosedNotPlaying.getInstance());
		}
	}

	
	//DrawerClosedNotPlaying
	public class DrawerClosedNotPlaying{

		private dvd player = dvd.getInstance(DrawerClosedNotPlaying.getInstance());

		private static State state;

		private DrawerClosedNotPlaying() {}

		public static State getInstance() {
		    if(state == null)
		        state = new DrawerClosedNotPlaying();
		    return state;
		}


		@Override
		public void openCloseButtonPushed() { 
			player.open();
			player.changeState(DrawerOpen.getInstance());
		}

		@Override
		public void playButtonPushed() {
			player.changeState(DrawerClosedPlaying.getInstance());
			player.play();
		}

		@Override
		public void stopButtonPushed() {}
	}
}
