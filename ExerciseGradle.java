/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisegradle;

/**
 *
 * @author Timothy Kang
 */
public class ExerciseGradle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args[0].equals("lazy")){
            int max = Integer.parseInt(args[1]);
            System.out.println(Math.pow(2, max));
		
	}
	else if(args[0].equals("triangular")){
            int max = Integer.parseInt(args[1]);
            int total = 0;
            for(int i = 0; max != 0; i++){
                total += max;
                max--;
                
            }
            System.out.println(total);
	}
    }
    
}
