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
object Math extends RapBattle{

	object DJKHALED extends Rapper{
		name = "DJ Khaled";
	}

	object SNOOPDOG extends Rapper{
		name = "Snoop Dog";
	}
	def main(args: Array[String]): Unit = {
		SNOOPDOG YO;
			I HAVE 5 STACKS; //Val= Val * 5
			I GOT THE KEYS;// Val= Val ^ 2 
			ANOTHER ONE; // val + 1
			SPIT VERSE "Should be 26"; // print 
			SPIT FIRE; // Print Val
			HALF A MIL ; //Val = Val % 2
			SPIT VERSE "Should be 0";
			SPIT FIRE; // print val

		DJKHALED YO I HAVE 6 STACKS; // curr rapper = dj khaled and val = val * 6 (6)
			I HAVE 7 STACKS; // DJ khaled.val * 7 (42)
			HALF A MIL; //Val = Val % 2
			ANOTHER ONE ONE ONE; //  DJ khaled.val + 3 (3)
			SPIT VERSE "Should be 3";
			SPIT FIRE; // print  DJ khaled.val
			I HAVE 7 STACKS; // DJ khaled.val *7 (6636)
			SPIT VERSE "Should be 21";
			SPIT FIRE;
			I LOST 5 HOMIES;
			SPIT VERSE "Should be 16";
			SPIT FIRE;
			I PICKED_UP 83 Gs;
			SPIT VERSE "Should be 99";
			SPIT FIRE;
			I GOT 99 PROBLEMS;
			SPIT VERSE "Should be 1";
			SPIT FIRE;
	}
}
