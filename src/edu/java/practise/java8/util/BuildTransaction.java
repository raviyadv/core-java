package edu.java.practise.java8.util;
import edu.java.practise.java8.model.Transaction;
import java.util.Arrays;
import java.util.List;
public class BuildTransaction {
    public List<Transaction> getListOfTrasaction(){
        return Arrays.asList(
                new Transaction(1000,"RS","IN","education"),
                new Transaction(1000,"RS","IN","saving"),
                new Transaction(4000,"RS","IN","personal"),
                new Transaction(2000,"RS","IN","education"),
                new Transaction(1000,"RS","IN","saving"),
                new Transaction(6000,"RS","IN","personal"),
                new Transaction(1000,"RS","IN","education"),
                new Transaction(7000,"RS","IN","saving"),
                new Transaction(3000,"RS","IN","personal"),
                new Transaction(4000,"RS","IN","saving"),
                new Transaction(1000,"US","US","personal"),
                new Transaction(1000,"US","US","saving"),
                new Transaction(2000,"US","US","education"),
                new Transaction(5000,"US","US","education"),
                new Transaction(6000,"US","US","saving"),
                new Transaction(7000,"US","US","personal"),
                new Transaction(1000,"US","US","education"),
                new Transaction(1000,"US","US","saving"),
                new Transaction(1000,"US","US","personal"),
                new Transaction(2000,"US","US","education"),
                new Transaction(3000,"US","US","education"),
                new Transaction(4000,"US","US","saving"),
                new Transaction(6000,"EU","EU","personal"),
                new Transaction(8000,"EU","EU","education"),
                new Transaction(2000,"EU","EU","saving"),
                new Transaction(2000,"EU","EU","personal"),
                new Transaction(3000,"EU","EU","education"),
                new Transaction(4000,"EU","EU","personal"),
                new Transaction(6000,"EU","EU","saving"),
                new Transaction(6000,"EU","EU","education"),
                new Transaction(7000,"EU","EU","saving"),
                new Transaction(2000,"EU","EU","personal"),
                new Transaction(8000,"EU","EU","saving"),
                new Transaction(8000,"EU","EU","education"),
                new Transaction(2000,"EU","EU","saving"),
                new Transaction(3000,"PO","EN","personal"),
                new Transaction(1000,"PO","EN","saving"),
                new Transaction(4000,"PO","EN","education"),
                new Transaction(6000,"PO","EN","saving")
                );
    }
}
