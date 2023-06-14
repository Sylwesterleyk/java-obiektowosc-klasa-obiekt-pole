public class RoomsProgram {
    public static void main(String[] args) {

        char [] status1 = {'f','r','e','e'};
        char [] status2 = {'o','c','c','u','p','i','e','d'};

        // pokój numer 1
        Room r1 = new Room();
        r1.number = 1;
        r1.status = status1;
        System.out.println("Room number: " + r1.number);
        System.out.print("Status: ");
        for (char a : r1.status) {
            System.out.print(a);
        }
        System.out.println();

        // pokój numer 2
        Room r2 = new Room();
        r2.number = 2;
        r2.status = status2;
        System.out.println("Room number: " + r2.number);
        System.out.print("Status: ");
        for (char a : r2.status) {
            System.out.print(a);
        }
        System.out.println();

        //pokój numer 3
        Room r3 = new Room();
        r3.number = 3;
        r3.status = status2;
        System.out.println("Room number: " + r3.number);
        System.out.print("Status: ");
        for (char a : r3.status) {
            System.out.print(a);
        }
        System.out.println();

        System.out.println("----------------- próba -----------------");
        Room[] rooms = new Room[3];
        rooms[0] = r1;
        rooms[1] = r2;
        rooms[2] = r3;

        for (Room room : rooms) {
            System.out.println("Room number: " + room.number);
            System.out.print("Status: ");
            for (char a : room.status) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}

