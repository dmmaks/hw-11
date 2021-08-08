public class FizzBuzzClass {
    private int number;
    private int n;

    public FizzBuzzClass(int n)
    {
        number = 1;
        this.n = n;
    }

    public synchronized void fizz()
    {
        while (number <= n)
        {
            if (number % 3 == 0 && number % 5 != 0)
            {
                System.out.println("fizz");
                number++;
                notifyAll();
            }
            else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void buzz()
    {
        while (number <= n)
        {
            if (number % 5 == 0 && number % 3 != 0)
            {
                System.out.println("buzz");
                number++;
                notifyAll();
            }
            else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void fizzbuzz()
    {
        while (number <= n)
        {
            if (number % 3 == 0 && number % 5 == 0)
            {
                System.out.println("fizzbuzz");
                number++;
                notifyAll();
            }
            else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void number()
    {
        while (number <= n)
        {
            if (number % 3 != 0 && number % 5 != 0)
            {
                System.out.println(number);
                number++;
                notifyAll();
            }
            else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
