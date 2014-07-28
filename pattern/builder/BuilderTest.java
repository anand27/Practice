package pattern.builder;

public class BuilderTest {

	public static void main(String[] args) {
	
		//Creating object using Builder pattern in java
        Cake whiteCake = new Cake.Builder(4, 2.5, 6)
        					.withSugar(1)
        					.withButter(0.5)
        					.withEggs(2)
        					.withVanila(2)
        					.build();
      
        //Cake is ready to eat :)
        System.out.println(whiteCake);

	}
	
}
