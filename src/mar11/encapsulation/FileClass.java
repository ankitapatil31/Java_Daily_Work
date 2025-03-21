package mar11.encapsulation;

public class FileClass {
    boolean isReadOnly;
    boolean isWriteOnly;
    String fileName;

    FileClass(String fileName,boolean isReadOnly, boolean isWriteOnly){
        this.fileName = fileName;
        this.isReadOnly = isReadOnly;
        this.isWriteOnly = isWriteOnly;
    }

    public String ReadFile(){
        return fileName;
    }
    public void WriteFile(String fileName){
        if(isWriteOnly){
            this.fileName = fileName;
        }
        return;
    }
}
