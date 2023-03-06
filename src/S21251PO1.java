

import java.util.Scanner;

public class S21251PO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plansza = 0;
        byte krzyzNumb = 2;
        byte koloNumb = 1;
        char krzyżyk = 'x';
        char kołko = 'o';
        char kreskaWBok = 0X2500;
        char kreskaWGore = 0X257F;
        int wspolWierszy = 0;
        int wspoKolumn = 0;
        int runda1Wiersze = 0;
        int runda1Kolumny = 0;
        int runda2Wiersze = 0;
        int runda2Kolumny = 0;
        int runda3Wiersze = 0;
        int runda3Kolumny = 0;
        int runda4Wiersze = 0;
        int runda4Kolumny = 0;
        int runda5Wiersze = 0;
        int runda5Kolumny = 0;
        int runda6Wiersze = 0;
        int runda6Kolumny = 0;
        int runda7Wiersze = 0;
        int runda7Kolumny = 0;
        int runda8Wiersze = 0;
        int runda8Kolumny = 0;
        int runda9Wiersze = 0;
        int runda9Kolumny = 0;

        System.out.println("    -----------------------------   ");
        System.out.println("|          KOLKO I KRZYZYK          |");
        System.out.println("    -----------------------------   ");


        System.out.println("Wybierając współrzędne z klawiatury gra się w kółko i krzyżyk");


        int numbOfBiteToCheck = 1;//4
        int firstBite = 0;//3
        int curentBit = 0;


        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runda " + i);
            /////wypisuje

            for (int p = 0; p < 3; p++) {
                System.out.println();
                if (p == 0) {
                    System.out.println("1 " + "2" + " 3");
                } else {

                    System.out.println(kreskaWBok + "" + kreskaWBok + "" + kreskaWBok + "" + kreskaWBok + "" + kreskaWBok + "" + kreskaWBok);
                }
                for (int j = 0; j < 3; j++) {
                    for (; firstBite <= numbOfBiteToCheck; firstBite++) {
                        if ((plansza & 0b1 << firstBite) != 0b0) {
                            curentBit++;
                        }

                    }
                    if (curentBit == krzyzNumb) {


                        if (j == 2) {
                            System.out.print(krzyżyk + "  " + (p + 1));
                        } else
                            System.out.print(krzyżyk + "" + kreskaWGore);


                    } else if (curentBit == koloNumb) {

                        if (j == 2) {
                            System.out.print(kołko + "  " + (p + 1));

                        } else
                            System.out.print(kołko + "" + kreskaWGore);


                    } else {

                        if (j == 2) {
                            System.out.print("   " + (p + 1));
                        } else
                            System.out.print(" " + "" + kreskaWGore);


                    }
                    numbOfBiteToCheck = numbOfBiteToCheck + 2;
                    curentBit = 0;

                }

            }
            System.out.println();
            numbOfBiteToCheck = 1;//4
            firstBite = 0;//3
            curentBit = 0;

            /////////////////////////wyświetlanie
            if (i <= 4) {//Pierwsze 4 rund nie może być zwycięzcy
                if (i % 2 == 1) {//
                    System.out.println("wybierz wspólrzędne dla x");
                    System.out.println("Wpisz numer wiersza");
                    wspolWierszy = scanner.nextInt();
                    System.out.println("Wpisz numer kolumn");
                    wspoKolumn = scanner.nextInt();
                    if (wspolWierszy <= 3 && wspoKolumn <= 3 && wspolWierszy !=0 && wspoKolumn!=0) {
                        if ((runda1Wiersze == wspolWierszy && runda1Kolumny == wspoKolumn) ||

                                (runda3Wiersze == wspolWierszy && runda3Kolumny == wspoKolumn) ||


                                (runda2Wiersze == wspolWierszy && runda2Kolumny == wspoKolumn) ||

                                (runda4Wiersze == wspolWierszy && runda4Kolumny == wspoKolumn)

                        ) {
                            System.out.println("Te współrzedne są juz zajęte");
                            i--;
                        } else {

                            switch (wspolWierszy) {
                                case 1: {
                                    switch (wspoKolumn) {
                                        case 1:
                                            plansza += 3;
                                            break;
                                        case 2:
                                            plansza += 12;
                                            break;
                                        case 3:
                                            plansza += 48;
                                            break;
                                    }
                                }
                                break;
                                case 2: {
                                    switch (wspoKolumn) {
                                        case 1:
                                            plansza += 192;
                                            break;
                                        case 2:
                                            plansza += 768;
                                            break;
                                        case 3:
                                            plansza += 3072;
                                            break;
                                    }

                                }
                                break;
                                case 3: {
                                    switch (wspoKolumn) {
                                        case 1:
                                            plansza += 12288;
                                            break;
                                        case 2:
                                            plansza += 49152;
                                            break;
                                        case 3:
                                            plansza += 196608;
                                            break;
                                    }
                                    break;

                                }
                                default:
                                    System.out.println("Brak takich wspólrzędnych");


                            }

                            switch (i) {
                                case 1:
                                    runda1Wiersze = wspolWierszy;
                                    runda1Kolumny = wspoKolumn;
                                    break;
                                case 3:
                                    runda3Wiersze = wspolWierszy;
                                    runda3Kolumny = wspoKolumn;
                                    break;

                            }
                        }
                    } else {
                        System.out.println("Nie ma takich wspólrzędnych");
                        i--;
                    }
                    /////////////////////////////////case dla o
                } else {
                    System.out.println("wybierz wspólrzędne dla o");
                    System.out.println("Wpisz numer wiersza");
                    wspolWierszy = scanner.nextInt();
                    System.out.println("Wpisz numer kolumn");
                    wspoKolumn = scanner.nextInt();
                    if (wspolWierszy <= 3 && wspoKolumn <= 3 && wspolWierszy !=0 && wspoKolumn!=0) {
                        if ((runda1Wiersze == wspolWierszy && runda1Kolumny == wspoKolumn) ||

                                (runda3Wiersze == wspolWierszy && runda3Kolumny == wspoKolumn) ||

                                (runda5Wiersze == wspolWierszy && runda5Kolumny == wspoKolumn) ||

                                (runda2Wiersze == wspolWierszy && runda2Kolumny == wspoKolumn) ||

                                (runda4Wiersze == wspolWierszy && runda4Kolumny == wspoKolumn)

                        ) {
                            System.out.println("Te współrzedne są juz zajęte");
                            i--;
                        } else {
                            switch (wspolWierszy) {
                                case 1: {
                                    switch (wspoKolumn) {
                                        case 1:
                                            plansza += 2;
                                            break;
                                        case 2:
                                            plansza += 8;
                                            break;
                                        case 3:
                                            plansza += 32;
                                            break;
                                    }
                                }
                                break;
                                case 2: {
                                    switch (wspoKolumn) {
                                        case 1:
                                            plansza += 128;
                                            break;
                                        case 2:
                                            plansza += 512;
                                            break;
                                        case 3:
                                            plansza += 2048;
                                            break;
                                    }

                                }
                                break;
                                case 3: {
                                    switch (wspoKolumn) {
                                        case 1:
                                            plansza += 8192;
                                            break;
                                        case 2:
                                            plansza += 32768;
                                            break;
                                        case 3:
                                            plansza += 131072;
                                            break;
                                    }
                                    break;

                                }
                                default:
                                    System.out.println("Brak takich wspólrzędnych");


                            }

                            switch (i) {
                                case 2:
                                    runda2Wiersze = wspolWierszy;
                                    runda2Kolumny = wspoKolumn;
                                    break;
                                case 4:
                                    runda4Wiersze = wspolWierszy;
                                    runda4Kolumny = wspoKolumn;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Nie ma takich wspólrzędnych");
                        i--;
                    }

                }
            } else {
                if (
                        (((plansza & 0b11 << 0) == 3) && (((plansza & 0b11 << 2) >> 2) == 3) && ((plansza & 0b11 << 4) >> 4) == 3) ||
                                ((((plansza & 0b11 << 6) >> 6) == 3) && (((plansza & 0b11 << 8) >> 8) == 3) && ((plansza & 0b11 << 10) >> 10) == 3) ||
                                ((((plansza & 0b11 << 12) >> 12) == 3) && (((plansza & 0b11 << 14) >> 14) == 3) && ((plansza & 0b11 << 16) >> 16) == 3) ||
                                (((plansza & 0b11 << 0) == 3) && (((plansza & 0b11 << 6) >> 6) == 3) && ((plansza & 0b11 << 12) >> 12) == 3) ||
                                ((((plansza & 0b11 << 2) >> 2) == 3) && (((plansza & 0b11 << 8) >> 8) == 3) && ((plansza & 0b11 << 12) >> 12) == 3) ||
                                ((((plansza & 0b11 << 4) >> 4) == 3) && (((plansza & 0b11 << 10) >> 10) == 3) && ((plansza & 0b11 << 16) >> 16) == 3) ||
                                (((plansza & 0b11 << 0) == 3) && (((plansza & 0b11 << 8) >> 8) == 3) && ((plansza & 0b11 << 16) >> 16) == 3) ||
                                ((((plansza & 0b11 << 4) >> 4) == 3) && (((plansza & 0b11 << 8) >> 8) == 3) && ((plansza & 0b11 << 12) >> 12) == 3)

                ) {
                    System.out.println("wygrywa X");
                    i = 10;
                } else if (
                        (((plansza & 0b11 << 0) == 2) && (((plansza & 0b11 << 2) >> 2) == 2) && ((plansza & 0b11 << 4) >> 4) == 2) ||
                        ((((plansza & 0b11 << 6) >> 6) == 2) && (((plansza & 0b11 << 8) >> 8) == 2) && ((plansza & 0b11 << 10) >> 10) == 2) ||
                        ((((plansza & 0b11 << 12) >> 12) == 2) && (((plansza & 0b11 << 14) >> 14) == 2) && ((plansza & 0b11 << 16) >> 16) == 2) ||
                        (((plansza & 0b11 << 0) == 2) && (((plansza & 0b11 << 6) >> 6) == 2) && ((plansza & 0b11 << 12) >> 12) == 2) ||
                        ((((plansza & 0b11 << 2) >> 2) == 2) && (((plansza & 0b11 << 8) >> 8) == 2) && ((plansza & 0b11 << 12) >> 12) == 2) ||
                        ((((plansza & 0b11 << 4) >> 4) == 2) && (((plansza & 0b11 << 10) >> 10) == 2) && ((plansza & 0b11 << 16) >> 16) == 2) ||
                        (((plansza & 0b11 << 0) == 2) && (((plansza & 0b11 << 8) >> 8) == 2) && ((plansza & 0b11 << 16) >> 16) == 2) ||
                        ((((plansza & 0b11 << 4) >> 4) == 2) && (((plansza & 0b11 << 8) >> 8) == 2) && ((plansza & 0b11 << 12) >> 12) == 2)
                ) {
                    System.out.println("wygrywa o");
                    i = 10;
                } else if (i == 10) {
                    System.out.println("brak zwycięzców");
                } else {////5 kolejne rundy
                    if (i % 2 == 1) {////5 kolejne rundy
                        System.out.println("wybierz wspólrzędne dla x");
                        System.out.println("Wpisz numer wiersza");
                        wspolWierszy = scanner.nextInt();
                        System.out.println("Wpisz numer kolumn");
                        wspoKolumn = scanner.nextInt();
                        if (wspolWierszy <= 3 && wspoKolumn <= 3 && wspolWierszy !=0 && wspoKolumn!=0) {
                            if ((runda1Wiersze == wspolWierszy && runda1Kolumny == wspoKolumn) ||

                                    (runda3Wiersze == wspolWierszy && runda3Kolumny == wspoKolumn) ||

                                    (runda5Wiersze == wspolWierszy && runda5Kolumny == wspoKolumn) ||

                                    (runda2Wiersze == wspolWierszy && runda2Kolumny == wspoKolumn) ||

                                    (runda4Wiersze == wspolWierszy && runda4Kolumny == wspoKolumn) ||

                                    (runda6Wiersze == wspolWierszy && runda6Kolumny == wspoKolumn) ||

                                    (runda7Wiersze == wspolWierszy && runda7Kolumny == wspoKolumn) ||

                                    (runda8Wiersze == wspolWierszy && runda8Kolumny == wspoKolumn)


                            ) {
                                System.out.println("Te współrzedne są juz zajęte");
                                i--;
                            } else {

                                switch (wspolWierszy) {
                                    case 1: {
                                        switch (wspoKolumn) {
                                            case 1:
                                                plansza += 3;
                                                break;
                                            case 2:
                                                plansza += 12;
                                                break;
                                            case 3:
                                                plansza += 48;
                                                break;
                                        }
                                    }
                                    break;
                                    case 2: {
                                        switch (wspoKolumn) {
                                            case 1:
                                                plansza += 192;
                                                break;
                                            case 2:
                                                plansza += 768;
                                                break;
                                            case 3:
                                                plansza += 3072;
                                                break;
                                        }

                                    }
                                    break;
                                    case 3: {
                                        switch (wspoKolumn) {
                                            case 1:
                                                plansza += 12288;
                                                break;
                                            case 2:
                                                plansza += 49152;
                                                break;
                                            case 3:
                                                plansza += 196608;
                                                break;
                                        }
                                        break;

                                    }
                                    default:
                                        System.out.println("Brak takich wspólrzędnych");


                                }

                                switch (i) {
                                    case 5:
                                        runda5Wiersze = wspolWierszy;
                                        runda5Kolumny = wspoKolumn;
                                        break;
                                    case 7:
                                        runda7Wiersze = wspolWierszy;
                                        runda7Kolumny = wspoKolumn;
                                        break;
                                    case 9:
                                        runda9Wiersze = wspolWierszy;
                                        runda9Kolumny = wspoKolumn;
                                        break;

                                }
                            }
                        } else {
                            System.out.println("Nie ma takich wspólrzędnych");
                            i--;
                        }
                        /////////////////////////////////case dla o
                    } else {
                        System.out.println("wybierz wspólrzędne dla o");
                        System.out.println("Wpisz numer wiersza");
                        wspolWierszy = scanner.nextInt();
                        System.out.println("Wpisz numer kolumn");
                        wspoKolumn = scanner.nextInt();
                        if (wspolWierszy <= 3 && wspoKolumn <= 3 && wspolWierszy !=0 && wspoKolumn!=0) {
                            if (
                                    (runda1Wiersze == wspolWierszy && runda1Kolumny == wspoKolumn) ||

                                            (runda3Wiersze == wspolWierszy && runda3Kolumny == wspoKolumn) ||

                                            (runda5Wiersze == wspolWierszy && runda5Kolumny == wspoKolumn) ||

                                            (runda2Wiersze == wspolWierszy && runda2Kolumny == wspoKolumn) ||

                                            (runda4Wiersze == wspolWierszy && runda4Kolumny == wspoKolumn) ||

                                            (runda6Wiersze == wspolWierszy && runda6Kolumny == wspoKolumn) ||

                                            (runda7Wiersze == wspolWierszy && runda7Kolumny == wspoKolumn) ||

                                            (runda8Wiersze == wspolWierszy && runda8Kolumny == wspoKolumn)

                            ) {
                                System.out.println("Te współrzedne są juz zajęte");
                                i--;
                            } else {
                                switch (wspolWierszy) {
                                    case 1: {
                                        switch (wspoKolumn) {
                                            case 1:
                                                plansza += 2;
                                                break;
                                            case 2:
                                                plansza += 8;
                                                break;
                                            case 3:
                                                plansza += 32;
                                                break;
                                        }
                                    }
                                    break;
                                    case 2: {
                                        switch (wspoKolumn) {
                                            case 1:
                                                plansza += 128;
                                                break;
                                            case 2:
                                                plansza += 512;
                                                break;
                                            case 3:
                                                plansza += 2048;
                                                break;
                                        }

                                    }
                                    break;
                                    case 3: {
                                        switch (wspoKolumn) {
                                            case 1:
                                                plansza += 8192;
                                                break;
                                            case 2:
                                                plansza += 32768;
                                                break;
                                            case 3:
                                                plansza += 131072;
                                                break;
                                        }
                                        break;

                                    }
                                    default:
                                        System.out.println("Brak takich wspólrzędnych");


                                }

                                switch (i) {
                                    case 6:
                                        runda6Wiersze = wspolWierszy;
                                        runda6Kolumny = wspoKolumn;
                                        break;
                                    case 8:
                                        runda8Wiersze = wspolWierszy;
                                        runda8Kolumny = wspoKolumn;
                                        break;
                                }
                            }
                        } else {
                            System.out.println("Nie ma takich wspólrzędnych");
                            i--;
                        }

                    }
                }
            }

        }


    }
}


