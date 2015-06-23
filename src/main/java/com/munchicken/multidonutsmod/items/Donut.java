package com.munchicken.multidonutsmod.items;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Donut extends ItemFoodDonuts {


    public Donut(){
        //Test item
        super("Donut", 2, 0.1f, false, new PotionEffect(Potion.moveSpeed.id, 1200,1));
    }

}
