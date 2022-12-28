//package FLIPZON;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//
//abstract class Category{
//    private int categoryID;
//    private String name_of_the_category;
//
//    public int getCategoryID() {
//        return categoryID;
//    }
//
//    public void setCategoryID(int categoryID) {
//        this.categoryID = categoryID;
//    }
//
//    public String getName_of_the_category() {
//        return name_of_the_category;
//    }
//
//    public void setName_of_the_category(String name_of_the_category) {
//        this.name_of_the_category = name_of_the_category;
//    }
//
//    public abstract void AddCategory();
//    public abstract void DeleteCategory();
//
//}
//
//
//class Product extends Category{
//    private float ProductID;
//    private float Capacity;
//    private float PowerConsumption;
//    private float Price;
//    private String ProductName;
//
//
//    public Product() {
//
//    }
//
//    public String getProductName() {
//        return ProductName;
//    }
//
//    public void setProductName(String productName) {
//        ProductName = productName;
//    }
//
//    public float getProductID() {
//        return ProductID;
//    }
//
//    public void setProductID(float productID) {
//        ProductID = productID;
//    }
//
//    public float getCapacity() {
//        return Capacity;
//    }
//
//    public void setCapacity(float capacity) {
//        Capacity = capacity;
//    }
//
//    public float getPowerConsumption() {
//        return PowerConsumption;
//    }
//
//    public void setPowerConsumption(float powerConsumption) {
//        PowerConsumption = powerConsumption;
//    }
//
//    public float getPrice() {
//        return Price;
//    }
//
//    public void setPrice(float price) {
//        Price = price;
//    }
//
//    public Product(int categoryID, String name_of_the_category,float ProductID,String ProductName,float Capacity, float PowerConsumption, float Price){
//        this.setCategoryID(categoryID);
//        this.setName_of_the_category(name_of_the_category);
//        this.setProductID(ProductID);
//        this.setProductName(ProductName);
//        this.setCapacity(Capacity);
//        this.setPowerConsumption(PowerConsumption);
//        this.setPrice(Price);
//    }
//
//    ArrayList<Product> PA = new ArrayList<>();
//
//    public void AddCategory (){
//         Scanner sc = new Scanner(System.in);
//         int categoryID=sc.nextInt();
//         String name_of_the_category=sc.next();
//         String ProductName =sc.next();
//         float ProductID = sc.nextFloat();
//         float Capacity= sc.nextFloat();
//         float PowerConsumption= sc.nextFloat();
//         float Price = sc.nextFloat();
//         Product P1 = new Product(categoryID,name_of_the_category,ProductID,ProductName,Capacity,PowerConsumption,Price);
//         PA.add(P1);
//    }
//    public  void DeleteCategory(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Category ID and Name to Delete");
//        int CatIDDel = sc.nextInt();
//        String CatNDel = sc.next();
//
//    }
//    public void GetProducts(){
//        for(Product p:PA){
//            System.out.println(p.getCategoryID()+" "+p.getName_of_the_category() +" " +p.getProductID()+" "+p.getProductName()+" "+p.getCapacity()+" "+p.getPrice()+" "+p.getPowerConsumption());
//        }
//    }
//}
//
//
//
//public class Admin extends Product{
//
//     private String name;
//     private String password;
//     private float discount;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Admin(String name ,String password) {
//        super();
//        this.setName(name);
//        this.setPassword(password);
//
//    }
//    Admin(){
//        super();
//    }
//    ArrayList<Admin> Admin = new ArrayList<>();
//    public void Signup(){
//        Scanner sc = new Scanner(System.in);
//        String name;
//        String pass;
//        System.out.println("Dear Admin,\n" + "Please enter your username and password");
//        name = sc.next();
//        pass = sc.next();
//        Admin A1 = new Admin(name,pass);
//        Admin.add(A1);
//        System.out.println("Welcome "+A1.getName());
//    }
//
//    public void AddCategory(){
//        Product p1 = new Product();
//        p1.AddCategory();
//    }
//}
