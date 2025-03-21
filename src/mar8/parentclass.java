package mar8;

public class parentclass {
    public static void main(String[] args) {
        DesktopParentClass desktop = new DesktopParentClass("AZ1234",12,"Dell");
        desktop.showAllValues();

//        LaptopChildClass laptop = new LaptopChildClass("EEZ1234",13,"Dell",23456);
//        laptop.showAllValues();
        LaptopChildClass laptop = new LaptopChildClass();
        laptop.showAllValues();

    }
}
