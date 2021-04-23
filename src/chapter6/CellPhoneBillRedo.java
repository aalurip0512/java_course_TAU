package chapter6;

import chapter6.PhoneBill;

public class CellPhoneBillRedo {

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill(123456);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();
    }
}