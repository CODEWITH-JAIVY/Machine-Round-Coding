public abstract class Person {

    // ✅ Common fields — sirf ek baar yahan
    private String name;
    private int    age;
    private String id;

    // Static counter — auto ID generation
    private static int counter = 1;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
        this.id   = "SCH-00" + counter++;
    }

    // ✅ Common method — sirf ek baar yahan
    public void introduce() {
        System.out.println("Hi, I am " + name + ", my ID is " + id);
        System.out.println("Role   : " + getRole());
    }

    // ✅ Abstract — har child apna role batayega
    public abstract String getRole();

    // Getters
    public String getName() { return name; }
    public String getId()   { return id;   }
    public int    getAge()  { return age;  }
}