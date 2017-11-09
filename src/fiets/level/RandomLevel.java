/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiets.level;

import java.util.Random;

/**
 *
 * @author Jerry
 */
public class RandomLevel extends Level {
    
    private static final Random random = new Random();
    
    public RandomLevel(int width, int height) {
        super(width, height);
    }
    
    @Override
    protected void generateLevel() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tilesInt[x+y*width] = random.nextInt(4);
            }
        }
        
    }
    
}
