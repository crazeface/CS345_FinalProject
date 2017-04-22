class Rapper{	

/*
	import scala.collection.mutable.{HashMap, HashSet, Stack};
	import scala.collection.immutable.{TreeMap};

	// used for jump PCs
	private var index = Tuple3(0,0,0)
	// store all lines as Act->Scene->Line where line has all necessary data
	private var stmts = new java.util.TreeMap[Int, java.util.TreeMap[Int, java.util.List[Execution]]]();

	// used to keep track of characters on stage
	private var curSpeaker:Character = null;
	private var curListener:Character = null;
	private var curCharacters = HashSet.empty[Character];

	// used to keep track of what act and scene we are in during parsing
	private var curAct:Act = null;
	private var curScene:Scene = null;
*/
	// keeps track of last value computed
	private var num=1;

	// class MainFollowTrait{
	// 	def apply(i:IClass):IClass = i
	// }

    class MathFunctionBuilder{
    	def KEYS:MathFunctionBuilder = {num = num * 3; this}
    	def ONE:MathFunctionBuilder = {num = num + 1; this}
    	def apply(a:KeysClass):MathFunctionBuilder = {num = num * 3; this}
    	def apply(o:OneClass):MathFunctionBuilder = {num = num + 1; this}
    }

    class Builder{
    	def apply(g: TheClass):TheClass = g
    }
    class TheClass extends MathFunctionBuilder{}

	class IClass{
		def GOT:Builder = {
			new Builder
		}
	}

	class AnotherClass extends MathFunctionBuilder{}

    object I extends IClass{}
    // object GOT extends GotClass{}
    object THE extends TheClass{}
    object KEYS extends KeysClass{}
    object ONE extends OneClass{}
    object ANOTHER extends AnotherClass{}
    object RUN extends RunClass{}

    class RunClass {
    	println(num);
    }

    class OneClass{

    }

    class KeysClass{

    }

}

