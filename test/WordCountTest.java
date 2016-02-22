import static org.junit.Assert.assertEquals;
import  org.junit.Test;


public class WordCountTest {

	@Test
	public void letterCount_of_given_text(){
	String text = "yes it's pretty cool!";
	WordCount lib = new WordCount(text);
	assertEquals(lib.charCount(),21);

	};

	@Test
	public void letterCount_of_if_there_is_no_text(){
	String text = "";
	WordCount lib = new WordCount(text);
	assertEquals(lib.charCount(),0);

	};

	@Test
	public void lineCount_of_given_text(){
	String text = "yes it's pretty cool!";
	WordCount lib = new WordCount(text);
	assertEquals(lib.lineCount(),0);

	};
	@Test
	public void lineCount_of_given_text_which_have_multiple_lines(){
	String text = "yes\n it's\n pretty \ncool!";
	WordCount lib = new WordCount(text);
	assertEquals(lib.lineCount(),3);
	};

	@Test
	public void wordCount_of_given_text(){
	String text = "yes it's pretty cool!\r\nhulul ";
	WordCount lib = new WordCount(text);
	assertEquals(lib.wordCount(),5);
	};
	@Test
	public void wordCount_of_given_text_which_have_unordered_white_spaces(){
	String text = " yes     it's pretty cool!\r\nhulul ";
	WordCount lib = new WordCount(text);
	assertEquals(lib.wordCount(),5);
	};
	@Test
	public void wordCount_of_given_text_which_is_only_a_white_space(){
	String text = "";
	WordCount lib = new WordCount(text);
	System.out.println(text.length());
	assertEquals(lib.wordCount(),0);
	};
	@Test
	public void wordCount_of_given_text_which_have_multiple_lines(){
	String text = "hello\nhow \nare\nyou i am fine";
	WordCount lib = new WordCount(text);
	assertEquals(lib.wordCount(),7);
	};

}