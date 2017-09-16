package accessmodifiers.chennai;

public class MyClassInChennai {

	public static void main(String[] args) {
		
		ClassWithNoAccessModifiers objectOfClassWithNoAccessModifier = new ClassWithNoAccessModifiers();
		
		System.out.println("I am accessing publicVariableInDefaultClass "+ objectOfClassWithNoAccessModifier.publicVariableInDefaultClass );
		//System.out.println("I am accessing privateVariableInDefaultClass "+ objectOfClassWithNoAccessModifier.privateVariableInDefaultClass );
		System.out.println("I am accessing protectedVariableInDefaultClass "+ objectOfClassWithNoAccessModifier.protectedVariableInDefaultClass );
		System.out.println("I am accessing defaultVariableInDefaultClass "+ objectOfClassWithNoAccessModifier.defaultVariableInDefaultClass );
		
		objectOfClassWithNoAccessModifier.publicMethodInDefaultClass();
		//objectOfClassWithNoAccessModifier.privateMethodInDefaultClass();
		objectOfClassWithNoAccessModifier.protectedMethodInDefaultClass();
		objectOfClassWithNoAccessModifier.defaultMethodInDefaultClass();
		
		ClassWithPublicAccessModifier objectOfClassWithPublicModifier = new ClassWithPublicAccessModifier();
		
		System.out.println("I am accessing publicVariableInPublicClass "+ objectOfClassWithPublicModifier.publicVariableInPublicClass );
		//System.out.println("I am accessing privateVariableInPublicClass "+ objectOfClassWithPublicModifier.privateVariableInPublicClass );
		System.out.println("I am accessing protectedVariableInPublicClass "+ objectOfClassWithPublicModifier.protectedVariableInPublicClass );
		System.out.println("I am accessing defaultVariableInPublicClass "+ objectOfClassWithPublicModifier.defaultVariableInPublicClass );
		
		objectOfClassWithPublicModifier.publicMethodInPublicClass();
		//objectOfClassWithPublicModifier.privateMethodInPublicClass();
		objectOfClassWithPublicModifier.protectedMethodInPublicClass();
		objectOfClassWithPublicModifier.defaultMethodInPublicClass();
		
	}

}
