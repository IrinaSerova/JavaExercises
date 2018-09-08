package com.irinaserova;

// import java.util.*;

public class MoneyMinTransactions {

    static class Expense{
        String spender;
        double amount;
        List<String> consumers;
        public Expense(String spender, double amount, String... consumers){
            this.spender = spender;
            this.amount = amount;
            this.consumers = Arrays.asList(consumers);
        }

    }

    static class Owed{
        String name;
        double amount;
        public Owed(String name, double amount){
            this.name = name;
            this.amount = amount;
        }
    }

    public static void main(String[] args){
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(new Expense("Sarah", 400, "Sarah", "John", "Bob", "Alice"));
        expenseList.add(new Expense("John", 100, "Bob", "Alice"));
        //make list of who owes how much.
        Map<String, Double> owes = new HashMap<>();
        for(Expense e:expenseList){
            double owedAmt = e.amount/e.consumers.size();
            for(String c : e.consumers){
                if(!e.spender.equals(c)){
                    if(owes.containsKey(c)){
                        owes.put(c, owes.get(c) + owedAmt);
                    }else{
                        owes.put(c, owedAmt);
                    }
                    if(owes.containsKey(e.spender)){
                        owes.put(e.spender, owes.get(e.spender) + (-1 * owedAmt));
                    }else{
                        owes.put(e.spender, (-1 * owedAmt));
                    }
                }
            }
        }
        //make transactions.
        // We need to settle all the negatives with positives. Make list of negatives. Order highest owed (i.e. the lowest negative) to least owed amount.
        List<Owed> owed = new ArrayList<>();
        for(String s : owes.keySet()){
            if(owes.get(s) < 0){
                owed.add(new Owed(s, owes.get(s)));
            }
        }
        Collections.sort(owed, new Comparator<Owed>() {
            @Override
            public int compare(Owed o1, Owed o2) {
                return Double.compare(o1.amount, o2.amount);
            }
        });
        //take the highest negative, settle it with the best positive match:
        // 1. a positive that is equal to teh absolute negative amount is the best match.  
        // 2. the greatest positive value is the next best match. 
        // todo not sure if this matching strategy gives the least number of transactions.
        for(Owed owedPerson: owed){
            while(owes.get(owedPerson.name) != 0){
                double negAmt = owes.get(owedPerson.name);
                //get the best person to settle with
                String s = getBestMatch(negAmt, owes);
                double posAmt = owes.get(s);
                if(posAmt > Math.abs(negAmt)){
                    owes.put(owedPerson.name, 0.0);
                    owes.put(s, posAmt - Math.abs(negAmt));
                    System.out.println(String.format("%s paid %s to %s", s, Double.toString((posAmt - Math.abs(negAmt))), owedPerson.name));
                }else{
                    owes.put(owedPerson.name, -1 * (Math.abs(negAmt) - posAmt));
                    owes.put(s, 0.0);
                    System.out.println(String.format("%s paid %s to %s", s, Double.toString(posAmt), owedPerson.name));
                }
            }
        }




    }

    private static String getBestMatch(double negAmount, Map<String, Double> owes){
        String greatestS = null;
        double greatestAmt = -1;
        for(String s: owes.keySet()){
            double amt = owes.get(s);
            if(amt > 0){
                if(amt == Math.abs(negAmount)){
                    return s;
                }else if(greatestS == null || amt > greatestAmt){
                    greatestAmt = amt;
                    greatestS = s;
                }
            }
        }
        return greatestS;
    }


}