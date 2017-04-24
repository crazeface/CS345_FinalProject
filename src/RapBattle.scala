class RapBattle{	

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
	
	private var num=1;
	private var currentRapper:Rapper = null;

	// class MainFollowTrait{
	// 	def apply(i:IClass):IClass = i
	// }

    class MathFunctionBuilder{
    	def KEYS:MathFunctionBuilder = {currentRapper.value = currentRapper.value * 3; this}
    	def ONE:MathFunctionBuilder = {currentRapper.value= currentRapper.value + 1; this}
    	def apply(a:KeysClass):MathFunctionBuilder = {currentRapper.value = currentRapper.value * 3; this}
    	def apply(o:OneClass):MathFunctionBuilder = {currentRapper.value = currentRapper.value + 1; this}
    }

    class Builder{
        def STACKS:Unit = {}
    	def apply(g: TheClass):TheClass = g;
        def apply(m: MilClass):MilClass = m;
    }

    class TheClass extends MathFunctionBuilder{}

	class IClass{
		def GOT:Builder = {
			new Builder
		}
        def GOT(i: Int):Builder = {
            currentRapper.value = i * currentRapper.value;
            new Builder;
        }
	}

    class HalfClass {
        def A:Builder = {
            new Builder
        }
    }

	class AnotherClass extends MathFunctionBuilder{}

    object I extends IClass{}
    object HALF extends HalfClass{}
    object THE extends TheClass{}
    object KEYS extends KeysClass{}
    object ONE extends OneClass{}
    object ANOTHER extends AnotherClass{}
    object SPIT extends SpitClass{}
    object STACKS extends StacksClass{}
    object MIL extends MilClass{}
    object AND extends AndClass{}

    class AndClass{
        
    }
    class MilClass{
        currentRapper.value = currentRapper.value/2;
    }

    class SpitClass{
        def STRING(s: String):Unit = {
            println(s);
        }
        def FIRE:Unit = {
            println(currentRapper.name);
            println(currentRapper.value);
        }
    }

    class OneClass{}

    class KeysClass{}

    class StacksClass{
        
    }

    class Rapper{
    	var name = "";
    	var value = 1;
        var conditional = false;

    	def YO:Unit = {
    		currentRapper = this;
    	}

    }

}

