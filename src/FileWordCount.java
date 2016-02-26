class FileWordCount {
    public static void main(String[] args) {
        GetFilesAndCommands filter = new GetFilesAndCommands(args);
        filter.filterComand();
        filter.filterFile();
        String[] allFiles = filter.getFiles();
        String[] allCommands = filter.getCommands();
        for (int i = 0; i < allFiles.length; i++) {
            WcUtil util = new WcUtil(allFiles[i]);
            String content = util.getContent();
            WordCount text = new WordCount(content);
            if (isPresent(allCommands, "-l"))
                System.out.println(text.lineCount()+"  "+allFiles[i]);
            else if (isPresent(allCommands, "-m"))
                System.out.println(text.charCount()+"  "+allFiles[i]);
            else if (isPresent(allCommands, "-w"))
                System.out.println(text.wordCount()+"  "+allFiles[i]);
            else if(allCommands.length==0 || isPresent(allCommands,"-"))
                System.out.println(text.lineCount()+"\t"+text.wordCount()+"\t"+text.charCount()+"  "+allFiles[i]);

        }

    }


    private static boolean isPresent(String[] allCommands, String target) {
        for (String e : allCommands) {
            if (e.equals(target))
                return true;
        }
        return false;
    }
}