package com.dependencydemo;



class HardDrive
{

}
class Ram
{

}
class Laptop
{
    HardDrive hd=new HardDrive();
    Ram ram=new Ram();


}


public class LaptopDependencyDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
    }
}
