package FLIPZON;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminNew extends product implements ARRAYSLists{

    private String name;
    private String password;
    private double discount;
    private float ProductIDtosetDis;

    public float getProductIDtosetDis() {
        return ProductIDtosetDis;
    }

    public void setProductIDtosetDis(float productIDtosetDis) {
        ProductIDtosetDis = productIDtosetDis;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public AdminNew(String name, String password){
        this.setName(name);
        this.setPassword(password);
    }

    public AdminNew(double dis,float PI){

        this.setDiscount(dis);
        this.setProductIDtosetDis(PI);
    }


    public void SetCredentials(){
        AdminNew A1 = new AdminNew("Beff Jezos","1234");
        AdminList.add(A1);
        AdminNew A2 = new AdminNew("Gill Bates","1234");
        AdminList.add(A2);
    }
    AdminNew(){
        super();
    }

    public Boolean verifyCredentials(){
        Scanner sc = new Scanner(System.in);
        String Username = sc.nextLine();
        String Password = sc.next();
        int flag =0;
        for(AdminNew a:AdminList){
            if(a.getName().equals(Username) && a.getPassword().equals(Password)){
                System.out.println("Welcome "+Username+"\n");
                flag = 1;
            }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }





}









class Deals extends AdminNew{

    private float productID1;

    public float getProductID1() {
        return productID1;
    }

    public void setProductID1(float productID1) {
        this.productID1 = productID1;
    }

    public float getProductID2() {
        return productID2;
    }

    public void setProductID2(float productID2) {
        this.productID2 = productID2;
    }

    private float productID2;


    public Deals(){
        super();
    }
    public Deals(float ProductID1,float ProductID2){
        this.setProductID1(ProductID1);
        this.setProductID2(ProductID2);
    }

    public void AddProductsFromDealTocart(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Category IDs to add");
        int ci1 = sc.nextInt();
        int ci2 = sc.nextInt();
        System.out.println("Enter the Quantity to add");
        int pq1 = sc.nextInt();
        int pq2 = sc.nextInt();
        for(Deals d:DealList){
            if(d.getProductID1()==ci1) {
                Cart c11 = new Cart(d.getProductID1(), pq1, d.getPrice());
                CartFromDealList.add(c11);
            }
            if(d.getProductID2()==ci2) {
                Cart c11 = new Cart(d.getProductID2(), pq2, d.getPrice());
                CartFromDealList.add(c11);
            }
        }
    }



    public void ShowDiscounts(){
        for(Category cl:List){
            for (AdminNew a:DisList){
                if(cl.getPi()==a.getProductIDtosetDis()){
                    cl.setPrice(cl.getPrice()*(a.getDiscount()/100));
                    break;
                }
            }
        }
    }


    public void AddGiveawayDeal(){
        Scanner sc = new Scanner(System.in);
        float EnterProductID1=sc.nextFloat();
        float EnterProductID2=sc.nextFloat();
        Deals d1 = new Deals(EnterProductID1,EnterProductID2);
        DealList.add(d1);
    }

    public void ShowDeals(){
        System.out.println("The Product IDs mentioned are on Combined Discount and Please refer the product name from product catalog");
        for(Deals d:DealList){
            System.out.println(d.getProductID1()+" "+d.getProductID1());
        }
    }
    public void AddPriceforDeal(){
        Scanner sc = new Scanner(System.in);
        for(Category c:List){
            for(Deals dls: DealList){
                if(c.getPi()==dls.productID1 || c.getPi()==dls.getProductID2()){
                    for(Customer cl: CustomerList){
                        if(cl.getStatus().equals("Normal")){
                            System.out.println("Enter the Combined price for Normal Customer");
                            int priceNor = sc.nextInt();
                            for(Cart cll:CartList){
                                cll.setFinalAmount(priceNor);
                            }
                        }
                        if(cl.getStatus().equals("Elite")){
                            System.out.println("Enter the Combined price for Elite Customer");
                            int priceEli = sc.nextInt();
                            for(Cart cll:CartList){
                                cll.setFinalAmount(priceEli);
                            }
                        }
                        if(cl.getStatus().equals("Prime")){
                            System.out.println("Enter the Combined price for Prime Customer");
                            int pricePri = sc.nextInt();
                            for(Cart cll:CartList){
                                cll.setFinalAmount(pricePri);
                            }
                        }
                    }
                }
            }
        }
    }
}
