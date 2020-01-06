package com.Way_To_Java;
class HelloWorld{
 //Non-Static Class Example
    public void nonstaticTest(){
        System.out.println("Non Static Method!");
    }
 //Static Class Example
    static void staticTest(){
        System.out.println("Static Method!");
    }
    
 //Main Class
   public static void main(String[] args){
        System.out.println("Hello World!"); //Printing Hello World
        HelloWorld HelloWorldobj= new HelloWorld(); //Creating Object Of Non-Static Class
        staticTest();
        HelloWorldobj.nonstaticTest();
   }
}
