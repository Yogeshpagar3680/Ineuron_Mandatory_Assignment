package question2;

/**
 * Write a Java program to invoke parent class constructor from a child class. Create
 * Child class object and parent class constructor must be invoked. Demonstrate by
 * writing a program. Also explain key points about Constructor.
 */
public class Animal {

    Animal()
    {
        System.out.println("I am an Animal");
    }
}
class Dog extends Animal{

    Dog()
    {
        super();
        System.out.println("I am a Dog");
    }
}
class LaunchAnimal
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
    }
}

/**
 * --------KEY POINTS ABOUT CONSTRUCTOR--------
 *
 * 1. The constructor has the same name as the class in which it resides.
 *
 * 2. Constructors do not have a return type, not even void.
 *
 * 3. The primary purpose of a constructor is to initialize the newly created object.
 *
 * 4. If you do not define any constructor in your class, the Java compiler inserts a default constructor into your code on your behalf. This default constructor is called when an object of the class is instantiated.
 *
 * 5. If you define a parameterized constructor, you need to instantiate the class with the same number of arguments as there are parameters.
 *
 * 6. Just like method overloading in Java, a class can have multiple constructors, but they must have a different parameter list.
 *
 * 7. If a constructor is made private, then the class cannot be instantiated from outside the class. This approach is primarily used in the Singleton design pattern.
 *
 * 8. In Java, a constructor can call another constructor in the same class using this() keyword. This is known as constructor chaining.
 *
 * 9. If a class is derived from another class, the derived class has a chance to call the constructor of its base class. This is done using the super() keyword.
 */
