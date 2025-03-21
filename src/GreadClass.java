public class GreadClass {
    public static void main( String[] arg ){
        int studentMarks= 90;
        if(studentMarks >= 90 && studentMarks <=100){
            System.out.println(" A+ Grade");
        }
        else if(studentMarks >= 80 && studentMarks <90){
            System.out.println(" A Grade");
        }
        else if(studentMarks >= 70 && studentMarks <80){
            System.out.println(" B+ Grade");
        }
        else if(studentMarks >= 60 && studentMarks <=70){
            System.out.println(" B Grade");
        }
        else if(studentMarks >= 50 && studentMarks <=60){
            System.out.println(" C+ Grade");
        }
        else if(studentMarks >= 40 && studentMarks <=50){
            System.out.println(" C Grade");
        }
        else if(studentMarks < 40 ){
            System.out.println("Fail");
        }

    }
}
