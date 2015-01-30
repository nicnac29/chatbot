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
		} while (!"bye".equals(userResponse));
		System.out.println("adios muchachos");
	}

	private void listenForSomeoneToSaySomethingToMe() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Say something to the chatbot:");
		userResponse = br.readLine();
	}

	private void saySomethingBack()
	{
		if (userResponse.contains("how are you"))
		{
			System.out.println("I am good how bout you");
		}
		
		if(userResponse.contains("school sucks"))
		{
			System.out.println("i know right");
		}
		
	}
}
