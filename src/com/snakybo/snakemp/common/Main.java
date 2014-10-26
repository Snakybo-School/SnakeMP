package com.snakybo.snakemp.common;

import com.snakybo.sengine2d.core.SEngine2D;
import com.snakybo.sengine2d.rendering.Window;

public class Main {
	public static final String VERSION = "0.95 Beta";
	
	private static SEngine2D engine;
	private static Window window;
	
	public static void main(String[] args) throws Exception {
		final String javaVersion = Runtime.class.getPackage().getImplementationVersion();
		
		if(!javaVersion.startsWith("1.8")) {
			System.err.println("You need Java 8 to run this application! (http://java.com/en/download/manual.jsp)");
			System.exit(1);
		}
		
		window = new Window(1280, 720, "Snake Multiplayer");
		engine = new SEngine2D(window, new SnakeMP());
		
		window.create();
		engine.start();
	}
	
	public static void stop() {
		engine.stop();
		window.destroy();
	}
	
	public static Window getWindow() {
		return window;
	}
}
