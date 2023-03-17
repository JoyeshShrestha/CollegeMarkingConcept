

	import java.util.Scanner;
	public class student {      
		 Scanner in = new Scanner(System.in);
           int Roll,Java,Co,Web,Stat,acc,percentage;
           String NameID;
           String Grade;
           public void StudentDetail (int p, String q, int r, int s, int t, int u, int v, int w, int per,String g)
               {
                 this.Roll = p;
                  this.NameID=q;
                  this.Java=r;
                  this.Co=s;
                  this.Web=t;
                  this.Stat=u;
                  this.acc=v;
                  this.percentage=w;
                  this.percentage=per;
                  this.Grade=g;
              }
                  
                   public void inputdata() {
                    
                                     	  
                	   System.out.println("Enter Class Roll Number : ");
                       
                       Roll = in.nextInt();
                      
                       System.out.println("Enter Java Marks : ");
                       Java =in.nextInt();
                       
                       System.out.println("Enter Computer organization Marks : ");
                       
                       Co=in.nextInt();
                       System.out.println("Enter Web programming Marks : ");
                       
                       Web=in.nextInt();
                       System.out.println("Enter Statistics Marks : ");
                       
                       Stat=in.nextInt();
                       System.out.println("Enter Accountancy Marks : ");
                       
                       acc=in.nextInt();
                   }
                   public void ShowData()
                   {
                      System.out.println("Roll Number : "+Roll);
                      System.out.println("Students Name : "+NameID);
                      System.out.println("Java  Marks : "+Java);
                      System.out.println("ComputerOrganization Marks : "+Co);
                      System.out.println("Web Programming Marks : "+Web);
                      System.out.println("Statistics Marks : "+Stat);
                      System.out.println("Accountancy Marks : "+acc);
                   }
                   public void cal() {
                   	   int sum= (Java/40)+(Co/40)+(Web/40)+(Stat/40)+(acc/60);
                   			   percentage=sum*100; 
                   			   
                   				if(percentage>=90) {
                   					System.out.println("Grade: A    Superior");
                   				Grade="Superior";
                   				}
                   				else if(percentage>=80) {
                   					System.out.println("Grade: A-    Very good");
                   					Grade="Very good";
                   				}
                   				else if(percentage>=70) {
                   					System.out.println("Grade: B+   First Division");
                   					Grade="First Division";
                   				}
                   				else if(percentage>=60) {
                   					System.out.println("Grade: B   Second division");
                   					Grade="Second Dvision";
                   				}
                   				else if(percentage>=50) {
                   					System.out.println("Grade: B-    Danger of failure");Grade="Third Division";
                   				}
                   				else {
                   					System.out.println("NQ");
                   					Grade="NQ";
                   				}}
                   			   
        }
               


