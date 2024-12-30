public class Owl extends Animal implements Flyable{
    @Override
    void sound(){
        System.out.println("Hoot Hoot");
    }
    
    @Override
    public void fly(){
        System.out.println("flap flap");
    }

    @Override
    public void glide(){
        System.out.println("weeeeeeeee");
    }

}
