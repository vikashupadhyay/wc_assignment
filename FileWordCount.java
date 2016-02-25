
class FileWordCount {
	public static void main(String[] args) {
	String file;
		for (int i=0;i<args.length;i++) {
			file = args[i];
			WcUtil util = new WcUtil(file);
			String content = util.getContent();
			WordCount text = new WordCount(content);
			System.out.println(text.lineCount()+"\t"+text.wordCount()+"\t"+text.charCount()+" "+file);
		}
	}	
}