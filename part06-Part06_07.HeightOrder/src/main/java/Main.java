
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Empty room? " + room.isEmpty());
        
        room.add(new Person("Lee", 183));
        room.add(new Person("Cathy", 163));
        room.add(new Person("Ruth", 156));
        
        System.out.println("Empty room? " + room.isEmpty());
        
        System.out.println("");
        for(Person printPersons : room.getPersons()){
            System.out.println(printPersons);
        }
        
        System.out.println("");
        System.out.println("Shortest: " + room.shortest());
        System.out.println("");
        for(Person shortestPerson : room.getPersons()){
            System.out.println(shortestPerson);
        }
        
        
        //removing the shortest
           System.out.println("");
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for(Person shortestPerson : room.getPersons()){
            System.out.println(shortestPerson);
        }
    }
}
