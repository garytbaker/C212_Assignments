
public class MoneyTester {

		public static void main(String[] args)
		{
			YourMoney janMoney = new YourMoney();
			YourMoney febMoney = new YourMoney(100, "Mike");
			
			System.out.println(janMoney.getName() + " , " + janMoney.getValue());
			System.out.println(febMoney.getName() + " , " + febMoney.getValue());
			System.out.println(YourMoney.YEAR);
		}
}
