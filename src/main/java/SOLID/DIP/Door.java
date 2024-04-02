package SOLID.DIP;

public class Door implements ISwitchable{

    private boolean isActive;

    @Override
    public boolean IsActive() {
        isActive = true;
        System.out.println("dfdfdfd");
    }

    public void Activate(){
        isActive = true;
        System.out.println("문이 열립니다.");
    }

    public void Deactivate(){
        isActive = false;
        System.out.println("문이 닫힙니다.");
    }

    public void close(){
        System.out.println("문이 닫힙니다");
    }
    public void open(){
        System.out.println("문이 열립니다");
    }





}
