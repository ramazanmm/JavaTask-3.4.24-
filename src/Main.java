import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Scanner task = new Scanner(System.in);
//        System.out.print("ilk reqemi daxil edin: ");
//        int reqem1 = task.nextInt();
//        System.out.print("ikince reqemi daxil edin: ");
//        int reqem2 = task.nextInt();
//        task.nextLine();
//        System.out.print("operation: ");
//        String operation = task.nextLine();
//
//        switch (operation){
//            case "*" -> System.out.println(reqem1 * reqem2);
//            case "/" -> System.out.println(reqem1 / reqem2);
//            case "+" -> System.out.println(reqem1 + reqem2);
//            case "-" -> System.out.println(reqem1 - reqem2);
//            default -> System.out.println("melumati dogru daxil edin");
//
//        }







//        Scanner task1 = new Scanner(System.in);
//        System.out.print("necenci ay oldugunu daxil edin: ");
//        int month = task1.nextInt();
//
//        switch (month){
//            case 12,1,2 :
//                System.out.println("qis");
//                break;
//            case 3,4,5 :
//                System.out.println("yaz");
//                break;
//            case 6,7,8 :
//                System.out.println("yay");
//                break;
//            case 9,10,11 :
//                System.out.println("payiz");
//                break;
//            default:
//                System.out.println("reqemi dogru daxil edin");
//                break;
//        }






//        verilen isiq rengine gore svetaforun isleme prinsipini simulasiya edin, sari gelse "Hazirlasin",
//            qirmizi gelse "Dayanin",  yasil gelse "Hereket edin" cap olunsun
//
//        Scanner isiqfor = new Scanner(System.in);
//        System.out.println("isiqforun rengini daxil edin: ");
//        String reng = isiqfor.nextLine();
//
//        switch (reng){
//            case "qirmizi" -> System.out.println("dayanin");
//            case "sari" -> System.out.println("hazirlasin");
//            case "yasil" -> System.out.println("herket edin");
//            default -> System.out.println("rengi dogru daxil edin");
//        }







//        Kicik bir proqram yazin, proqram sizden valyuta, hedef valyuta , ve deyeri alsin, ve
//        verilen valyutadan hedef valyutaya cevirib deyeri cap etsin
//
        Scanner task = new Scanner(System.in);
        System.out.print("movcud valyutani daxil edin: ");
        String valyuta = task.nextLine();
        System.out.print("deyeri daxil edin: ");
        int deyer = task.nextInt();
        task.nextLine();
        System.out.print("hedef valyutani daxil edin: ");
        String hedefvalyuta = task.nextLine();

        switch (hedefvalyuta){
            case "dollar-azn" -> System.out.println(deyer * 1.7);
            case "azn-dollar" -> System.out.println(deyer / 1.7);
            case "azn-euro" -> System.out.println(deyer / 2);
            case "euro-azn" -> System.out.println(deyer * 2);
            case "dollar-euro" -> System.out.println(deyer * 0.8);
            case "euro-dollar" -> System.out.println(deyer / 0.8);
            default -> System.out.println("daxil etdiyiniz valyuta yalnisdir");
        }

    }
}