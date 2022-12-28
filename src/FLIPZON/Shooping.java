package FLIPZON;


import java.util.Scanner;
import java.util.ArrayList;

class Category implements ARRAYSLists{

    private int ci;
    private String cn;
    private float pi;
    private String pn;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String Extrainfo;

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getExtrainfo() {
        return Extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        Extrainfo = extrainfo;
    }

    

    Category(int ci,String cn,float pi,String pn,double price,String Extrainfo){
        setCi(ci);
        setCn(cn);
        setPi(pi);
        setPn(pn);
        setPrice(price);
        setExtrainfo(Extrainfo);
    }

    public void AddCat(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Number of category to add: ");
        Display Dis = new Display();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            Dis.catDisp();
            int ci = sc.nextInt();
            String cn = sc.next();
            float pi = sc.nextFloat();
            String pn = sc.next();
            double price=sc.nextDouble();
            String Extrainfo = sc.next();
            Category c1 = new Category(ci, cn, pi, pn,price,Extrainfo);
            List.add(c1);
        }
    }

    public void DelCat(){
        Scanner sc  = new Scanner(System.in);
        int catIDD= sc.nextInt();
        for(Category c: List){
            if(catIDD==c.getCi()){
                c.setPrice(0);
                c.setPn("0");
                c.setExtrainfo("0");
                c.setPi(0);
                c.setCn("0");
                c.setCi(0);
                break;
            }
        }
    }
    public void DelPro(){
        Scanner sc  = new Scanner(System.in);
        int PIDD= sc.nextInt();
        for(Category c: List){
            if(PIDD==c.getPi()){
                c.setPrice(0);
                c.setPn("0");
                c.setExtrainfo("0");
                c.setPi(0);
                break;
            }
        }
    }

    public Category(int  ci, float pi, String pn, double price, String extrainfo) {
        this.ci = ci;
        this.pi = pi;
        this.pn = pn;
        this.price = price;
        Extrainfo = extrainfo;
    }

    public void AddProduct(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Category ID, to add in: ");
        int cnn = sc.nextInt();
        for(Category c:List){
            if(cnn==c.getCi()){
                System.out.print("Enter the product ID: ");
                float pi =sc.nextFloat();
                System.out.print("Enter the Product Name: ");
                String pn = sc.next();
                System.out.print("Enter the Product Price: ");
                double price=sc.nextDouble();
                System.out.print("Add some Extra Info: ");
                String Extrainfo = sc.next();
                Category c1 = new Category(cnn,pi,pn,price,Extrainfo);
                List.add(c1);
            }
        }

        product p1 = new product(pi,pn,price,Extrainfo);
        for(Category c:List){
            if(c.ci==cnn){
                List.add(p1);
                break;
            }
        }
    }


    public void DisplayCatPro(){
        for(Category c:List){
            System.out.println(c.getCi()+" "+c.getCn()+" "+c.getPi()+" "+c.getPn()+" "+c.getExtrainfo());
        }
    }

    public void DispPro(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Category ID: ");
        int n = sc.nextInt();
        for(Category c:List){
            if(n==c.getCi()){
            System.out.println(c.getCn()+" "+c.getPi()+" "+c.getPn()+" "+c.getExtrainfo());
            }
        }
    }

    public Category(){
        super();
    }
}


class product extends Category{

    public product(float pi,String pn,double price,String Extrainfo){
        setPi(pi);
        setPn(pn);
        setPrice(price);
        setExtrainfo(Extrainfo);
    }

    public product() {
        super();
    }
}