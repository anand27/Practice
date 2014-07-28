package pattern;

public class Cake {

	private final double sugar;   
    private final double butter;  
    private final int eggs;
    private final int vanila;     
    private final double flour;   
    private final double bakingpowder;
    private final double milk; 
    private final int cherry;

    public static class Builder {

    	// serving for 1 kg cake
    	
    	// required parameters
    	private final double flour;   
        private final double bakingpowder; 
        private final double milk; 
        
        // optional parameters
        private double sugar = 2.5;   
        private double butter = 2.5;  
        private int eggs = 6;
        private int vanila = 2;      
        private int cherry = 8;

        public Builder(double flour, double bakingpowder, double milk) {
        	this.flour = flour;
        	this.milk = milk;
        	this.bakingpowder = bakingpowder;
        }
        
        //builder methods for setting property
        public Builder withSugar(double cup){this.sugar = cup; return this; }
        public Builder withButter(double cup){this.butter = cup; return this; }
        public Builder withEggs(int number){this.eggs = number; return this; }
        public Builder withVanila(int spoon){this.vanila = spoon; return this; }
        public Builder withCherry(int number){this.cherry = number; return this; }
      
      
        //return fully build object
        public Cake build() {
            return new Cake(this);
        }
    }

    //private constructor to enforce object creation through builder
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.cherry = builder.cherry;       
    }

	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs
				+ ", vanila=" + vanila + ", flour=" + flour + ", bakingpowder="
				+ bakingpowder + ", milk=" + milk + ", cherry=" + cherry + "]";
	}

    
}
