package com.senati.pe;

import java.util.Scanner;
import java.util.*;


public class Caso5 {

	public static void main(String[] args) {
		//variables
				int i =1;
				double nmen=Double.POSITIVE_INFINITY;
				int n=0;
				//entrada de datos multiples con while
				while (i<=5){
					Scanner sc=new Scanner(System.in);
					System.out.print("ingresa el numero "+i+" : ");
					n=sc.nextInt();
					if (n < nmen) {
						nmen=n;
						
					}
					i++;
				}
				System.out.println("el numero menor es : "+(int)nmen);
			}
		}

