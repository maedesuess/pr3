package at.campus02.pr3.THREADS.Uhrzeit.ue03_01;

import java.util.Date;

/*
Schreiben Sie eine Konsolenanwendung mit einem Hintergrund-Thread,
welcher im Sekundentakt die aktuelle Uhrzeit ausgibt Aktuelle Uhrzeit:
Date d = new Date();
System.out.println(d.toString())
Per Tastendruck / Eingabe eines Zeichens soll die Anwendung (und der Thread „höflich“)
gestoppt werden können.
 */

public class Clock implements Runnable{

    // Eine Variable, um den Laufzustand des Threads zu steuern.
    private boolean isRunning = true;

    // Die run-Methode, die beim Starten des Threads ausgeführt wird.
    @Override
    public void run() {
        // Solange isRunning wahr ist, wird die Schleife ausgeführt.
        while (isRunning) {
            // Erstellt ein neues Date-Objekt, das das aktuelle Datum und die Zeit enthält.
            Date d = new Date();
            // Gibt das Datum und die Zeit in der Standardformatierung aus.
            System.out.println(d.toString());
            try {
                // Lässt den Thread für 1000 Millisekunden (1 Sekunde) schlafen.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Wirft eine RuntimeException, falls der Thread unterbrochen wird.
                throw new RuntimeException(e);
            }
        }
    }

    // Eine Methode, die von außerhalb aufgerufen wird, um den Thread sanft zu stoppen.
    public void requestShutDown() {
        // Gibt eine Nachricht aus, dass ein Shutdown-Antrag erhalten wurde.
        System.out.println("Thread got shutdown Request");
        // Setzt isRunning auf false, was die Schleife in der run-Methode beendet und den Thread stoppt.
        isRunning = false;
    }
}
