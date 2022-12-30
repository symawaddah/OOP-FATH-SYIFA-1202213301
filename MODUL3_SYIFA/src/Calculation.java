public class Calculation {
    //attribute
    double radius; double side; double area;
    double phi = 3.14;

    //method setter
    public void SetSquare (){
        ;
    }

    //method getter
    public void getSquare (){

    }

    //method setter
    public void SetCircle (){
        System.out.print("Input jari-jari lingkaran: ");
        radius = input.nextDouble();
       
        area = 3.14 * radius * radius;
           
        System.out.println("Luas lingkaran: "+area);
    }

    //method getter
    public void getCircle(){
        return area;
    }
}
