package FileHandlers;
import java.util.ArrayList;

public class Directory implements FileSystemComponent {
    private final String componentName;
    private ArrayList<FileSystemComponent> folder = new ArrayList<>();

    public Directory(String name) {
        componentName = name;
    }

    public void addComponent(FileSystemComponent component) {
        folder.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        folder.remove(component);
    }

    @Override
    public void showDetail() {
        System.out.println("This directory is named " + componentName);
        for (FileSystemComponent component : folder) {
            component.showDetail();
        }
    } // Object itself and composition of objects are to have differing methods

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : folder) {
            totalSize += component.getSize();
        } return totalSize;
    }
}
