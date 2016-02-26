import java.util.ArrayList;

public class GetFilesAndCommands {
    private String[] contents;
    private String[] files;
    private String[] commands;

    public GetFilesAndCommands(String[] content) {
        this.contents = content;
    }

    public void filterFile() {
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < contents.length; i++) {
            if (contents[i].indexOf("-") == -1)
                arr.add(contents[i]);
        }

        this.files = arr.toArray(new String[1]);
    }

    private boolean isCommand(String pattern) {
        return pattern.indexOf("-") == 0;
    }

    public void filterComand() {
        ArrayList<String> commands = new ArrayList<String>();
        for (int i = 0; i < contents.length; i++) {
            if (isCommand(contents[i]))
                commands.add(contents[i]);
        }
        this.commands = commands.toArray(new String[0]);
    }

    public String[] getFiles() {
        return this.files;
    }

    public String[] getCommands() {
        return this.commands;
    }
}
