package tutoring03.homework;

public class SeparatorClient {
    public static void main(String[] args) {
        FileNames fileNames = new FileNames();
        Separator separator = new Separator();

        separator.separate(fileNames.input());
    }
}
