import scala.collection.mutable.{ HashMap, Stack};


class RapBattle{	

    
	var conditionStack:Stack[Int] = new Stack[Int]

	//Used to store all rappers
	var RapperTable = new HashMap[Int, Rapper];
	var rapperIndex = 0;

	private var num=1;
	private var currentRapper:Rapper = null;
    var firstRapper = true;

    //TODO change string to rap line
    var lines = new HashMap[Int,RapLine];
    var inWhile = false; 
    var current = 1;

    // Used to parse and evaluate in for loops
    abstract sealed class RapLine	
    case class LT(index: Int, compare: Int) extends RapLine //TODO skip everything until instance of else
    case class Break() extends RapLine
    case class Else(num: Int) extends RapLine
    case class EndIf(num: Int) extends RapLine
    case class End(num: Int) extends RapLine
    case class Print(num: Int) extends RapLine
    case class Sub(index: Int, num: Int) extends RapLine
    case class Mult(index: Int, num: Int) extends RapLine
    case class Div(index: Int, num: Int) extends RapLine
    case class Mod(index: Int) extends RapLine
    case class Incr(index: Int) extends RapLine
    case class PrintString(s: String) extends RapLine
    

    def gotoLine(line: Int) {
	def GeneralIf(bool: Boolean) = {
	    if(bool) {
		  gotoLine(line + 1);
	    } else {
		//false so skip until corresponding else 
		var changeLine = line + 1
		var count = 0; // for nested if else
		while(!(lines(changeLine).isInstanceOf[Else]) && count == 0) {
		    //skip all within if part
		    if(lines(changeLine).isInstanceOf[LT]) {
			 count += 1;
		    } else if(lines(changeLine).isInstanceOf[EndIf]) {
			 count -= 1;
		    }
		    changeLine = changeLine + 1;
		}
		// Dont want to reach Else part
		gotoLine(changeLine + 1);
	    }		
        }

	lines(line) match {
	    case End(_) => {
		    gotoLine(lines.keys.toList.sorted.head);
	    }
	    case LT(index, compare) => {
		    GeneralIf(RapperTable(index).value < compare);
	    }
	    case Mod(index) => {
           val temp = RapperTable(index).value % 2;
		   GeneralIf(temp == 0);
	    }
	    case Else(_) => {
		//Only reaches else if first if is false
		//So just need to skip until ifend
    		var changeLine = line + 1
    		var count = 0; //skip all if-elses in this else 
    		while(!lines(changeLine).isInstanceOf[EndIf] && count == 0) {
    		    if(lines(changeLine).isInstanceOf[LT]) {
    			   count += 1;
    		    } else if(lines(changeLine).isInstanceOf[EndIf]) {
    			    count -= 1;
    		    }
    		    changeLine = changeLine + 1;
    		} 
		    gotoLine(changeLine + 1);
	    }
	    case Break() => {
	    }
	    case Print(num: Int) => {
    		println(RapperTable(num).value);
    		gotoLine(line + 1);
	    }
	    case EndIf(_) => {
		    gotoLine(line + 1);
	    }
	    case Sub(index, num) => {
    		RapperTable(index).value = RapperTable(index).value - num;
    		gotoLine(line + 1);
	    }
	    case Mult(index, num) => {
    		RapperTable(index).value = RapperTable(index).value * num;
    		gotoLine(line + 1);
	    }
	    case Div(index, num) => {
    		RapperTable(index).value = RapperTable(index).value / num;
    		gotoLine(line + 1);
	    }
	    case Incr(index) => {
    		RapperTable(index).value = RapperTable(index).value + 1;
    		gotoLine(line + 1);
	    }
        case PrintString(s) => {
            println(s);
            gotoLine(line + 1);
        }


	}
    }


    //TODO add ConjunctionClass Return types for these functions
    class MathFunctionBuilder{
        def ConjunctionClass:StartSentenceClass = {
            new StartSentenceClass
        }
    	def KEYS:MathFunctionBuilder = {
            if(conditionStack.top == 1){
                currentRapper.value = scala.math.pow(currentRapper.value,2).toInt; 
            }
            this;
            

        }
    	def ONE:MathFunctionBuilder = {
            if(conditionStack.top == 1) {
		if(inWhile) {
		    lines(current) = Incr(currentRapper.index);
		    current += 1;
 		} else {
                    currentRapper.value = currentRapper.value + 1; 
		}
            }
            this;
            

        }
        def NEG:MathFunctionBuilder = {
            if(conditionStack.top == 1){
                currentRapper.value = currentRapper.value - 1; 
            }
            this;
            

        }
    	def apply(a:KeysClass):MathFunctionBuilder = {
            if(conditionStack.top == 1){
                currentRapper.value = scala.math.pow(currentRapper.value,2).toInt; 
            }
            this;
            

        }
    	def apply(o:OneClass):MathFunctionBuilder = {
            if(conditionStack.top == 1){
                currentRapper.value = currentRapper.value + 1; 
            }
            this;
            

        }
        def apply(n:NegClass):MathFunctionBuilder = {
            if(conditionStack.top == 1){
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
        def MIL:Unit = {

        }
        def A(m:MilClass) = {

          new MilClass
        }
        def HOMIES:Unit = {}
        def Gs:Unit = {}
        def PROBLEMS:Unit = {}
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
        def HAVE(i: Int):Builder = {
            if(conditionStack.top == 1){
        		if(inWhile) {
        		    lines(current) = Mult(currentRapper.index, i);
        		    current += 1;
        		} else {
                            currentRapper.value = currentRapper.value * i;
        		}
            }
            new Builder;
        }
        def GET(p: PaidClass):Unit = {
            if(conditionStack.top == 1){
                currentRapper.value = scala.io.StdIn.readInt;
            }
        }
        def LIKE(d: DatClass):Unit = {
            if(conditionStack.top == 1){
                val r = scala.util.Random;
                currentRapper.value = r.nextInt(currentRapper.value) + 1;            
            }

        }
        def LOST(i: Int):Builder = {
            if(conditionStack.top == 1){
        		if(inWhile) {
        		    lines(current) = Sub(currentRapper.index, i);
        		    current += 1;
        		} else {
                            currentRapper.value = currentRapper.value - i;
        		}
            }
            new Builder;
        }
        def PICKED_UP(i: Int):Builder = {
            if(conditionStack.top == 1){
                currentRapper.value = currentRapper.value + i;
            }
            new Builder;
        }
        def GOT(i: Int):Builder = {
            if(conditionStack.top == 1){
        		if(inWhile) {
        		    lines(current) = Div(currentRapper.index, i);
        		    current += 1;
        		} else {
                    currentRapper.value = currentRapper.value / i;
        		}
            }
            new Builder;
        }

	}

    class HalfClass {
        def A:Builder = {
          if(inWhile && conditionStack.top == 1) { 
            lines(current) = Mod(currentRapper.index);
            current += 1;
          } else {
                if(conditionStack.top == 1) {
                    if(currentRapper.value % 2 == 0) {
                        conditionStack.push(1);
                    } else {
                        conditionStack.push(-1);
                    }
                } else {
                    conditionStack.push(-2);
                }
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
    object PAID extends PaidClass{}
    object DAT extends DatClass{}
    object OUT extends StartSentenceClass{}
    object TWENTYFIVE extends TFClass{}
    object FO extends StartSentenceClass{}
    object PEACE extends StartSentenceClass{}
    object MY extends StartSentenceClass{}


    ///////////////////////////////////// EMPTY CLASSES///////////////////////////  ` 
    class AndClass {}
    class GotClass {}
    class ComptonClass{}
    class ModelsClass{}
    class PaidClass{}
    class DatClass{}
    class OneClass{}
    class NegClass{}
    class KeysClass{}
    class StacksClass{}
    class OutClass{}

    class TFClass{
        def SITTIN_ON(i: Int):Builder = {
            if(conditionStack.top == 1){
                currentRapper.value = i;
            }
            new Builder;
        }
    }


    class MilClass{
        def AND(h:HalfClass) = {
            new Builder;
        }
    }

    class SpitClass{
        def VERSE(s: String):Unit = {
            if(conditionStack.top == 1){
                if(inWhile) {
                    lines(current) = PrintString(s);
                    current += 1;
                } else {
                    println(s);
                }
            }
        }
        def FIRE:Unit = {
        	  if(inWhile && conditionStack.top == 1) {
        	    lines(current) = Print(currentRapper.index);
        	    current += 1;
        	  } else {
                    println(currentRapper.value);
        	  }
        }
    }



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
        def SHIZZLE = {
	    if(conditionStack.top == 1) {
              inWhile = true;
	    }
        }
        def NIZZLE = {
            if(!inWhile && conditionStack.top == 1) {
		      println("NON MATCHING WHILE LOOPS");
                //ERROR
            }
	        if(conditionStack.top == 1){
                inWhile = false;
        		lines(current) = End(current);
        		gotoLine(1);
    	    }
        }
        def OUT = {
    	    lines(current) = Break();
    	    current += 1;
            // TODO
        }

    }

    class ConditionalsClass{
        def JUMP(i:Int) = {
    	    if(conditionStack.top == 1){
                if(currentRapper.value > i) {
                    conditionStack.push(1);
                } else {
                    conditionStack.push(-1);
                }
    	    } else {
    		    conditionStack.push(-2);
   	        }
        }
        def SQUAT(i:Int) = {
    	  if(inWhile && conditionStack.top == 1) { 
    	    lines(current) = LT(currentRapper.index, i);
    	    current += 1;
    	  } else {
          	    if(conditionStack.top == 1) {
                    if(currentRapper.value < i) {
                        conditionStack.push(1);
                    } else {
                        conditionStack.push(-1);
                    }
        	    } else {
        		    conditionStack.push(-2);
          	    }
    	  }
        }
        def BOB_YA_HEAD(i:Int) = {
      	    if(conditionStack.top == 1) {
                if(currentRapper.value == i) {
                    conditionStack.push(1);
                } else {
                    conditionStack.push(-1);
                }
    	    } else {
    		    conditionStack.push(-2);
    	    }
        }
        def WAVE_YA_HAND(r:Rapper) = {
      	    if(conditionStack.top == 1) {
                if(currentRapper.value == r.value) {
                    conditionStack.push(1);
                } else {
                    conditionStack.push(-1);
                }
    	    } else {
    		    conditionStack.push(-2);
    	    }
        }
        def SHAKE_YA_BUTT(r:Rapper) = {
      	    if(conditionStack.top == 1) {
                if(currentRapper.value < r.value) {
                    conditionStack.push(1);
                } else {
                    conditionStack.push(-1);
                }
    	    } else {
    		    conditionStack.push(-2);
    	    }
        }
        def RAISE_THA_ROOF(r:Rapper) = {
      	    if(conditionStack.top == 1) {
                if(currentRapper.value > r.value) {
                    conditionStack.push(1);
                } else {
                    conditionStack.push(-1);
                }
    	    } else {
    		    conditionStack.push(-2);
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
    	  if(inWhile && conditionStack.top == 1) {
    	    lines(current) = Else(current);
    	    current += 1;
    	  } else {
                val topofstack:Int = conditionStack.pop;
                conditionStack.push(topofstack * -1);
    	  }
        }
    }

    class EndIfClass {
        def N(m: ModelsClass):Unit = {
	    if(inWhile && conditionStack.top == 1) {
	      lines(current) = EndIf(current);
	      current += 1;
	    } else {
              conditionStack.pop;
	    }
        }
    }

    class Rapper{
    	var name = "";
    	var value = 1;
        var conditional = false;
	    var index = -1;

    	def YO:StartSentenceClass = {
            if(firstRapper == true){
                conditionStack.push(1); 
                firstRapper = false;
            }
    	    if(this.index == -1){
    		RapperTable(rapperIndex) = this;
    		this.index = rapperIndex;
    		rapperIndex += 1;
	    }
            currentRapper = this;
            new StartSentenceClass
    	}

    }

}

