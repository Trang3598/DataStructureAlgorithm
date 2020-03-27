package Week4;

public class WordCount {
	private String word;
	private int count;

	public WordCount(String word) {
		super();
		this.word = word;
		count = 1;
	}

	public WordCount(String w, int c) {
		word = w;
		count = c;
	}

	public WordCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "WordCount [word=" + word + ", count=" + count + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;
		if (o instanceof WordCount) {
			WordCount ow = (WordCount) o;
			if (ow.word.compareTo(word) == 0)
				return true;
			else
				return false;
		}

		return false;
	}

	public void upCount() {
		count++;
	}

	public WordCount clone() {
		return new WordCount(word, count);
	}
}
