public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("$ todo" + "\n" +
                    "\n" + "Command Line Todo application"
                    + "\n" + "=============================" + "\n"
                    + "\n" + "Command line arguments:" + "\n"
                    + "-l   Lists all the tasks" +
                    "\n" + "-a   Adds a new task" +
                    "\n" + "-r   Removes an task" +
                    "\n" + "-c   Completes an task");
        } else {
            String grade = args[0];

            switch (grade) {
                case "-l":
                    System.out.println("Lists all the tasks");
                    break;
                case "-a":
                    System.out.println("Adds a new task");
                    break;
                case "-r":
                    System.out.println("Removes an task");
                    break;
                case "-c":
                    System.out.println("Completes an task");
                    break;
                default:
                    System.out.println("Invalid argument");

            }
        }
    }
}
