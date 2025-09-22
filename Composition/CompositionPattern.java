import FileHandlers.*;


public class CompositionPattern {
    // Structural Pattern
    // Deals objects or composition of objects uniformly
    public static void main(String[] args) {
        File fileOne = new File("WORD", 100);
        File fileTwo = new File("MUSIC", 50);
        File fileThree = new File("dog.png", 120);
        File fileFour = new File("hello.java", 300);

        Directory folderOne = new Directory("Student Tasks");
            folderOne.addComponent(fileOne);
            folderOne.addComponent(fileTwo);
            folderOne.addComponent(fileThree);
            folderOne.addComponent(fileFour);
        folderOne.showDetail();

        Directory folderTwo = new Directory("OOP in Java");
            folderOne.removeComponent(fileFour);
            folderTwo.addComponent(fileFour);
        folderTwo.showDetail();
    }
}
