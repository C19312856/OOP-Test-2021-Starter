package ie.tudublin;

import java.util.ArrayList;

import java.util.List;

import java.util.Arrays;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<String> notes = new ArrayList<String>();

	private void loadScore() 
	{
		notes.add("a");
		/*for(int i = 0; i < score.length(); i++)
		{
			char letterornum = score.charAt(i);

			if(Character.isDigit(letterornum) == false)
			{
				notes.add
			}
		}*/
	}

	private void printScores()
	{
		for (int i = 0; i < notes.size(); i++)
		{
			String display = notes.get(i);

			if(display.substring() == "1")
			{
				String tabbeddisplay = display.substring(0)+'\t'+display.substring(1)+'\t'+"Quaver";
				print(tabbeddisplay);
			}
			else
			{
				String tabbeddisplay = display.substring(0)+'\t'+display.substring(1)+'\t'+"Crotchet";
				print(tabbeddisplay);
			}
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
		//loadScore();
		//printScores();
		print(notes.get(0));
	}

	public void draw()
	{
		background(255);
		drawLines();
	}

	public void drawLines()
	{
		float border = 0.1f * width;
		for(int i = 0 ; i < 5 ; i ++)
        {
			float x = map(i, 0, 9, border, width - border);
            float y = map(i, 0, 9, border, height - border);
            stroke(0, 0, 0);
            line(border, y, width - border, y);
        }
		for(int i = 0 ; i < 17 ; i ++)
        {
			float x = map(i, 0, 17, border, width - border);
            fill(0);
			text(i, x, border / 2);
			//Implement notes instead of numbers with regards to notes array
			//Note a = notes.get(24);
			//text(a, x, border / 2);
        }
	}

	/*void drawNotes()
	{
		for(Notes n: notes)
		{
			println(n);
		}
	}*/
}
