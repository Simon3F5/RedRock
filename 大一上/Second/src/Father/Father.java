package Father;

public class Father {
        private  String name;
        private  int blood;
        private  int attack;
        private  int defend;

        public void setName(String name) {
            int length=name.length();
            if(length<21&&length>0) {
                this.name = name;
            }else{
                System.out.println("名称长度超出限制！");
            }
        }

        public  String getName() {
            return name;
        }

        public void setBlood(int blood) {
            if(blood<10001) {
                this.blood = blood;
            }else{
                System.out.println("血量超出限制！");
            }
        }

        public  int getBlood() {
            return blood;
        }

        public void setAttack(int attack) {
            if(attack<2001&&attack>=0) {
                this.attack = attack;
            }else{
                System.out.println("攻击超出限制！");
            }
        }

        public int getAttack() {
            return attack;
        }

        public void setDefend(int defend) {
            if(defend<1001&&defend>=0) {
                this.defend = defend;
            }else{
                System.out.println("防御超出限制！");
            }
        }

        public int getDefend() {
            return defend;
        }


        public Father(String name,int blood,int attack,int defend) {
            this.setName(name);
            this.setBlood(blood);
            this.setAttack(attack);
            this.setDefend(defend);
        }
}
