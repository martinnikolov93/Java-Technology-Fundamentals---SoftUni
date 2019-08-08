import java.io.*;
import java.util.Scanner;

public class EncrypterDecrypter {


    private static void stringToFile( String text, String fileName )
    {
        try
        {
            File file = new File( fileName );

            // if file doesnt exists, then create it
            if ( ! file.exists( ) )
            {
                file.createNewFile( );
            }

            FileWriter fw = new FileWriter( file.getAbsoluteFile( ) );
            BufferedWriter bw = new BufferedWriter( fw );
            bw.write( text );
            bw.close( );
            //System.out.println("Done writing to " + fileName); //For testing
        }
        catch( IOException e )
        {
            System.out.println("Error: " + e);
            e.printStackTrace( );
        }
    } //End method stringToFile

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = "";
        System.out.println("To stop the program type - stop");

        long output;

        StringBuilder sB = new StringBuilder();


        while (true){

            System.out.println("Type something:");
            input = scanner.nextLine();
            if (input.equals("stop")) {
                return;
            }
            System.out.println("Enter KEY[a number]:");
            long key = Integer.parseInt(scanner.nextLine());
            long editedKey = key + key + key - 24;

            System.out.println("Command[enc,dec]:");
            String command = scanner.nextLine();
            if (command.equals("enc")){
                for (int i = 0; i < input.length(); i++) {
                    char symbol = input.charAt(i);
                    output = symbol + editedKey;
                    sB.append((char)output);
                }
                System.out.println("-------------");
                System.out.println("Encrypted code:");
                System.out.println(sB);
                System.out.println("-------------");
                System.out.println();
                stringToFile("Encryption: " + sB.toString() + " | KEY:" + key,"test.txt");
                sB.delete(0,50000000);
            } else if (command.equals("dec")) {
                for (int i = 0; i < input.length(); i++) {
                    char symbol = input.charAt(i);
                    output = symbol - editedKey;
                    sB.append((char)output);
                }
                System.out.println("-------------");
                System.out.println("Decrypted code:");
                System.out.println(sB);
                System.out.println("-------------");
                System.out.println();
                stringToFile("Decryption: " + sB.toString() + " | KEY:" + key,"test.txt");
                sB.delete(0,50000000);
            } else {
                System.out.println("Wrong command!");
            }
        }

    }



}
