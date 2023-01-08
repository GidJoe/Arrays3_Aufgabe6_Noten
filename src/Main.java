import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxPunkte = scanner.nextInt();
        int anzahlKlausuren = scanner.nextInt();
        int[] noten = new int[anzahlKlausuren];
        for (int i=0; i<anzahlKlausuren; i++) {
            noten[i] = scanner.nextInt();
        }

        int sgut = (maxPunkte/100)*92;
        int gut = (maxPunkte/100)*81;
        int bef = (maxPunkte/100)*67;
        int ausr = (maxPunkte/100)*50;
        int mang = (maxPunkte/100)*30;

        int anzahlSG = 0;
        int anzahlG = 0;
        int anzahlB = 0;
        int anzahlA = 0;
        int anzahlM = 0;
        int anzahlU = 0;

        int durch = 0;
        for (int note : noten) {
            if (note >= sgut) {
                anzahlSG++;
            } else if (note >= gut) {
                anzahlG++;
            } else if (note >= bef) {
                anzahlB++;
            } else if (note >= ausr) {
                anzahlA++;
            } else if (note >= mang) {
                anzahlM++;
            } else {
                anzahlU++;
            }
            durch += note;
        }
        durch /= noten.length;

        System.out.println("Punkte insgesamt: " + maxPunkte);
        System.out.println("Sehr gut\t(ab " + sgut + ")\t" + anzahlSG);
        System.out.println("Gut\t(ab " + gut + " bis unter " + sgut + ")\t" + anzahlG);
        System.out.println("Befriedigend\t(ab " + bef + " bis unter " + gut + ")\t" + anzahlB);
        System.out.println("Ausreichend\t(ab " + ausr + " bis unter " + bef + ")\t" + anzahlA);
        System.out.println("Mangelhaft\t(ab " + mang + " bis unter " + ausr + ")\t" + anzahlM);
        System.out.println("Ungenügend\t(ab " + 0 + " bis unter " + mang + ")\t" + anzahlU);
        System.out.println("Durchschnitt:\t\t" + durch + " Punkte");
    }
}