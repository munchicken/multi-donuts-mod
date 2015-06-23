package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.creativetabs.ModCreativeTabs;
import com.munchicken.multidonutsmod.help.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public abstract class ItemFoodDonuts extends ItemFood{

    private PotionEffect[] effects;

    public ItemFoodDonuts(String name, int healAmount, float saturationModifier, boolean wolvesFavourite, PotionEffect... effects) {

        super(healAmount, saturationModifier, wolvesFavourite);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
        setCreativeTab(ModCreativeTabs.tabDonut);
        this.effects = effects;
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        for (int i = 0; i < this.effects.length; i++)
            if (!world.isRemote && this.effects[i] != null && this.effects[i].getPotionID() > 0)
                player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
    }
}
