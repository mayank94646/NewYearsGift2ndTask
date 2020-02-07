package mavenproject;


import mavenproject.chocolate.*;
import mavenproject.toffee.alpenliebe;
import mavenproject.toffee.eclairs;
import mavenproject.toffee.melody;
import mavenproject.toffee.toffee;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<chocolate> chocolates = new ArrayList<>();
        ArrayList<chocolate> allchocolates = allc();

        ArrayList<toffee> toffees = new ArrayList<>();

        HashMap<String,Double> Weight = new HashMap<>();
        HashMap<String,Double> mybag = new HashMap<>();




        System.out.println("**********************\n**********\n********** \nwelcome to decide your new years gift \n**********************\n**********\n********** \n");
        System.out.println("Select from All sweets");
        System.out.println("Press 1: to buy chocolate \n Press 2: to buy toffee \n Press 5 : Total weight of bag \n Press 6: Products in specific price range \n Press 7: Chocolates from low to high according to price \n Press 8: Chocolates from low to high according to Weight \n Press 99: Sorted print according to name" );
        System.out.println("Press 10: Exit");
        Scanner s  = new Scanner(System.in);
        int q = s.nextInt();

        while(q!=10) {
            switch (q) {
                case 1:
                    System.out.println("Pick your type of chocolate");
                    System.out.println("Press 1: bourville \n Press 2: dairymilksilk \n Press 3: ferrero rocher ");
                    int w = s.nextInt();
                    if(w==1)
                    {
                        bournville b= new bournville();
                        System.out.println("Details : \n"+ "Price :" + b.getPrice() + " Weight: " + b.getWeight() );
                        chocolates.add(b);
                        Weight.put("bournville", b.getWeight());
                        mybag.put("bournville", b.getPrice());
                    }
                    else if(w==2)
                    {
                        dairymilksilk d= new dairymilksilk();
                        System.out.println("Details : \n"+ "Price :" + d.getPrice() + " Weight: " + d.getWeight() );
                        chocolates.add(d);
                        Weight.put("dairymilksilk", d.getWeight());
                        mybag.put("dairymilksilk", d.getPrice());
                    }
                    else if(w==3)
                    {
                        ferreroRocher f= new ferreroRocher();
                        System.out.println("Details : \n"+ "Price :" + f.getPrice() + " Weight: " + f.getWeight() );
                        chocolates.add(f);
                        Weight.put("ferrerorocher", f.getWeight());
                        mybag.put("ferrerorocher", f.getPrice());
                    }
                    break;
                case 2:
                    System.out.println("Pick your type of toffee");
                    System.out.println("Press 1: alpenliebe \n Press 2: eclairs \n Press 3: melody");
                    int e = s.nextInt();

                    if(e==1)
                    {
                        alpenliebe a= new alpenliebe();
                        System.out.println("Details : \n"+ "Price :" + a.getPrice() + " Weight: " + a.getWeight() );
                        toffees.add(a);
                        Weight.put("alpenliebe", a.getWeight());
                        mybag.put("alpenliebe", a.getPrice());
                    }
                    else if(e==2)
                    {
                        eclairs l= new eclairs();
                        System.out.println("Details : \n"+ "Price :" + l.getPrice() + " Weight: " + l.getWeight() );
                        toffees.add(l);
                        Weight.put("eclairs", l.getWeight());
                        mybag.put("eclairs", l.getPrice());
                    }
                    else if(e==3)
                    {
                        melody f= new melody();
                        System.out.println("Details : \n"+ "Price :" + f.getPrice() + " Weight: " + f.getWeight() );
                        toffees.add(f);
                        Weight.put("melody", f.getWeight());
                        mybag.put("melody", f.getPrice());
                    }
                    break;
                case 99:
                    System.out.println("in sorted order according to name of sweet");
                    ArrayList<String> myBag = new ArrayList<>(mybag.keySet());
                    Collections.sort(myBag);

                    for (String ss : myBag) {
                        System.out.println( ss  + " Price: " + mybag.get(ss) + "  weight: " + Weight.get(ss));
                    }

                    break;
                case 5:
                    double totalWeight=0;
                    for(Map.Entry m:Weight.entrySet()){
                        totalWeight = totalWeight + (double)m.getValue();
                    }
                    System.out.println("************* \n Total Weight of the bag is :" + totalWeight+"\n ************");
                    break;
                case 6:
                    System.out.println("initial price ");
                    int min = s.nextInt();
                    System.out.println("highest price ");
                    int max = s.nextInt();
                    ArrayList<String> imp = new ArrayList<>(mybag.keySet());
                    System.out.println("products in given range of prices");
                    for (String ss : imp) {
                        if(mybag.get(ss)<max && mybag.get(ss)>min)
                        System.out.println(ss);
                    }
                    break;
                case 7:
                    System.out.println("display chocolates by price low to high ");
                    Collections.sort(allchocolates, new chocolateFromPrice());
                    for (int i = 0; i < allchocolates.size(); i++) {
                        System.out.println(allchocolates.get(i).toString());
                    }
                    break;
                case 8:
                    System.out.println(" display chocolates by weight low to high ");
                    Collections.sort(allchocolates, new chocolateFromWeight());
                    for (int i = 0; i < allchocolates.size(); i++) {
                        System.out.println(allchocolates.get(i).toString());
                    }
                    break;
            }
            System.out.println("\n \n \nSelect from All sweets");
            System.out.println("Press 1: to buy chocolate \n Press 2: to buy toffee \n Press 5 : Total weight of bag \n Press 6: Products in specific price range \n Press 7: Chocolates from low to high according to price \n Press 8: Chocolates from low to high according to Weight \n Press 99: Sorted print according to name" );
            System.out.println("Press 10: Exit");
            q = s.nextInt();
        }
    }

    public static ArrayList<chocolate> allc()
    {
        ArrayList<chocolate> chocolates = new ArrayList<>();
        chocolates.add(new dairymilksilk());
        chocolates.add(new ferreroRocher());
        chocolates.add(new bournville());
        return chocolates;
    }
}
