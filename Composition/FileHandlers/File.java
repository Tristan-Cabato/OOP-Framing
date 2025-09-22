package FileHandlers;

public class File implements FileSystemComponent {
    private final String componentName;
    private final int componentSize;

    public File(String name, int size) {
        componentName = name;
        componentSize = size;
    }

    @Override
    public void showDetail() {
        System.out.println("This file is named " + componentName);
    }

    @Override
    public int getSize() {
        return componentSize;
    }
}
