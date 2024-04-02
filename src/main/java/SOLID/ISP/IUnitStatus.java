package SOLID.ISP;

public interface IUnitStatus {

    /*public float Health();
    public int Defence();

    public void TakeDamage();

    public float MoveSpeed();

    public void GoForward();

    public int Strength(int a, int b);

    public int Dexterity(float a, float b);*/

    public int Stregth();

    public int Dexterity();
    public int Endurance();

    //이런식으로 한번에 넣지말고 최대한 나눠서 구현해라
    //이동관련 , 데미지 인터페이스 등등
}
