package src.Java_1_8_features;

class Base implements Super {
    /**
     * Override the abstract method.
     */
    @Override
    public void print() {
        System.out.println("Base");
    }
    
    public static void main(String[] args) {
		Super s = new Base();
		s.doStuff();
		Super.sayHello();
		s.print();
		
	}
}