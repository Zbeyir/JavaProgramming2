package practice.day_39Practice.animalTask;

public class FriendlyAnimal extends Animal {

    public boolean isWild, isFriendly, isPlayable;

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public FriendlyAnimal(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender);
       setFriendly(isFriendly);
       setPlayable(isPlayable);
       setWild(isWild);
    }

    public void play(){
        System.out.println(getName() + " " + getBreed() + " is playing");
    }

    public void pet(){
        System.out.println(getName() + " " + getBreed() + " is pet");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }

}

/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */
