package lingual.beans;

import java.io.Serializable;
import java.util.Deque;

import lingual.entities.Word;
import lingual.ds.fsad.FixedSizeArrayDeque;

public class SearchHistory implements Serializable{
	private static final long serialVersionUID = -7715562837707687037L;
	private final int count = 10;
	private Deque<Word> history = new FixedSizeArrayDeque<Word>(count);
	
	/**
	 * Inserts a Word object into history deque
	 * @param w		word
	 */
	public void addWord(Word w){
		history.addFirst(w);
	}
	
	/**
	 * Returns the search history as an array of Word objects
	 * @return		search history
	 */
	public Word[] toArray(){
		return (Word[]) history.toArray(new Word[history.size()]);
	}

}