import org.junit.Assert;
import org.junit.Test;

public class commandFileTest {
    @Test
    public void filter_files() {
        String[] parameter = {"-l", "one.text","two.text"};
        GetFilesAndCommands filter = new GetFilesAndCommands(parameter);
        filter.filterFile();
        Assert.assertEquals(filter.getFiles()[0],"one.text");
        Assert.assertEquals(filter.getFiles()[1],"two.text");

    }
    @Test
    public void filter_commands() {
        String[] parameter = {"-l", "one.text","two.text"};
        GetFilesAndCommands filter = new GetFilesAndCommands(parameter);
        filter.filterComand();
        Assert.assertEquals(filter.getCommands()[0],"-l");

    }
}
