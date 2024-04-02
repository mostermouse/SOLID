package SOLID.DIP;

public class Switch {
    public final Door door;
    public boolean isActivated = true;

    public Switch(Door door) {
        this.door = door;
    }

    public void Toggle(){
        if(isActivated){
            isActivated = false;
            door.close();
        }else{
            isActivated = true;
            door.open();
        }

    }

    //이런식으로 직접적으로 설정해주는게 아닌 인터페이스로 구현
    //DIP(의존성 역전의 원칙) : 자기보다 변하기 쉬운 것에 의존하게 되면 변화의 영향을
    // 많이 받기 때문에 추상화된 인터페이스 상위 클래스를 둬서 영향을 받지 않게 함
}
