package day44_Abstraction.animalTask;

public interface Playable { // eger olaki yeni ((interface)) acacagimiza class acarsak;
    // class yerine interface yazinca yine basarmis oluyoruz



    // public abstract void play(); // ===> public and  abstract color are grey that's means ; it's not necessary
    // yani silede biliriz bak assagida öyle yaziyor zaten


    void play(); // abstract by default && abstract keyWord optional
    //Public is the only access modifier that can be used in interface and given by default
    // bunu implement ettigimiz yerde de public ten baska access modifier yazamayiz
    // because ; public ten daha (more visible) yok


    // static boolean isFriendly = true; //==> burarda da static gri burada da silebiliriz,
    // ve burada static in degerini hemen tanimlamak zorundayiz static block acamiyoruz, hata veriyor


    boolean isFriendly = true; // static & final by default





}
