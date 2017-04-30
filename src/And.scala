import scala.language.postfixOps;
object And extends RapBattle{

	object DJKHALED extends Rapper{
		name = "DJ Khaled";
	}
	object SNOOPDOGG extends Rapper{
		name = "Snoop Dogg";
	}

	def main(args: Array[String]): Unit = {
		SNOOPDOGG YO; 
			I HAVE 5 STACKS AND I GOT THE KEYS;	// Val = Val * 5 ^ 2
			SPIT VERSE "Should be 25";
			SPIT FIRE;
			I GOT THE KEYS AND I GOT THE KEYS;	// Val = Val ^ 2 ^ 2 
			SPIT VERSE "Should be 390625";
			SPIT FIRE;
			HALF A MIL AND HALF A MIL; // Val = Val % 2 % 2
			SPIT VERSE "Should be 1";
			SPIT FIRE;
	}
}