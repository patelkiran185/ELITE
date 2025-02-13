/*
Write a program that takes an IP address and subnet mask (in CIDR notation, 
e.g., 192.168.1.1/24) as input and calculates the subnet mask in dotted decimal 
format.

Input Format:
---------------
An integer, CIDR

Output Format:
---------------
String, Subnet's IP Address


Sample Input-1:
-----------------
25

Sample Output-1:
------------------
255.255.255.128


Sample Input-2:
-----------------
22

Sample Output-2:
------------------
255.255.252.0
*/

import java.util.Scanner;

public class Subnet {
    // Function to convert CIDR to subnet mask
    public static String cidrToSubnetMask(int cidr) {
        int mask = (0xFFFFFFFF << (32 - cidr));
        return String.format("%d.%d.%d.%d",
                (mask >> 24) & 0xFF,
                (mask >> 16) & 0xFF,
                (mask >> 8) & 0xFF,
                mask & 0xFF);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CIDR notation: ");
        int cidr = scanner.nextInt();

        String subnetMask = cidrToSubnetMask(cidr);
        System.out.println("Subnet Mask: " + subnetMask);

        scanner.close();
    }
}