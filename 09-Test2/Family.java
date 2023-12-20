public class Family {
    private Person[] members;

    public Family(Person[] members) {
        this.members = members;
    }

    public int adults() {
        int adultCount = 0;
        for (Person person : members) {
            if (person.getAge() >= 18) {
                adultCount++;
            }
        }
        return adultCount;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Charlie", 15);

        Person[] familyMembers = {person1, person2, person3};

        Family family = new Family(familyMembers);

        System.out.println(family.adults());
    }
}