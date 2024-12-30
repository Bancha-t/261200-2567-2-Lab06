public class Main {
       public static void main(String[] args) {
              Cow cow = new Cow();
              Owl hewing = new Owl();
              Pic burin = new Pic();
              
              Duck donald = new Duck("Donald");
              Duck daisy = new Duck("daisy");

              //cow.sound();
              //donald.sound();
              //burin.sound();
              //hewing.sound();

              donald.clean(burin);
              daisy.clean(donald);
              
              Duck jiaTongHeng = new PekingDuck("jiaTongHeng");
              jiaTongHeng.clean(daisy);
              jiaTongHeng.fly();

              
              donald.clean(new Cow());
              donald.clean(new Cow());
              donald.clean(new Cow());
       }
}

