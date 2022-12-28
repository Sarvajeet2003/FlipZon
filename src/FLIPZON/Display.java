package FLIPZON;

public class Display {



    public void Admincred(){
        System.out.printf("Dear Admin,\n" +
                "Please enter your username and password\n");
    }
    public void WelcomePage(){
        System.out.printf("WELCOME TO FLIPZON\n" +
                "1) Enter as Admin\n" +
                "2) Explore the Product Catalog\n" +
                "3) Show Available Deals\n" +
                "4) Enter as Customer\n" +
                "5) Exit the Application\n");
    }

    public void catDisp(){
        System.out.println("Enter the Category ID, Name and Product ID and Name, Price and Extra Info ");
    }
    public void Admin(){
        System.out.printf("Please choose any one of the following actions:\n" +
                "1) Add category\n" +
                "2) Delete category\n" +
                "3) Add Product\n" +
                "4) Delete Product\n" +
                "5) Set Discount on Product\n" +
                "6) Add giveaway deal\n" +
                "7) Back\n");
    }


    public void Status(){
        System.out.println("1) ELITE");
        System.out.println("2) PRIME");
    }


    public void Catalog(){
        System.out.printf("");
    }
    public void Deals(){
        System.out.printf("");
    }
    public void Customer(){
        System.out.printf("1) Sign up\n" +
                "2) Log in\n" +
                "3) Back\n");
    }

    public void PersonalCustomer(){
        System.out.printf("1) browse products\n" +
                "2) browse deals\n" +
                "3) add a product to cart\n" +
                "4) add products in deal to cart\n" +
                "5) view coupons\n" +
                "6) check account balance\n" +
                "7) view cart\n" +
                "8) empty cart\n" +
                "9) checkout cart\n" +
                "10) upgrade customer status\n" +
                "11) Add amount to wallet\n" +
                "12) back\n");
    }

    public void SetDis(){
        System.out.printf("Dear Admin give the Product ID you want to add discount for\n" +
                "Enter the Product ID :\n");
    }
    public void StatusDis(){
        System.out.printf("Enter discount for Elite, Prime and Normal customers respectively (in % terms)\n");
    }
}
