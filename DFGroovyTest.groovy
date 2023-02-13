package com.groovy
///*
//import com.sun.rowset.internal.Row
//import groovy.json.JsonException
//import groovy.sql.DataSet
//
//import javax.script.ScriptContext
//import javax.script.ScriptEngine
//import javax.script.ScriptEngineManager
//import javax.script.ScriptException
//import java.nio.file.Path
//import java.nio.file.Paths
//
//public class DFGroovyTest {
//public static void main(String[] args) throws JsonException, ScriptException {
//    String master = "local[2]";
//    SparkConf sparkConf = new SparkConf1();
//    sparkConf.setAppName("Upload Framework");
//    sparkConf.setMaster(master);
//    SparkSession sparkSession = SparkSession.builder().config(sparkConf).getOrCreate();
//    DataSet stateDS = sparkSession.read().option("header","true").csv
//    stateDS.show(false);
//    Map<String, DataSet> dataSetMap = new HashMap<>();
//    DatasetMap.put("stateDS",stateDS);
//    ScriptEngineManager Manager = new ScriptEngineManager();
//    ScriptEngine engine = manager.getEngineByName(shortNmae: "groovy");
//    Bindins bindings = engine.getBindings(ScriptContext.GLOBAL_SCOPE);
//    engine.put("datasetMap",dataSetMap);
//    try {
//        List<String> lines = files.readAllLines(Paths.get(first: "src/groovy_dataset_script"));
//        String script = String.join(delimiter: "", lines);
//        Dataset<Row> ds = (Dataset<Row>) engine.eval(Script, engine.getContext());
//    }catch (Exception ex){
//        ex.printStackTrace();
//
//    }
//
//
//
//}
//
//
//}
//*/
//
///*def num =11
//if(num==10)
//    println"num is+VE"
//else
//    println("num is -ve")
//
////switch case
//def x=10
//def result = ''
//switch(x){
//
// case 0:
//        result ="x is zero"
//        break
//    case{x>0}:
//        result = "x is +ve"
//        break
//    case{x<0}:
//    result = "x is -ve"
//    break
//    default:
//        result = "invalid number"
//}
//println (result);
////loops
////for
////for(intilize, ) classic for loop
////int i=1
////for(i; i<=5; i++)
//  //  println i
//*/
////// for in
////def x = 0
////for ( i in 0..9 ) {
////    x += i
////}
////1.upto(5){println"$it"}
////5.times {println "$it"}
//////1.step(10,2){println "$it"}
//
//// iterate over a map
//def map = ['abc':1, 'def':2, 'xyz':3]
//x = 0
//for ( e in map ) {
//    x += e.value
//
//
//}
//println x
//while

//int i=1
//while(i<=5){
//    println i
//    i=i+1
//
//}
