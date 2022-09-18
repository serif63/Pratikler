import java.util.Scanner;
public class PalidromilSayi {
    static boolean isPalidrom(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;

        }

        return true;
    }
    public static void main(String[] args) {

    if(isPalidrom("kaya")){
        System.out.println(" si Palidrom bir Kelimedir");
    }
        else {
            System.out.println(" si Palidrom bir Kelime değildir.");
        }

    }
    }

