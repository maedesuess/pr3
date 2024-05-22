package at.campus02.pr3.THREADS.Threads2Synchronized;

/*
Schreiben Sie eine Konsolenanwendung mit einem Hintergrund-Thread,
welcher im Sekundentakt die aktuelle Uhrzeit ausgibt Aktuelle Uhrzeit:
    Date d = new Date();
    System.out.println(d.toString())
Per Tastendruck / Eingabe eines Zeichens soll die Anwendung (und der Thread „höflich“)
gestoppt werden können.
 */

public class main {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        Worker w2 = new Worker();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();


        System.out.println("Drücken Sie eine Taste bzw. Eingabe um zu stoppen ...");
        if (ConsoleHelper.readLine() != null) {
            w1.requestShutDown();

        }
        if (ConsoleHelper.readLine() != null) {

            w2.requestShutDown();
        }

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fertig!");
    }
}
