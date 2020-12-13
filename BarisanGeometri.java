package Abstract_Class;

/**
 * Write a description of class BarisanGeometri here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BarisanGeometri extends Barisan
{
    // instance variables - replace the example below with your own
    public int rasioPengali;

    /**
     * Constructor for objects of class BarisanGeometri
     */
    public BarisanGeometri(int nilaiAwal, int rasioPengali)
    {
        super(nilaiAwal);
        this.rasioPengali = rasioPengali;
    }

    @Override
    public void naik()
    {
        super.nilaiBerikutnya *= rasioPengali;
    }
}
