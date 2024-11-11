package cachorro;

public class dog {

    public String name;
    public String breed;
    public int hunger;
    public int tired;
    public boolean isAwake;
    public boolean isAlive;
    
    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.hunger = 0;
        this.tired = 0;
        this.isAwake = false;
        this.isAlive = true;
    }

    public boolean isAwake() {
        return isAwake;
    }

    public void setAwake(boolean isAwake) {
        this.isAwake = isAwake;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }


    public int getHunger() {
        return hunger;
    }


    public void setHunger(int hunger) {
        this.hunger = hunger;
    }


    public int getTired() {
        return tired;
    }


    public void setTired(int tired) {
        this.tired = tired;
    }

    public void verify(){
        if (isAlive) {
            if (this.hunger >= 6) {
                this.isAlive = false;
                System.out.println("Morreu de fome.");
            }
            if (this.tired >= 5) {
                this.isAwake = false;
                System.out.println("Dormiu");
            }

        } else{
            System.out.println("Tá morto zé");
        }
    }

    public void toWakeUp(){
        verify();
        if (!isAlive) {
            return;
        } else {
            if (isAwake) {
                System.out.println("Já está acordado!");
            }   else {
                this.isAwake = true;
            }
        }
    }

    public void feed(){
        verify();
        if (!isAlive) {
            return;
        } else{
            
        }
    }

    public void play(){

    }

    public void status(){
        System.out.println("==========");
        System.out.println("Nome: " + getName());
        System.out.println("Raca: " + getBreed());
        System.out.println("Fome: " + getHunger());
        System.out.println("Cansaco: " + getTired());
        System.out.println("Esta acordado: " + isAwake());
        System.out.println("Esta vivo: " + isAlive());
        System.out.println("==========");
    }
}