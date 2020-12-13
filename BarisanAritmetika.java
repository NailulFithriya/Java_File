package Abstract_Class;

/**
 * Write a description of class BarisanAritmetika here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BarisanAritmetika extends Barisan
{
    // instance variables - replace the example below with your own
    public int kenaikan;

    /**
     * Constructor for objects of class BarisanAritmetika
     */
    public BarisanAritmetika(int nilaiAwal, int kenaikan)
    {
        super(nilaiAwal);
        this.kenaikan = kenaikan;
    }

    @Override
    public void naik()
    {
        super.nilaiBerikutnya += kenaikan;
    }
}
