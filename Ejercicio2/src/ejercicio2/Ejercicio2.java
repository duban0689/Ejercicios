/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author allegra
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner sc = new Scanner(System.in);
        int x,y,z,cant,i=0;
        JList lista;
        Vector X=new Vector();
        
        x=(40014*Integer.parseInt(this.le1.getText()))%2147483563;
        y=(40692*Integer.parseInt(this.le2.getText()))%2147483399;  
        z=(x-y)%2147483562;
        cant=Integer.parseInt(this.iteracion2.getText());
        
        while(i<=cant){
            i++;
            if(z>=0)
                u=area.format(((double)z/2147483563));
            if(z<0)
                u=area.format((double)2147483562/2147483563);
            x=(40014*x)%2147483563;
            y=(40692*y)%2147483399;  
            z=(x-y)%2147483562;
            X.add(u);
        }
        
        lista=new JList(X);
        panel3.setViewportView(lista);
    }
    
}
