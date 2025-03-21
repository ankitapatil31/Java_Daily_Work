package mar8;

public class DesktopParentClass {
    String modelName;
    int screenSize;
    String brandName;

    DesktopParentClass(){

    }
    DesktopParentClass(String modelName, int screenSize, String brandName) {
        this.modelName = modelName;
        this.screenSize = screenSize;
        this.brandName = brandName;
    }

    public void showAllValues(){
        System.out.println(modelName);
        System.out.println(screenSize);
        System.out.println(brandName);
    }
}
