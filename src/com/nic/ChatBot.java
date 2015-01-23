package com.nic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatBot
{
	private String userResponse;

	public static void main(String[] args) throws IOException
	{
		ChatBot frank = new ChatBot();
		frank.letsChat();
	}

	public void letsChat() throws IOException
	{

		do
		{
			listenForSomeoneToSaySomethingToMe();
			saySomethingBack();
		} while (true);
	}

	private void listenForSomeoneToSaySomethingToMe() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Say something to the chatbot:");
		userResponse = br.readLine();
	}

	private void saySomethingBack()
	{
		System.out.println("sup");
		System.out.println("you just said: " + userResponse);
	}
}
