

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

import org.junit.Test;

import com.BinaryTree;
import com.Association;

public class JunitTest {
    

    private BinaryTree tree = new BinaryTree();
    private Association association = new Association();

    @Test
    public void testManualAssociation() {
        association.manualAssociation("hello", "hola", tree);
        assertEquals("hola", tree.searchString("hello")[1]);
    }

    @Test
    public void testAutomaticAssociation() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("hola");
        ArrayList<ArrayList<String>> words2 = new ArrayList<ArrayList<String>>();
        words2.add(words);
        association.automaticAssociation(words2, tree);
        assertEquals("hola", tree.searchString("hello")[1]);
    }



}
