public abstract class Character implements Creature{
    private String name;
    private int hp;

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

    public Character(String name, int hp){
        name = this.name;
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

    public void showStatus(){
        System.out.println(this.name + "：HP " + this.hp);
    }
}
