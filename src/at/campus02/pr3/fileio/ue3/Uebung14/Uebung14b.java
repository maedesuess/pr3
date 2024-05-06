package at.campus02.pr3.fileio.ue3.Uebung14;

import at.campus02.pr3.fileio.ue3.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Uebung14b {
    public static void main(String[] args) throws IOException {
       // File file = new File("C:\\campus02\\test\\testBinary2.txt");

        // Schreibt in die Datei "C:\campus02\test\testBinary2.txt"
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\campus02\\test\\testBinary2.txt");

        // Definiert eine Zeichenkette mit Daten
        String data = "hello File - second output";

        // Konvertiert die Zeichenkette in ein Char-Array
        for (char c : data.toCharArray()) {

            // Schreibt jedes Zeichen einzeln in die Datei
            fileOutputStream.write(c);
        }
        // CHAR IM ASCII CODE
        fileOutputStream.write(255);
        //CHAR im HEXADEZIMALSYSTEM
        fileOutputStream.write(0xFD);

        // Spült den Puffer, um sicherzustellen, dass alle Daten geschrieben werden
        fileOutputStream.flush();

        // Schließt den FileOutputStream, um die Ressourcen freizugeben
        fileOutputStream.close();
    }
}
