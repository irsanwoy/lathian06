
package LatihanKelasTerbuka;

class Player{
    static int countHero = 0;
    int id;
    String name;
    double health;
    Weapon weapon;
    Armor armor;
    
    Player(String name, double health){
        this.name = name;
        this.health = health;
        this.id = ++countHero;
    }
    
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    
    void display(){
        System.out.println("====Hero "+this.id+"=======");
        System.out.println("Name  : "+this.name);
        System.out.println("Hp       : "+this.health);
        weapon.display();
        armor.display();
        System.out.println("");
    }
}

class Weapon{
    String name;
    double attackPower;
    
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    
    void display(){
        System.out.println("Weapon : "+this.name);
        System.out.println("Power    : "+this.attackPower);
    }
}

class Armor{
    String name;
    double defencePower;
    
    
    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    
    void display(){
        System.out.println("Armor     : "+this.name);
        System.out.println("Defence : "+this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {
        // instansiasi player
        Player lunox = new Player("Lunox",40);
        Player balmond = new Player("Balmond",90);
       
        //instansiasi weapon
        Weapon pedang = new Weapon("Pedang",80);
        Weapon ketapel = new Weapon("Ketapel",40);
        //instansiasi armor
        Armor bajuBesi = new Armor("Baju Besi",50);
        Armor tameng = new Armor("Tameng",70);
        
        // equip 
        lunox.equipWeapon(ketapel);
        lunox.equipArmor(tameng);
        balmond.equipWeapon(pedang);
        balmond.equipArmor(bajuBesi);
        //display
        lunox.display();
        balmond.display();
    }
}
