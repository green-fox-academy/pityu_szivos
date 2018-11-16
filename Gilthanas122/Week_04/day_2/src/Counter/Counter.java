package Counter;

public class Counter {

    Integer field;

    public Counter(){
        this(0);
    }

    public Counter(int field){
        this.field = field;

    }

    public void add(int number){

        field = field + number;
    }

    public void add1(){
        field += 1;
    }

    public void get(){
        System.out.println(field);
    }

    public void reset(){

        field = 0;
    }


}


   /* Create Counter class
which has an integer field value
                when creating it should have a default value 0 or we can specify it when creating
        we can add(number) to this counter another whole number
        or we can add() without parameters just increasing the counter's value by one
        and we can get() the current value
        also we can reset() the value to the initial value*/
