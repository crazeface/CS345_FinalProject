object Repeating extends RapBattle{

	object DJKHALED extends Rapper{
		name = "DJ Khaled";
	}
	object SNOOPDOGG extends Rapper{
		name = "Snoop Dogg";
	}

	def main(args: Array[String]): Unit = {
		DJKHALED YO;
			I HAVE 2 STACKS;	//Val = Val * 2
			I GOT THE KEYS;  //Val = Val ^ 2
			SPIT VERSE "Should be 4";
			SPIT FIRE;
			I GOT THE KEYS KEYS; //Val = Val ^ 2 ^ 2
			SPIT VERSE "Should be 256";
			SPIT FIRE;
		SNOOPDOGG YO;
			I HAVE 2 STACKS;
			I GOT THE KEYS KEYS KEYS; //Val = Val ^ 2 ^ 2 ^ 2
			SPIT VERSE "Should be 256";
			SPIT FIRE;
			ANOTHER ONE; //Val = Val + 1;
			ANOTHER ONE ONE; //Val = Val + 2;
			ANOTHER ONE ONE ONE; //Val = Val + 3;
			SPIT VERSE "Should be 262";
			SPIT FIRE;
			ANOTHER NEG; //Val = Val - 1;
			ANOTHER NEG NEG; //Val = Val - 2;
			ANOTHER NEG NEG NEG; //Val = Val - 3;
			SPIT VERSE "Should be 256";
			SPIT FIRE;
	}
}