object NestedIfElse extends RapBattle{

	object SNOOPDOG extends Rapper{
		name = "Snoop Dog";
	}

	def main(args: Array[String]): Unit = {
		SNOOPDOG YO; // 1
		EVERYBODY BOB_YA_HEAD 1; // if val == 1 
			ANOTHER ONE; // Val = 2
			I HAVE 5 STACKS;; // Val = 10
			EVERYBODY SQUAT 5;
				SPIT VERSE "Should Not Be In Here";
			STRAIGHT OUTTA COMPTON;
				HALF A MIL;
				SPIT VERSE "Should be 5, Nested If Else Works";
				SPIT FIRE;
			BOTTLES N MODELS;
		STRAIGHT OUTTA COMPTON; // Else 
			SPIT VERSE "You Should Not Be Here";
		BOTTLES N MODELS;// End IF
		SPIT FIRE;
	}
}