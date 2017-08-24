/*
TASK:
    Write a Person class and a constructor, that takes an integer - initialAge as parameter.
    The constructor must assign  to  after confirming the argument passed as  is not negative;
    if a negative argument is passed as , the constructor should set  to  and print Age is not valid,
    setting age to 0.. In addition, you must write the following instance methods:

        1. yearPasses() should increase the age instance variable by 1.
        2.  amIOld() should perform the following conditional actions:
            * If age < 13, print You are young.
            * If age >= 13 and age < 18, print You are a teenager.
            * Otherwise, print You are old.
SAMPLE INPUT:
    4
    -1
    10
    16
    18

SAMPLE OUTPUT:
    Age is not valid, setting age to 0.
    You are young.
    // after 3 years
    You are young.

    You are young.
    // after 3 years
    You are a teenager.

    You are a teenager.
    // after 3 years
    You are old.

    You are old.
    // after 3 years
    You are old.
 */
package marzgra.hackerrank._30daysofcode.day4;

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge <= 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        this.age = initialAge;
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        ++this.age;
    }
}