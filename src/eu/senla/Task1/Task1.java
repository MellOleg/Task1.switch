package eu.senla.Task1;

import java.util.Scanner;
public class Task1 {

	public static final int low = 0;
	public static final int hight = 1;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введённое число: ");
        int k = in.nextInt();
        in.close();
        
        switch (k > 5 ? hight : low) {
        case low:
        	switch (k > -10000 ? hight : low) {
        	
        	case low:
        		System.out.println(k + " за пределами диапазона ");
        		
        	case hight:
        		System.out.println(k + " в пределах диапазона (-10k, 5]");
        	}
        	
        case hight:
        	switch (k > -1 && k < 11 ? low : hight) {
        	
        	case low:
        		System.out.println(k + " в пределах диапазона [0, 10]");
        		
        	case hight:
        		switch (k > 5 && k < 15 ? low : hight) {
        		
        		case low:
        			System.out.println(k + " в диапазоне [5, 15]");
        			
        		case hight:
        			switch (k < 10001 && k > 10 ? low : hight) {
        			
        			case low:
        				System.out.println(k + " в диапазоне [10, 10k]");
        				
        			
        			case hight:
        				System.out.println(k + " за пределами диапазона");
        			}
        		}
        	}
        }
	}
}
