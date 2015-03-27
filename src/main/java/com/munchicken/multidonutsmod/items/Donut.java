package com.munchicken.multidonutsmod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Donut extends ItemDonuts{


    public Donut(){

        super("Donut", 2, 0.1f, false, new PotionEffect(Potion.moveSpeed.id, 1200,1));
    }

}
