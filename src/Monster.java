public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
            this.hp = hp;
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    public Monster(String name, char suffix, int hp){
        name = this.name;
        suffix = this.suffix;
        try{
            hp = this.hp;
        } catch (IllegalArgumentException e) {
            System.err.println("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
        }
    }

    public final boolean isAlive(){
        if(getHp()>0){
            return true;
        }else{
            return false;
        }
    }
}
