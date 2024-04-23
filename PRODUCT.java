public class product {
    String pcode;
    String pname;
    int price;
    public product(String pcode_get,String pname_get,int price_get){
        pcode=pcode_get;
        pname=pname_get;
        price=price_get;

    }
    public int get_price(){
        return price;
    }
    public static void main(String[]args){
        product p_1=new product("a123","tv",2);
        product p_2=new product("b123","ratio",21);
        product p_3=new product("c123","dvd",3);
        if (p_1.price<= p_3.price && p_1.price<= p_2.price)
            System.out.println("lowert prodct id is:"+p_1.pcode);
        if (p_3.price<= p_1.price && p_3.price<= p_2.price)
            System.out.println("lowert prodct id is:"+p_3.pcode);
        if (p_2.price<= p_3.price && p_2.price<= p_1.price)
            System.out.println("lowert prodct id is:"+p_2.pcode);
    }
}
