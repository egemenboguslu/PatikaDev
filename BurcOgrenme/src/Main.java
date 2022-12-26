import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gun, ay;

        System.out.print("Doğduğunuz günü girin:");
        gun = input.nextInt();

        System.out.print("Doğduğunuz ayı girin:");
        ay = input.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.print("Burcunuz oğlak");
                } else {
                    System.out.print("Burcunuz kova.");
                }
            } else {
                System.out.print("1.ay 31 gündür.");
            }

        } else if (ay == 2) {
            if (gun >= 1 && gun <= 28) {
                if (gun <= 19) {
                    System.out.print("Burcunuz kova.");
                } else {
                    System.out.print("Burcunuz balık.");
                }
            } else {
                System.out.print("2.ay 28 gündür.");
            }

        } else if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 20) {
                    System.out.print("Burcunuz balık.");
                } else {
                    System.out.print("Burcunuz koç.");
                }
            } else {
                System.out.print("3.ay 31 gündür.");
            }

        } else if (ay == 4) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 20) {
                    System.out.print("Burcunuz koç.");
                } else {
                    System.out.print("Burcunuz boğa.");
                }
            } else {
                System.out.print("4.ay 30 gündür.");
            }

        } else if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.print("Burcunuz boğa.");
                } else {
                    System.out.print("Burcunuz ikizler.");
                }
            } else {
                System.out.print("5.ay 31 gündür.");
            }

        } else if (ay == 6) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    System.out.print("Burcunuz ikizler.");
                } else {
                    System.out.print("Burcunuz yengeç.");
                }
            } else {
                System.out.print("6.ay 30 gündür.");
            }

        } else if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.print("Burcunuz yengeç.");
                } else {
                    System.out.print("Burcunuz aslan.");
                }
            } else {
                System.out.print("7.ay 31 gündür.");
            }

        } else if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.print("Burcunuz aslan.");
                } else {
                    System.out.print("Burcunuz başak.");
                }
            } else {
                System.out.print("8.ay 31 gündür.");
            }

        } else if (ay == 9) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    System.out.print("Burcunuz başak.");
                } else {
                    System.out.print("Burcunuz terazi.");
                }
            } else {
                System.out.print("9.ay 30 gündür.");
            }

        } else if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.print("Burcunuz terazi.");
                } else {
                    System.out.print("Burcunuz akrep.");
                }
            } else {
                System.out.print("10.ay 31 gündür.");
            }

        } else if (ay == 11) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 21) {
                    System.out.print("Burcunuz akrep.");
                } else {
                    System.out.print("Burcunuz yay.");
                }
            } else {
                System.out.print("11.ay 30 gündür.");
            }

        } else if (ay == 12) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 21) {
                    System.out.print("Burcunuz yay.");
                } else {
                    System.out.print("Burcunuz oğlak.");
                }
            } else {
                System.out.print("12.ay 31 gündür.");
            }

        } else {
            System.out.println("Yanlis deger girdiniz.");
        }
    }
}