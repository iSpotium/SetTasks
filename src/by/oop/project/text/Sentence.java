 package by.oop.project.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

	private List<Word> sentence;

	public Sentence() {
		sentence = new ArrayList<>();
	}

	public Sentence(List<Word> sentence) {
		this.sentence = new ArrayList<Word>();
		this.sentence.addAll(sentence);
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public boolean add(Word word) {
		sentence.add(word);
		return true;
	}

	public boolean add(int index, Word word) {
		if (index < 0 || index > sentence.size()) {
			return false;
		}
		sentence.add(index, word);
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sentence);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		return Objects.equals(sentence, other.sentence);
	}
	
}
