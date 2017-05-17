/*

   APPENDIX: How to apply the Apache License to your work.

      To apply the Apache License to your work, attach the following
      boilerplate notice, with the fields enclosed by brackets "{}"
      replaced with your own identifying information. (Don't include
      the brackets!)  The text should be enclosed in the appropriate
      comment syntax for the file format. We also recommend that a
      file or class name and description of purpose be included on the
      same "printed page" as the copyright notice for easier
      identification within third-party archives.

   Copyright {2017} {Jamie Xia, Calvin Liu, Aditya Prasad}

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/


import scala.language.postfixOps;
object NestedIfElse extends RapBattle{

	object SNOOPDOG extends Rapper{
		name = "Snoop Dog";
	}

	def main(args: Array[String]): Unit = {
		SNOOPDOG YO; // 1
		EVERYBODY BOB_YA_HEAD 1; // if val == 1 
			ANOTHER ONE; // Val = 2
			I HAVE 5 STACKS; // Val = 10
			EVERYBODY SQUAT 5;	//if val < 5
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
