
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;

public class Mainwala{
                 
                    public static void main(String args[]) throws IOException
                        {
                           
                            student obj=new student();
                           
                            
                            obj.inputdata();
                            obj.ShowData();
                            obj.cal();
                            
                            try {
                            	File f= new File("D:/Project/Report.txt");
                    			PrintWriter pw= new PrintWriter(new FileOutputStream(f,true));
                    			pw.append("\n"+obj.Roll+" "+obj.NameID+"  Java " +obj.Java+"  CO "+obj.Co+"  Web programming "+obj.Web+" Statistics "+obj.Stat+"  Accountancy "+obj.acc+"  Percentage "+obj.percentage+"%   Grade "+obj.Grade+"\n");
                    			pw.close();
                    		}
                    	catch(Exception e) {
                    		
                    	}
                    	}
                        
                       }
                   
                