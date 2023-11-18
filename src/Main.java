import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("taş");
        arrayList.add("kağıt");
        arrayList.add("makas");

        int size = arrayList.size();
        int randomIndex = random.nextInt(size);
        String randomValue = arrayList.get(randomIndex);

        System.out.println("Oyunumuz Başlıyor \nBirini seçin: 'taş-kağıt-makas'");
        System.out.println("Bilgisayarın Seçimi: " + randomValue);

        while (true) {
            String oyuncuSecimi = scanner.next();

            if (randomValue.equals(oyuncuSecimi)) {
                System.out.println("Berabere");
            } else if ((randomValue.equals("taş") && oyuncuSecimi.equals("makas")) ||
                    (randomValue.equals("kağıt") && oyuncuSecimi.equals("taş")) ||
                    (randomValue.equals("makas") && oyuncuSecimi.equals("kağıt"))) {
                System.out.println("Bilgisayar Kazandı. Seçilen: " + randomValue);
                break; // Döngüyü sonlandır
            } else {
                System.out.println("Oyuncu Kazandı. Seçilen: " + oyuncuSecimi);
                break; // Döngüyü sonlandır
            }
        }
        scanner.close();
    }
}

