package com.oops.abstraction;

abstract class InstagramFeature {
	public String logoColor = "Pink";
	public String logoFont = "Robota";

	public String photoPost() {
		return "Feature enable to user for Post Picture...";
	}

	public String chat() {
		return "Feature enable to user for Chatting...";
	}

	public String stories() {
		return "Feature enable to user for Post Stories...";
	}

	public abstract String reel();
}

public class AbstractInstaFeature extends InstagramFeature {
	public String reel() {
		System.out.println("Feature enable to user for Reel Post");
		return "logoColor is:" + logoColor + "\nlogoFont is:" + logoFont;
	}

	public static void main(String[] args) {

		InstagramFeature meta = new AbstractInstaFeature();
		System.out.println(meta.reel());
		System.out.println(meta.chat());
		System.out.println(meta.photoPost());
		System.out.println(meta.stories());
	}

}
