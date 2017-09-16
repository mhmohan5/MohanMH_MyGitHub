package accessmodifiers.chennai;

class ClassWithNoAccessModifiers {
		
		public int publicVariableInDefaultClass  = 100;
		@SuppressWarnings("unused")
		private int privateVariableInDefaultClass = 200;
		protected int protectedVariableInDefaultClass = 300;
		int defaultVariableInDefaultClass = 400;
		
		public void publicMethodInDefaultClass()
		{
			System.out.println(" I am publicMethodInDefaultClass ");
		}
		
		@SuppressWarnings("unused")
		private void privateMethodInDefaultClass()
		{
			System.out.println(" I am privateMethodInDefaultClass ");
		}

		protected void protectedMethodInDefaultClass()
		{
			System.out.println("I am protectedMethodInDefaultClass ");
		}
		
		void defaultMethodInDefaultClass()
		{
			System.out.println("I am defaultMethodInDefaultClass ");
			
		}
}
