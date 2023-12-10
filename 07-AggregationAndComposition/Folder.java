import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;

    public Folder(String name){
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addFile(File file){
        files.add(file);
    }

    public void removeFile(File file){
        files.remove(file);
    }

    public void displayContents(){
        System.out.println(("Folder Contents: "));
        for (File file: files) {
            System.out.println(file.getName());
        }
    }
}