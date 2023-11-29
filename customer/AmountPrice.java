package customer;
import Interface.*;

import java.math.BigInteger;

import static admin.Price.*;

public class AmountPrice {

    NavigationInterface navigationInterface;
    TakeInputInterface takeInputInterface;
    double billbook;
    double billcomp;
    double billcloth;

    int outtotalbooks;
    int outtotalcomps;
    int outtotalcloth;

    double totalbill;
    AmountPrice(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        this.navigationInterface = navigationInterface;
        this.takeInputInterface = takeInputInterface;
    }
    public void APrice() {

        System.out.print("\nEnter number of books to purchase: ");
        int totalBooks = takeInputInterface.takeIntInput(0, 250);
        System.out.print("Enter number of computers to purchase: ");
        int totalComps = takeInputInterface.takeIntInput(0, 450);
        System.out.print("Enter number of cloths to purchase: ");
        int cloths = takeInputInterface.takeIntInput(0, 500);
        billbook = totalBooks * bp;
        billcomp = totalComps * cop;
        billcloth = cloths * clp;
        this.outtotalbooks=totalBooks;
        this.outtotalcomps=totalComps;
        this.outtotalcloth=cloths;
        this.totalbill=(billbook+billcomp+billcloth);
    }

    public void AReceipt(){

        System.out.println("\n\t<<<<<<<<<<<Receipt>>>>>>>>>>>>>");
        System.out.println("\n"+book+" amount "+outtotalbooks+" bill "+billbook+"$");
        System.out.println(compu+" amount "+outtotalcomps+" bill "+billcomp+"$");
        System.out.println(cl+" amount "+outtotalcloth+" bill "+billcloth+"$");

        System.out.println("Total Bill: "+totalbill+"$");


    }
}