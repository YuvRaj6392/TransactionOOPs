package Inheritance;

 class SourceAnimal extends Animal {

        int id;
        String name;
        SourceAnimal(int id,String name)
        {
            super(id,name);
        }

     @Override
     public void jump() {
         System.out.println("jumping");
     }

     @Override
     public void run() {
         System.out.println("running");
     }
 }
