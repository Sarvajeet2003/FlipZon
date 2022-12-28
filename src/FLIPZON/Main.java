package FLIPZON;

import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Display d1 = new Display();
            Category c1 = new Category();
            AdminNew a1 = new AdminNew();
            Deals deal1 = new Deals();
            Customer cus1 = new Customer();
            Cart cart1 = new Cart();
            boolean t = true;
            boolean four = true;
            boolean one = true;
            boolean fourone=true;
            while(t){
                d1.WelcomePage();
                int n = sc.nextInt();
                if(n==5){
                    t=false;
                }
                if(n==4){
                    while(four) {
                        d1.Customer();
                        int Custttt = sc.nextInt();
                        int ting=0;
                        while(fourone) {
                            if (Custttt == 1) {
                                cus1.Signup();
                                d1.Customer();
                                ting = sc.nextInt();
                            }
                            if (ting == 2 || Custttt == 2) {
                                if (cus1.Login()) {
                                    d1.PersonalCustomer();
                                    int insidepersonalcus = sc.nextInt();
                                    if (insidepersonalcus == 1) {
                                        c1.DispPro();
                                    }
                                    if (insidepersonalcus == 2) {
                                        deal1.ShowDeals();
                                    }
                                    if (insidepersonalcus == 3) {
                                        cart1.AddToCart();
                                    }
                                    if (insidepersonalcus == 4) {
                                        deal1.AddProductsFromDealTocart();
                                    }
                                    if (insidepersonalcus == 5) {
                                        System.out.println(cus1.getCoupons());
                                    }
                                    if (insidepersonalcus == 6) {
                                        System.out.println(cus1.getWalletBalance());
                                    }
                                    if (insidepersonalcus == 7) {
                                        cart1.ViewCart();
                                    }
                                    if (insidepersonalcus == 8) {
                                        cart1.EmptyCart();
                                    }
                                    if (insidepersonalcus == 9) {
                                        cus1.Checkout();
                                        cus1.finalOrderValue();
                                    }
                                    if (insidepersonalcus == 10) {
                                        cus1.UpgradeCustomerStatus();
                                    }
                                    if (insidepersonalcus == 11) {
                                        cus1.Add_to_wallet();
                                    }
                                    if (insidepersonalcus == 12) {
                                        fourone=false;
                                    }
                                } else {
                                    System.out.println("Customer Not Registered");
                                }
                            }
                            if (Custttt == 3) {
                                four = false;
                                fourone=false;
                            }
                        }
                    }
                }
                if(n==3){
                    deal1.ShowDeals();
                }
                if(n==2){
                    c1.DisplayCatPro();
                }
                if(n==1){
                    d1.Admincred();
                    a1.SetCredentials();
                    if(a1.verifyCredentials()) {
                        while(one) {
                            d1.Admin();
                            int adiii=sc.nextInt();
                            if(adiii==1){
                                c1.AddCat();
                            }
                            if(adiii==2){
                                c1.DelCat();
                            }
                            if(adiii==3){
                                c1.AddProduct();
                            }
                            if(adiii==4){
                                c1.DelPro();
                            }
                            if(adiii==5){
                                deal1.ShowDiscounts();
                            }
                            if(adiii==6){
                                deal1.AddGiveawayDeal();
                                deal1.AddPriceforDeal();
                            }
                            if(adiii==7){
                                one =false;
                            }
                        }
                    }
                    else{
                        System.out.println("You are not the admin");
                    }
                }
            }
        }
    }


