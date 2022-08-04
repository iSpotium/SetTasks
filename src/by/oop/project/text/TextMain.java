package by.oop.project.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TextMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text text = new Text();

		text.setTitle("Random words");
		
		List<Word> w1 = new ArrayList<Word>();
		
		w1.add(new Word("House"));
		w1.add(new Word("Car"));
		w1.add(new Word("Horse."));
		
		List<Word> w2 = new ArrayList<Word>();	
		
		w2.add(new Word("Roof"));
		w2.add(new Word("Bike"));
		w2.add(new Word("Human."));
		
		Sentence sentence1 = new Sentence(w1);
		Sentence sentence2 = new Sentence(w2);
		
		text.add(sentence1);
		text.add(sentence2);
		
		TextView print = new TextView();
		
		print.ConsoleView(text);
	}

}
