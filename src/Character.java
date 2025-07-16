public abstract class Character implements Creature{
    private String name;
    private int hp;

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
        if(hp>=0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }

    public Character(String name, int hp){
        this.setName(name);
        try{
            this.setHp(hp);
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

    public void showStatus(){
        System.out.println(this.getName() + "：HP " + this.getHp());
    }
}
