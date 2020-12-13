package Abstract_Class;

/**
 * Write a description of class BarisanAritmetika here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BarisanPangkat extends Barisan
{
    // instance variables - replace the example below with your own
    public int pangkat;

    /**
     * Constructor for objects of class BarisanAritmetika
     */
    public BarisanPangkat(int nilaiAwal, int pangkat)
    {
        super(nilaiAwal);
        this.pangkat = pangkat;
    }

    //@Override
    public void naik()
    {
        super.nilaiBerikutnya = (int) Math.pow(super.nilaiBerikutnya, pangkat);
    }
}
