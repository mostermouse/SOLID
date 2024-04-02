package SOLID.ISP;

public interface IDamageable {

    //데미지 관련 인터페이스

    public float Health();
    public int Defence();

    public void Die();

    public void TakeDamage();
    public void RestoreHealth();
}
