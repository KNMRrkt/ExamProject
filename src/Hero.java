public class Hero extends Character{
    private String weapon;

    public Hero(String name, int hp, String weapon){
        super(name, hp);
        weapon = this.weapon;
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + "は" + weapon + "で攻撃！" + target.getName() + "に10のダメージを与えた！");
        target.setHp(-10);
    }
}
