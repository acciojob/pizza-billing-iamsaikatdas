package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (this.isVeg == true){
            price+=300;
        }else{
            price+=400;
        }
        bill = "Best price of the Pizza: " + price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    boolean isFlag1 = false;
    public void addExtraCheese(){
        // your code goes here
        if (isFlag1 == false){
            this.price += 80;
            bill+="Extra Cheese Added: 80\n";
            isFlag1 = true;
        }
    }
    boolean isFlag2 = false;
    public void addExtraToppings(){
        // your code goes here
        if(isFlag2 == false){
            if (isVeg == true){
                this.price += 70;
                bill+="Extra Toppings Added: 70\n";
            }else{
                this.price +=120;
                bill="Extra Toppings Added: 120\n";
            }
            isFlag2 = true;
        }
    }

    boolean isFlag3 = false;
    public void addTakeaway(){
        // your code goes here
        if (isFlag3 == false){
            this.price+=20;
            bill+="Paperbag Added: "+20+"\n";
            isFlag3=true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = ("Base Price Of The Pizza: " + (isVeg?300:400)+
                (isFlag1?("\nExtra Cheese Added: 80"):" ") +
                (isFlag2?("\nExtra Toppings Added: "  + (isVeg?70:120)):"") +
                (isFlag3?("\nPaperbag Added: 20"):"") +
                "\nTotal Price: "+ this.price + "\n"
        );
        return this.bill;
    }
}
