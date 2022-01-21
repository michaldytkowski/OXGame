import java.util.Scanner;

public class GameOX {

    public static int Check(char[][] tab, char x){
        int zm1 = 0;
        int zm2 = 0;
        int zm3 = 0;
        int zm4 = 0;
        int zm5 = 0;
        int zm6 = 0;
        int zm7 = 0;
        int zm8 = 0;
        int zm9 = 0;


        for(int i = 0; i < 3; i++){
            if(tab[0][i] == x){
                zm1++;
            }
        }
        if(zm1 == 3){
            return 1;
        }

        for(int i = 0; i < 3; i++){
            if(tab[1][i] == x){
                zm2++;
            }
        }
        if(zm2 == 3){
            return 1;
        }

        for(int i = 0; i < 3; i++){
            if(tab[2][i] == x){
                zm3++;
            }
        }
        if(zm3 == 3){
            return 1;
        }

        for(int i = 0; i < 3; i++){
            if(tab[i][0] == x){
                zm4++;
            }
        }
        if(zm4 == 3){
            return 1;
        }

        for(int i = 0; i < 3; i++){
            if(tab[i][1] == x){
                zm5++;
            }
        }
        if(zm5 == 3){
            return 1;
        }

        for(int i = 0; i < 3; i++){
            if(tab[i][2] == x){
                zm6++;
            }
        }
        if(zm6 == 3){
            return 1;
        }

        for(int i = 0; i < 3; i++){
            if(tab[i][i] == x){
                zm7++;
            }
        }
        if(zm7 == 3){
            return 1;
        }

        int c = 2;

        for(int i = 0; i < 3; i++){
            if(tab[i][c] == x){
                zm8++;
            }
            c--;
        }
        if(zm8 == 3){
            return 1;
        }

        if (tab[0][0] == 'O' || tab[0][0] == 'X'){
            zm9++;
        }
        if (tab[0][1] == 'O' || tab[0][1] == 'X'){
            zm9++;
        }
        if (tab[0][2] == 'O' || tab[0][2] == 'X'){
            zm9++;
        }
        if (tab[1][0] == 'O' || tab[1][0] == 'X'){
            zm9++;
        }
        if (tab[1][1] == 'O' || tab[1][1] == 'X'){
            zm9++;
        }
        if (tab[1][2] == 'O' || tab[1][2] == 'X'){
            zm9++;
        }
        if (tab[2][0] == 'O' || tab[2][0] == 'X'){
            zm9++;
        }
        if (tab[2][1] == 'O' || tab[2][1] == 'X'){
            zm9++;
        }
        if (tab[2][2] == 'O' || tab[2][2] == 'X'){
            zm9++;
        }

        if (zm9 == 9){
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] znaki = new char[3][3];
        boolean IsO = true;


        while (true) {

            int res = Check(znaki, 'O');
            int res2 = Check(znaki, 'X');

            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(znaki[i][j] + " | ");
                }
                System.out.println();
            }

            if (res == 1){
                System.out.println("Wygraly 0!");
                break;
            }
            else if (res2 == 1){
                System.out.println("Wygraly X!");
                break;
            }
            else if (res == 2 || res2 == 2){
                System.out.println("Zajete wszystkie pola bez wygranej! Remis!");
                break;
            }

            if (IsO) {
                System.out.println("==================================");
                System.out.println("Jesteś 0");
                System.out.print("Podaj wspolrzedna (1 - 9): ");
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 9) {
                    if (choice == 1) {
                        if (znaki[0][0] == 'O' || znaki[0][0] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[0][0] = 'O';
                        }
                    }
                    if (choice == 2) {
                        if (znaki[0][1] == 'O' || znaki[0][1] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[0][1] = 'O';
                        }
                    }
                    if (choice == 3) {
                        if (znaki[0][2] == 'O' || znaki[0][2] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[0][2] = 'O';
                        }
                    }
                    if (choice == 4) {
                        if (znaki[1][0] == 'O' || znaki[1][0] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[1][0] = 'O';
                        }
                    }
                    if (choice == 5) {
                        if (znaki[1][1] == 'O' || znaki[1][1] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[1][1] = 'O';
                        }
                    }
                    if (choice == 6) {
                        if (znaki[1][2] == 'O' || znaki[1][2] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[1][2] = 'O';
                        }
                    }
                    if (choice == 7) {
                        if (znaki[2][0] == 'O' || znaki[2][0] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[2][0] = 'O';
                        }
                    }
                    if (choice == 8) {
                        if (znaki[2][1] == 'O' || znaki[2][1] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[2][1] = 'O';
                        }
                    }
                    if (choice == 9) {
                        if (znaki[2][2] == 'O' || znaki[2][2] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[2][2] = 'O';
                        }
                    }
                    IsO = false;
                    System.out.println("==================================");
                    continue;
                } else {
                    System.out.println("Zły znak! Straciłeś kolejke!");
                    System.out.println("==================================");
                    IsO = false;
                    continue;
                }
            } else if (!IsO) {
                System.out.println("=====================================");
                System.out.println("Jesteś X");
                System.out.print("Podaj wspolrzedna (1 - 9): ");
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 9) {
                    if (choice == 1) {
                        if (znaki[0][0] == 'O' || znaki[0][0] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[0][0] = 'X';
                        }
                    }
                    if (choice == 2) {
                        if (znaki[0][1] == 'O' || znaki[0][1] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[0][1] = 'X';
                        }
                    }
                    if (choice == 3) {
                        if (znaki[0][2] == 'O' || znaki[0][2] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[0][2] = 'X';
                        }
                    }
                    if (choice == 4) {
                        if (znaki[1][0] == 'O' || znaki[1][0] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[1][0] = 'X';
                        }
                    }
                    if (choice == 5) {
                        if (znaki[1][1] == 'O' || znaki[1][1] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[1][1] = 'X';
                        }
                    }
                    if (choice == 6) {
                        if (znaki[1][2] == 'O' || znaki[1][2] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[1][2] = 'X';
                        }
                    }
                    if (choice == 7) {
                        if (znaki[2][0] == 'O' || znaki[2][0] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[2][0] = 'X';
                        }
                    }
                    if (choice == 8) {
                        if (znaki[2][1] == 'O' || znaki[2][1] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[2][1] = 'X';
                        }
                    }
                    if (choice == 9) {
                        if (znaki[2][2] == 'O' || znaki[2][2] == 'X'){
                            System.out.println("Pole jest zajete! Straciles kolejke!");
                        }
                        else {
                            znaki[2][2] = 'X';
                        }
                    }
                    IsO = true;
                    System.out.println("==================================");
                    continue;
                }
                else {
                        System.out.println("Zły znak! Straciłeś kolejke!");
                        IsO = true;
                        continue;
                    }
                }
            }
        }
    }

