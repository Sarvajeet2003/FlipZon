package FLIPZON;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class Cart extends product implements ARRAYSLists{

    private int Quantity;

    private float EnterProductID;
    private double FinalAmount;

    private double AmountPayable;

    public double getAmountPayable() {
        return AmountPayable;
    }

    public void setAmountPayable(double amountPayable) {
        AmountPayable = amountPayable;
    }

    public double getFinalAmount() {
        return FinalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        FinalAmount = finalAmount;
    }

    public Cart() {

    }

    public float getEnterProductID() {
        return EnterProductID;
    }

    public void setEnterProductID(float enterProductID) {
        EnterProductID = enterProductID;
    }


    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }


    Cart(float EnterProductID, int Quantity,double Finalamount){
        super();
        setEnterProductID(EnterProductID);
        setQuantity(Quantity);
        setFinalAmount(Finalamount);
    }

    

    public void AddToCart(){
        Scanner sc = new Scanner(System.in);
        float EnterProductID;
        int Quantity ;
        System.out.println("Dear Customer,\n" + "Please enter productID and Quantity");
        EnterProductID = sc.nextFloat();
        Quantity = sc.nextInt();
        for(Category c:List){
            if(c.getPi()==EnterProductID){
                FinalAmount=c.getPrice();
            }
        }
        Cart P1 = new Cart(EnterProductID,Quantity,FinalAmount);
        CartList.add(P1);
    }



    public void EmptyCart(){
        CartList.clear();
    }

    public void ViewCart(){
        for(Category p:List){
            for(Cart c:CartList){
                if(p.getPi()==c.getEnterProductID()){
                    System.out.println(p.getPi()+" "+p.getPn()+" "+p.getPrice()+" "+p.getExtrainfo()+" ");
                }
            }
        }
    }
}
public class Customer extends Cart implements ARRAYSLists{

    private String name;
    private String password;
    private String Status;
    private int WalletBalance=1000;
    private int Coupons=0;

    public int getCoupons() {
        return Coupons;
    }

    public void setCoupons(int coupons) {
        Coupons = coupons;
    }

    private double OrderValue;
    private double DeliveryFees;

    public double getDeliveryFees() {
        return DeliveryFees;
    }

    public void setDeliveryFees(double deliveryFees) {
        DeliveryFees = deliveryFees;
    }
    public double getOrderValue() {
        return OrderValue;
    }

    public void setOrderValue(double orderValue) {
        OrderValue = orderValue;
    }

    private double DeliveryCharge;

    public double getDeliveryCharge() {
        return DeliveryCharge;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        DeliveryCharge = deliveryCharge;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getWalletBalance() {
        return WalletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        WalletBalance += walletBalance;
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

    public void CutMoney(int money){
        WalletBalance = WalletBalance-money;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(String name ,String password, String Status,int WalletBalance,int coupons) {
        super();
        this.setName(name);
        this.setPassword(password);
        this.setStatus(Status);
        this.setWalletBalance(WalletBalance);
        this.setCoupons(coupons);

    }
    Customer(){
        super();
    }
     
    public void Signup(){
        Scanner sc = new Scanner(System.in);
        String name;
        String pass ;
        System.out.println("Dear Customer,\n" + "Please enter your username and password");
        name = sc.next();
        pass = sc.next();
        String Status = "Normal";
        int WalletBalance=1000;
        int coupons = 0;
        Customer C1 = new Customer(name,pass,Status,WalletBalance,coupons);
        CustomerList.add(C1);
    }

    public Boolean Login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and Password: ");
        String name = sc.next();
        String pass = sc.next();
        int flag =0;
        for(Customer c:CustomerList){
           if(c.getPassword().equals(pass) && c.getName().equals(name)){
               System.out.println("Welcome Beloved Customer: "+name);
               System.out.println("Login Successful");
               flag=1;
               break;
           }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }



    public void UpgradeCustomerStatus(){
        Scanner sc = new Scanner(System.in);
        Display d1 = new Display();
        d1.Status();
        int newStatus=sc.nextInt();
        String a = "ELITE";
        String b = "PRIME";

        if(newStatus==1){
            setStatus(a);
            CutMoney(300);
            for(Customer c:CustomerList){
                c.setStatus("Elite");
            }
        }
        if(newStatus==2){
            setStatus(b);
            CutMoney(200);
            for(Customer c:CustomerList){
                c.setStatus("Prime");
            }
        }
        System.out.println("Successfully Upgraded");

    }

    public void Checkout(){
        for(Category c:List){
            for(Cart cl: CartList){
                if(c.getPi()==cl.getEnterProductID()) {
                    cl.setFinalAmount(cl.getQuantity() * c.getPrice());
                }
            }
        }
        for(Customer c:CustomerList){
            for(Cart cl:CartList){
                if(c.getStatus().equals("Normal")){
                    c.setDeliveryFees(100+0.05*cl.getFinalAmount());
                }
                if(c.getStatus().equals("Elite")){
                    c.setDeliveryFees(100+cl.getFinalAmount());
                }
                if(c.getStatus().equals("Prime")){
                    c.setDeliveryFees(100+0.02*cl.getFinalAmount());
                }
            }
        }
    }

    public void finalOrderValue(){
        for(Customer c:CustomerList){
            for(Cart cl:CartList){
                c.setAmountPayable(c.getDeliveryFees()+cl.getFinalAmount());
            }
            System.out.println(c.getAmountPayable());
        }

        int max = 4;
        int min = 1;
        int max2 = 2;
        int min2 = 1;
        Random randomNum = new Random();
        int showMe = min + randomNum.nextInt(max);
        int showMe2 = min2 + randomNum.nextInt(max2);
        for(Customer c:CustomerList){
            if(c.getFinalAmount()>=5000 && c.getStatus().equals("Elite")){
                    c.setCoupons(showMe);
            }
            if(c.getFinalAmount()>=5000 && c.getStatus().equals("Prime")){
                c.setCoupons(showMe2);
            }
        }
    }


    public void Elite(){
        this.setDeliveryCharge(100);
    }

    public void NormalCus(){
        this.setDeliveryCharge(100+(0.05*getOrderValue()));
    }


    public void Prime(){
        this.setDeliveryCharge(100+(0.02*getOrderValue()));
    }

    public void Add_to_wallet(){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        setWalletBalance(amount);
    }



    public void DispCusStatus(){
        for(Customer c:CustomerList){
            System.out.println(c.getStatus());
        }
    }

}


interface ARRAYSLists{
    ArrayList<Customer> CustomerList = new ArrayList<>();
    ArrayList<Cart> CartList = new ArrayList<>();
    ArrayList<AdminNew> AdminList = new ArrayList<>();
    ArrayList<AdminNew> DisList = new ArrayList<>();
    ArrayList<Category> List = new ArrayList<>();
    ArrayList <Deals> DealList = new ArrayList<>();
    ArrayList<Cart> CartFromDealList = new ArrayList<>();
}