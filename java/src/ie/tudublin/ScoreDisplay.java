package ie.tudublin;

import java.util.ArrayList;

import java.util.List;

import java.util.Arrays;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>();

	private void loadScore() 
	{
		StringBuilder sb = new StringBuilder();

		for (char c: score.toCharArray()) {
   			sb.append(c).append(" ");
		}

		System.out.println(sb.toString().trim());

		String str[] = score.split(" ");

		notes = Arrays.asList(str);
		for (String s: notes){
			System.out.println(s);
		}
	}

	private void printScores()
	{
		for (int i = 0; i < notes.size(); i++)
		{
			String display = notes.get(i);

			String tabbeddisplay = display.substring(0)+'\t'+display.substring(1)+'\t'+display.substring(2, display.length());

			System.out.println(tabbeddisplay);
		}
	}

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();
		printScores();
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
