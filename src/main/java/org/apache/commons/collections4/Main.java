package org.apache.commons.collections4;

import org.apache.commons.collections4.comparators.ComparatorChain;

public class Main {
    public static void main(String[] args) throws Exception{
        //org.openjdk.jmh.Main.main(args);

        ComparatorChain<Object> chain = new ComparatorChain<>();
        System.out.println(chain);
    }
}
