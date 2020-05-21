/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kjpay
 */
public class DnD_Initiative_Battle_Test {
    @Test
    public void TestgetRandomNumber() {
        int random20 = Initiative_Battle.getRandomNumber(1, 20);
        int random12 = Initiative_Battle.getRandomNumber(1, 12);
        int random8 = Initiative_Battle.getRandomNumber(1, 8);
        boolean results20 = (random20 >= 1 && random20 <= 20);
        boolean results12 = (random12 >= 1 && random12 <= 12);
        boolean results8 = (random8 >= 1 && random8 <= 8);
        assertTrue(results20);
        assertTrue(results12);
        assertTrue(results8);        
    }
}
