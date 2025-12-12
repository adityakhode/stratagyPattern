import java.util.*;

interface paymentStrategy
    {
        void pay(int amount);
    }

class CCPayment implements paymentStrategy
    {
        public void pay(int amount)
            {
                System.out.println("Paid using Credit Card: " + amount);
            }
    }

class UPIpayment implements paymentStrategy
    {
        public void pay(int amount)
            {
                System.out.println("Paid using UPI: " + amount);
            }
    }

class payContext
    {
        private paymentStrategy strategy;

        public payContext(paymentStrategy strategy)
            {
                this.strategy = strategy;
            }

        public void executePayment(int amount)
            {
                strategy.pay(amount);
            }
    }
class Main
    {
        public static void main(String []args)
            {
                System.out.println("Hi");
                payContext context = new payContext(new CCPayment());
                context.executePayment(1000);

                paymentStrategy strategy2 = new UPIpayment();
                payContext context2 = new payContext(strategy2);
                context2.executePayment(500);
            }
    }