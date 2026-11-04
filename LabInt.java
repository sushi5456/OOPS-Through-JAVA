import java.util.*;
import java.io.*;
class LabInt{
    public static void main(String args[]){
        Hashtable<String,String> ht=new Hashtable<>();
        try{
            Scanner file=new Scanner(new File("student1.txt"));
            while(file.hasNext()){
                String name=file.next();
                String mobile=file.nextLine().trim();
                ht.put(name,mobile);
            }
            file.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
            return;
        }
        System.out.println("HASH TABLE:");
        for(String name:ht.keySet()){
            System.out.println(name+" : "+ht.get(name));
        }
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n1. Search by Name");
            System.out.println("2. Search by Mobile");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.print("Enter name: ");
                String name=sc.nextLine().trim();
                if(ht.containsKey(name))
                    System.out.println("Mobile: "+ht.get(name));
                else
                    System.out.println("Name not found.");
            }else if(choice==2){
                System.out.print("Enter mobile: ");
                String mobile=sc.nextLine().trim();
                boolean found=false;
                for(String name:ht.keySet()){
                    if(ht.get(name).equals(mobile)){
                        System.out.println("Name: "+name);
                        found=true;
                        break;
                    }
                }
                if(!found)
                    System.out.println("Mobile not found.");
            }else if(choice==3){
                System.out.println("--------------Exiting-------");
                break;
            }else{
                System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}