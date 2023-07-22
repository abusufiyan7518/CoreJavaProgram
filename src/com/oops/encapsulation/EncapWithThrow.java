package com.oops.encapsulation;

import java.util.Scanner;

class FollowerNotFoundException extends RuntimeException {
	public FollowerNotFoundException(String message) {
		super(message);
	}
}

class Instagram {
	private String username;
	private int followers;

	public Instagram(String username, int followers) throws FollowerNotFoundException {
		if (followers <= 0) {
			throw new FollowerNotFoundException("new id...");
		} else {
			System.out.println("real id...");
		}
		this.username = username;
		this.followers = followers;
	}

	public String getUsername() {
		return username;
	}

	public int getFollowers() {
		return followers;
	}
}

public class EncapWithThrow {
	private static Scanner scanner = new Scanner(System.in);
	private static Instagram instagram;

	public static void main(String[] args) {
		System.out.println("Enter your username...");
		String username = scanner.nextLine();
		try {
			System.out.println("Enter your followers...");
			int followers = scanner.nextInt();
			instagram = new Instagram(username, followers);
			System.out.println(
					"Username : " + instagram.getUsername() + " " + "\nFollowers : " + instagram.getFollowers());
		} catch (FollowerNotFoundException e) {
			e.printStackTrace();
		}
	}
}
