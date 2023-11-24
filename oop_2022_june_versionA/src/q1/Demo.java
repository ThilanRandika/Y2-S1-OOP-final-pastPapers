package q1;

public class Demo {

	public static void main(String[] args) {
		Pet squirrell =new Squirrel("Run3");
		squirrell.cuddle();
		squirrell.feed();
		squirrell . GetTotalpoints ( ) ;
		System.out.println();
		
		Pet squirrel2 =new Squirrel("Run5");
		squirrel2 . cuddle( ) ;
		squirrel2 . feed( ) ;
		squirrel2 . GetTotalpoints ( ) ;
		System.out.println();
		
		Pet garfield =new Cat();
		garfield.clean();
		garfield.cuddle();
		garfield . feed ( ) ;
		garfield . GetTotalpoints ( ) ;
		System.out.println();
		
		Pet parrotl =new Parrot("walk");
		parrotl . feed( ) ;
		parrotl . GetTotalpoints ( ) ;


	}

}
