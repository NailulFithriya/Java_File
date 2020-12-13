package Abstract_Class;


/**
 * Write a description of class BarisanFibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BarisanFibonacci extends Barisan
{
    // instance variables - replace the example below with your own
    private int nilaiSebelumnya;

    /**
     * Constructor for objects of class BarisanFibonacci
     */
    public BarisanFibonacci()
    {
        super();
        nilaiSebelumnya = 1;
    }

    @Override
    public void naik()
    {
        int var = 1;
        var = nilaiSebelumnya + super.nilaiBerikutnya;
        super.nilaiBerikutnya = nilaiSebelumnya;
        nilaiSebelumnya = var;
        
    }
}
