package OOP24.InterfeceInheritance;

class Avanza implements Car{
    public String getBrand(){
        return "toyota";
    }

    public void drive(){
        System.out.println("Drive");
    }

    public boolean getMekanik(){
        return true;
    }

    public int getTire(){
        return 4;
    }
}
