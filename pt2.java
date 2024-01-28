class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    //getter
    int getIntPrivate(){
        return intPrivate;
    }

    //setter
    void setDoublePrivate(double doublePrivate){
        this.doublePrivate = doublePrivate;
    }

    double getDoublePrivate(){
        return doublePrivate;
    }
}

class Persegi{
    double sisi;

    Persegi(double sisi){
        this.sisi = sisi;
    }

    void setLuas(double sisi){
        this.sisi = sisi * 2;
    }

     double getLuas(){
        return sisi*sisi;
    }
}

public class pt2 {

    public static void main(String[] args) {
        Data object = new Data();
        object.intPublic = 10; //write 
        System.out.println(object.intPublic); // read

        //read only dengan getter
        System.out.println(object.getIntPrivate());

        //write only dengan setter
        object.setDoublePrivate(0.43);

        System.out.println(object.getDoublePrivate());


        Persegi persegi1 = new Persegi(30);
        System.out.println(persegi1.getLuas());

        persegi1.setLuas(10);
        System.out.println(persegi1.getLuas());
    }
}
