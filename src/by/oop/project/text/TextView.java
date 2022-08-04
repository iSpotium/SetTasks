package by.oop.project.text;

public class TextView {
	public void ConsoleView(Text text) {

		System.out.println(text.getTitle().toUpperCase());
		for (Sentence s : text.getText()) {
			System.out.print(createString(s));
			System.out.print(" ");
		}

	}

	private String createString(Sentence s) {
		String sentence = "";
		
		for(Word w : s.getSentence()) {
			sentence = sentence + w.getWord() + " ";
		}
		sentence.trim();
		
		return sentence;
	}
}
