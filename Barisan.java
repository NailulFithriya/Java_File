
/**
 * Abstract class Barisan - write a description of the class here
 *
 * @author Nailul Fithriya
 * @version 1
 */
public abstract class Barisan
{
    // instance variables - replace the example below with your own
    protected int nilaiBerikutnya;

    public Barisan()
    {
        nilaiBerikutnya = 0;
    }
    
    public Barisan(int nilaiAwal)
    {
        this.nilaiBerikutnya = nilaiAwal;
    }
    
    public int berikutnya()
    {
        naik();
        return nilaiBerikutnya;
    }
    
    public abstract void naik();
}
