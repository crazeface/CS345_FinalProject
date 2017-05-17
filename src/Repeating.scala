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
