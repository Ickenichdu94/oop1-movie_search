import java.io.*;
import java.util.Scanner;

import oop1movie_search.*;

public class InputOutput {

//1. Überschrift Movie Search & Begrüßung
	public void printHeader() {
		System.out.println("+--------------------------------------+");
		System.out.println("|            Willkommen zu             |");
		System.out.println("|            Movie Search!             |");
		System.out.println("+--------------------------------------+");
		}
//2. Vorstellung der App
	public void printIntro() {
		System.out.println("Mit diesem Programm können sie Filme aus der Datenbank suchen");
	}
//3. Benutzer nach Input fragen Regisseur oder Filmtitel
	public void printInput() {
		System.out.println("Welchen Film möchten Sie suchen?");
		System.out.println("Bitte geben sie den Titel ein: ");
	}
//4. Input scannen vom User

	Scanner scannerVariable = new Scanner(System.in);
	System.out.println("Sie haben " + scannerVariable.nextLine()" eingegeben.");
	
	String inputString = "";
	int searchType = 0;
//Try Catch einbauen für die Eingabe! 
	SearchFunction.main(inputString, searchType);
}
