public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;

    /*public String getName(){
        return this.name;
    }

     */
    /*public int getHp(){
        return this.hp;
    }
    public void setHp(int set){
        try{
            this.hp += set;
        } catch (IllegalArgumentException e) {
            System.err.println("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
        }
    }*/

    public Monster(char suffix, int hp){
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
