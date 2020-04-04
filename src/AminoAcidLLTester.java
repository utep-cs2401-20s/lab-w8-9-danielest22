import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AminoAcidLLTester {
    String testCodon = "CGCUAAUUGCCU";
    String testCodon2 = "CGCUAAUUGUUC";
    String testCodon3 = "CGC";
    String testCodonEdge = "CGCUAAUUGUUCU";
    char[] aminoAcidTest3 = {'R'};
    char[] aminoAcidTest1 = {'R', 'E', 'V', 'A'};

    @Test
    public void test1() {//Give the sort method a string and use isSorted to check if the methods sort the string
        char[] aminoList = AminoAcidLL.createFromRNASequence(testCodon).aminoAcidList();//given amino acid list
        assertEquals(aminoAcidTest1, aminoList);//compare expected to actual output
    }

    @Test
    public void test2() {//Give testCodon and see if given back proper sequence of amino acids
        AminoAcidLL sortList = AminoAcidLL.createFromRNASequence(testCodon);
        assertTrue(AminoAcidLL.sort(sortList).isSorted());
    }

    @Test
    public void test3() {//Test the total count method by seeing if it prints out an output
        System.out.print(AminoAcidLL.createFromRNASequence(testCodon));
    }

    @Test
    public void test4() {//Given a codon see if the sort() sorts the list
        AminoAcidLL sortList = AminoAcidLL.createFromRNASequence(testCodon);
        System.out.print(AminoAcidLL.sort(sortList));
    }

    @Test
    public void test5() {//Test if codonCompare can successfully compare two lists
        AminoAcidLL sortList1 = AminoAcidLL.createFromRNASequence(testCodon);
        AminoAcidLL sortList2 = AminoAcidLL.createFromRNASequence(testCodon2);

        assertEquals(1, sortList1.codonCompare(sortList2));
    }

    @Test
    public void test6() {//Give the sort method a string and use isSorted to check if the methods sort the string
        AminoAcidLL sortList = AminoAcidLL.createFromRNASequence(testCodon2);
        assertTrue(AminoAcidLL.sort(sortList).isSorted());
    }

    @Test
    public void test7() {//Give testCodon and see if given back proper sequence of amino acids with 3 codons
        char[] aminoList = AminoAcidLL.createFromRNASequence(testCodon3).aminoAcidList();//given amino acid list
        assertEquals(aminoAcidTest3, aminoList);//compare expected to actual output
    }

    @Test
    public void test8() {//Test the total count method by seeing if it prints out an output
        System.out.print(AminoAcidLL.createFromRNASequence(testCodon2));
    }

    @Test
    public void test9() {//Given a codon see if the sort() sorts the list that has 4 codons
        AminoAcidLL sortList = AminoAcidLL.createFromRNASequence(testCodonEdge);
        System.out.print(AminoAcidLL.sort(sortList));
    }

    @Test
    public void test10() {//Test if codonCompare can successfully compare two lists
        AminoAcidLL sortList1 = AminoAcidLL.createFromRNASequence(testCodon);
        AminoAcidLL sortList2 = AminoAcidLL.createFromRNASequence(testCodon3);

        assertEquals(0, sortList1.codonCompare(sortList2));
    }
}


