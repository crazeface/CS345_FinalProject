class RapBattle{	


	import scala.collection.mutable.{Stack};
	//import scala.collection.immutable.{TreeMap}; HashMap, HashSet,
/*
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
	var conditionStack:Stack[Int] = new Stack[Int]
	private var num=1;
	private var currentRapper:Rapper = null;
    var firstRapper = true;
	// class MainFollowTrait{
	// 	def apply(i:IClass):IClass = i
	// }


    //TODO add ConjunctionClass Return types for these functions
    class MathFunctionBuilder{
        def ConjunctionClass:StartSentenceClass = {
            new StartSentenceClass
        }
        // def KEYS(c: ConjunctionClass):StartSentenceClass = {
        //     new StartSentenceClass
        // }
    	def KEYS:MathFunctionBuilder = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                currentRapper.value = currentRapper.value * 3; 
            }
            this;
            

        }
    	def ONE:MathFunctionBuilder = {
            if(conditionStack.top == 1 || conditionStack.size == 1) {
                currentRapper.value = currentRapper.value + 1; 
            }
            this;
            

        }
        def NEG:MathFunctionBuilder = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                currentRapper.value = currentRapper.value - 1; 
            }
            this;
            

        }
    	def apply(a:KeysClass):MathFunctionBuilder = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                currentRapper.value = currentRapper.value * 3; 
            }
            this;
            

        }
    	def apply(o:OneClass):MathFunctionBuilder = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                currentRapper.value = currentRapper.value + 1; 
            }
            this;
            

        }
        def apply(n:NegClass):MathFunctionBuilder = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                currentRapper.value = currentRapper.value - 1; 
            }
            this;
            

        }   
        def apply(c:ConjunctionClass):StartSentenceClass = {
            new StartSentenceClass
        }
    }

    class Builder{
        def STACKS(c:ConjunctionClass) = {
            new StartSentenceClass
        }


	    
        def STACKS:Unit = {}

        def THE:TheClass = {
            new TheClass
        }

        def A(m:MilClass) = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                currentRapper.value = currentRapper.value/2;
            }
            new MilClass
        }
    	def apply(g: TheClass):TheClass = g;
        def apply(m: MilClass):MilClass = m;
    }

    class TheClass extends MathFunctionBuilder{}

	class IClass{
        def apply(g: GotClass):Builder = {
            new Builder;
        }
        def GOT(t: TheClass):TheClass = {
            new TheClass
        }
        def GOT(i: Int):Builder = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                currentRapper.value = i * currentRapper.value;
            }
            new Builder;
        }
	}

    class HalfClass {
        def A:Builder = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                currentRapper.value = currentRapper.value/2;
            }
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
    object NEG extends NegClass{}
    object SPIT extends SpitClass{}
    object STACKS extends StacksClass{}
    object MIL extends MilClass{}
    object AND extends ConjunctionClass{}
    object GOT extends GotClass{}
    object EVERYBODY extends ConditionalsClass{}
    object STRAIGHT extends ElseClass{}
    object COMPTON extends ComptonClass{}
    object BOTTLES extends EndIfClass{}
    object MODELS extends ModelsClass{}

    class AndClass {}
    class GotClass {}
    class ComptonClass{}
    class ModelsClass{}


    class MilClass{
        def AND(h:HalfClass) = {
            new Builder;
        }
    }

    class SpitClass{
        def STRING(s: String):Unit = {
            if(conditionStack.top == 1 || conditionStack.size == 1){
                println(s);
            }
        }
        def FIRE:Unit = {
            //println(currentRapper.name);
            if(conditionStack.top == 1 || conditionStack.size == 1){
                println(currentRapper.value);
            }
        }
    }

    class OneClass{}

    class NegClass{}

    class KeysClass{}

    class StacksClass{}

    class StartSentenceClass {
        def apply(i: IClass):IClass = { // STACKS
            new IClass
        }
        def I:IClass = { // YO
            new IClass
        }
        def apply(s:SpitClass):SpitClass = {
            new SpitClass
        }
        def apply(h:HalfClass):HalfClass = {
            new HalfClass
        }
        def EVERYBODY:ConditionalsClass = {
            new ConditionalsClass
        }
        def STRAIGHT:ElseClass = {
            new ElseClass
        }
        def BOTTLES:EndIfClass = {
            new EndIfClass
        }

    }

    class ConditionalsClass{
        def JUMP(i:Int) = {

            if(currentRapper.value > i)
            {
                conditionStack.push(1);
            }
            else 
            {
                conditionStack.push(-1);
            }

        }
        def SQUAT(i:Int) = {
            if(currentRapper.value < i)
            {
                conditionStack.push(1);
            }
            else 
            {
                conditionStack.push(-1);
            }
        }
        def BOB_YA_HEAD(i:Int) = {
            if(currentRapper.value == i)
            {
                conditionStack.push(1);
            }
            else 
            {
                conditionStack.push(-1);
            }
        }
    }

    class ConjunctionClass {
        def apply(a:AndClass):StartSentenceClass = {
            new StartSentenceClass
        }
    }

    class ElseClass {
        def OUTTA(c: ComptonClass):Unit = {
            val topofstack:Int = conditionStack.pop;
            conditionStack.push(topofstack * -1);
        }
    }

    class EndIfClass {
        def N(m: ModelsClass):Unit = {
            conditionStack.pop;
        }
    }

    class Rapper{
    	var name = "";
    	var value = 1;
        var conditional = false;

    	def YO:StartSentenceClass = {
            if(firstRapper == true){
                conditionStack.push(1); 
                firstRapper = false;
            }

            if(conditionStack.top == 1 || conditionStack.size == 1){
                println()
        		currentRapper = this;
                print("Give it up for ")
                println(currentRapper.name)
                println()
            }
            new StartSentenceClass
    	}

    }

}

