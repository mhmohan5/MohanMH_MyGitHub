package accessmodifiers.chennai;

public class ClassWithPublicAccessModifier {

			public int publicVariableInPublicClass = 10;
			@SuppressWarnings("unused")
			private int privateVariableInPublicClass = 20;
			protected int protectedVariableInPublicClass = 30;
			int defaultVariableInPublicClass = 40;
						
			public void publicMethodInPublicClass()
			{
				System.out.println(" I am publicMethodInPublicClass ");
			}
			
			@SuppressWarnings("unused")
			private void privateMethodInPublicClass()
			{
				System.out.println(" I am privateMethodInPublicClass ");
			}

			protected void protectedMethodInPublicClass() {
				System.out.println("I am protectedMethodInPublicClass ");
			}
			
			void defaultMethodInPublicClass()
			{
				System.out.println("I am defaultMethodInPublicClass ");
				
			}
}
