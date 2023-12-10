public class FileSystem {
    public static void main(String[] args){
        Folder myFolder = new Folder("MyFolder");

        File file1 = new File("File1.txt", 1024, "This is file1");
        File file2 = new File("File2.txt", 512, "This is file2");
        File file3 = new File("File3.txt", 1024, "This is file3");

        myFolder.addFile(file1);
        myFolder.addFile(file2);
        myFolder.displayContents();
        myFolder.addFile(file3);
        myFolder.displayContents();
        myFolder.removeFile(file2);
        myFolder.displayContents();
    }
}
