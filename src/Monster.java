public abstract class Monster implements Creature{
    private String name;
    public String getName(){
        return this.name;
    }

    private int hp;
    public int getHp(){
        return this.hp;
    }
    public void setHp(){
        try{
            this.hp
        } catch (IllegalArgumentException e) {
            System.err.println("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
        }
    }

    char suffix;

    public final boolean isAlive(){
        if(getHp()>0){
            return true;
        }else{
            return false;
        }
    }
}
