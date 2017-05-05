# Rap-Concert
Our "Rap Concert" language was implemented as an internal DSL.
We were inspired by the Shakespeare Programming Language (http://shakespearelang.sourceforge.net/)
and its unique twist on conventional languages. So, we decided to take a modern approach and developed
a hip-hop flavored programming language.

Each "rapper" functions as a value that can be modified based on which operations his "verses" contain.
"Verses" are singular to individual rappers and can contain mathematical operations, conditional statements, and loops.
We have also allowed users to input their own values to each rapper and to generate random values that can be assigned.
A series of operations is possible by chaining together multiple math operations with the keyword "AND."

We have included a variety of tests that showcase the functionalities of:
  - Math Operations [Math.scala]
  - Repeated Operations (e.g. val^2^2^2) [Repeating.scala]
  - Chained Operations [And.scala]
  - Conditionals [GuessingGame.scala]
  - Nested Conditionals [NestedIfElseTest.scala]
  - Loops [test.scala]

To compile RapBattle.scala and a test of your choice, use the following command IN THE SRC FOLDER:

    scalac -d ../bin/ -cp ../bin RapBattle.Scala TestName.scala

 
To run the test of your choice, SWITCH TO THE BIN FOLDER and run the following command:
 
    scala TestName
