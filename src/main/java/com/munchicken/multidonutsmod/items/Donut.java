package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.creativetabs.ModCreativeTabs;
import com.munchicken.multidonutsmod.help.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Donut extends ItemFood{

    private PotionEffect[] effects = new PotionEffect[1];

    public Donut() {

        super(2, 0.1f, false);
        setUnlocalizedName("Donut");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
        setCreativeTab(ModCreativeTabs.tabDonut);
        effects[0] = new PotionEffect(Potion.moveSpeed.id, 1200,1);
        this.setAlwaysEdible();
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        for (int i = 0; i < this.effects.length; i++)
            if (!world.isRemote && this.effects[i] != null && this.effects[i].getPotionID() > 0)
                player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
    }
}
