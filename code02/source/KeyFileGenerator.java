import java.util.Random;
import java.lang.Integer;
import java.io.*;

class KeyFileGenerator {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Takes 1 argument: the number of bytes in the keyfile.");
        } else {
            int size = Integer.parseInt(args[0]);
            try {
                File f = new File("keyfile");
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                Random r = new Random();
                for(int i = 0;i < size; i++) {
                    dos.writeByte((byte)(256*r.nextFloat()));
                }
                dos.flush();
                dos.close();
                System.out.print(size*8);
                System.out.println(" bit keyfile generated in file keyfile.");
            } catch(IOException e){System.out.println("unknown error");}
        }
    }
}
