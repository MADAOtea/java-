import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile ;
import java.io.FileNotFoundException ;

public class RandomAccessDemo 
{
  public static void main(String[] args)
  {
    try
    {
        RandomAccessFile ioStream = new RandomAccessFile( "bytedata", "rw" ) ;
        System.out.println("Writing 3 bytes to the file bytedata.");
        ioStream.writeByte(1);
        ioStream.writeByte(2);
        ioStream.writeByte(3);
        System.out.println("The length of the file is = " + ioStream.length() );
        System.out.println("The file pointer location = " + ioStream.getFilePointer() );
        System.out.println("Moving the file pointer to location 1 ");
        ioStream.seek(1);
        byte oneByte = ioStream.readByte();
        System.out.println("The value at the  locaton 1 is " + oneByte );
        oneByte = ioStream.readByte() ;
        System.out.println("The value at  next the  locaton  is " + oneByte );

        System.out.println("Now we move the file pointer bact to");
        System.out.println("location m and change the byte" );
        ioStream.seek(1);
        ioStream.writeByte(9) ;
        ioStream.seek(1);
        oneByte = ioStream.readByte() ;
        System.out.println("The value at location 1 is now " + oneByte );


        System.out.println("Now we go to the end of the file");
        System.out.println("and write double" );
        ioStream.seek(ioStream.length());
        ioStream.writeDouble(41.99) ;
        System.out.println("The length of the file is = " + ioStream.length() );

        System.out.println("Returning to loaction 3");
        System.out.println("where we wrote the double" );
        ioStream.seek(3);
        double oneDouble = ioStream.readDouble();
        System.out.println("The value at location 3 is now " + oneDouble ); 
     
        ioStream.close() ;

     } // try

     catch( FileNotFoundException e ) {
       System.out.println( "problem opening file" ) ;

     } // catch

                    
       




  
    
    catch(IOException e)
    { 
      System.out.println("Problem with file output.");
    } 
  }
}// RandomAccessDemo 