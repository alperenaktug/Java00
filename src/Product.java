public class Product<T , U> {

    T item ;
    U price;

    Product(T item , U price){
        this.item = item;
        this.price = price;

    }


    public T getItem(){
        return this.item  ;
    }

    public void setItem(T item){
        this.item = item ;
    }

    public U getPrice(){
        return this.price ;
    }

    public void setPrice(U price){
        this.price = price;
    }

}
