public class Bankmain {

	public static void main(String[] args) {
				ICICIBank i = new ICICIBank();
				KotMBank k = new KotMBank();

				System.out.println(i.getSavingInterestRate());
				System.out.println(i.getFixedInterestRate());
				System.out.println(k.getSavingInterestRate());
				System.out.println(k.getFixedInterestRate());
				
				GeneralBank g1=new KotMBank();
				GeneralBank g2=new ICICIBank();
				
				System.out.println(g1.getSavingInterestRate());
				System.out.println(g1.getFixedInterestRate());
				System.out.println(g2.getSavingInterestRate());
				System.out.println(g2.getFixedInterestRate());
			}

		}